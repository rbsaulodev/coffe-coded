package br.com.alura.api.repository;

import br.com.alura.api.model.Appointment;
import br.com.alura.api.model.Doctor;
import br.com.alura.api.model.Patient;
import br.com.alura.api.model.dto.AddressDTO;
import br.com.alura.api.model.dto.PatientRegistrationDTO;
import br.com.alura.api.model.dto.DoctorRegistrationDTO;
import br.com.alura.api.model.enums.Specialty;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.ActiveProfiles;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.TemporalAdjusters;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@ActiveProfiles("test")
class DoctorRepositoryTest {

    @Autowired
    private DoctorRepository doctorRepository;

    @Autowired
    private TestEntityManager em;

    @Test
    @DisplayName("Cenário 1: Deveria devolver null quando unico medico cadastrado nao esta disponivel na data")
    void chooseFreeRandomDoctorOnDateCenaryOne() {
        LocalDateTime nextMondayAt10 = LocalDate.now()
                .with(TemporalAdjusters.next(DayOfWeek.MONDAY))
                .atTime(10, 0);
        var doctor = registerDoctor("Dr. House", "house@example.com", "123456", Specialty.CARDIOLOGY);
        var patient = registerPatient("John Doe", "john.doe@example.com", "12345678900");
        scheduleAppointment(doctor, patient, nextMondayAt10);

        var freeDoctor = doctorRepository.chooseFreeRandomDoctorOnDate(Specialty.CARDIOLOGY, nextMondayAt10);
        assertThat(freeDoctor).isNull();
    }

    @Test
    @DisplayName("Cenário 2: Deveria devolver o médico quando ele está disponível na data")
    void chooseFreeRandomDoctorOnDateCenaryTwo() {
        LocalDateTime nextMondayAt10 = LocalDate.now()
                .with(TemporalAdjusters.next(DayOfWeek.MONDAY))
                .atTime(10, 0);

        var doctor = registerDoctor("Dr. House", "house@example.com", "123456", Specialty.CARDIOLOGY);
        var freeDoctor = doctorRepository.chooseFreeRandomDoctorOnDate(Specialty.CARDIOLOGY, nextMondayAt10);
        assertThat(freeDoctor).isEqualTo(doctor);
    }


    private void scheduleAppointment(Doctor doctor, Patient patient, LocalDateTime date) {
        em.persist(new Appointment(null, doctor, patient, date));
    }


    private Doctor registerDoctor(String name, String email, String crm, Specialty specialty) {
        var address = new AddressDTO("Rua Teste", "Bairro Teste", "12345678", "Cidade Teste", "TS", 0, null);

        var doctorDTO = new DoctorRegistrationDTO(
                name,
                email,
                "11999999999",
                crm,
                specialty,
                address
        );

        var doctor = new Doctor(doctorDTO);
        em.persist(doctor);
        return doctor;
    }
    private Patient registerPatient(String name, String email, String cpf) {
        var patient = new Patient(new PatientRegistrationDTO(name, email, "11999999999", cpf, null));
        em.persist(patient);
        return patient;
    }
}