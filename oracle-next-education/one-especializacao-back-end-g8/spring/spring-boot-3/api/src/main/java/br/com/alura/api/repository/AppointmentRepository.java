package br.com.alura.api.repository;

import br.com.alura.api.model.Appointment;
import br.com.alura.api.model.Doctor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;

public interface AppointmentRepository extends JpaRepository<Appointment, Long> {
    boolean existsByDoctorIdAndDate(Long doctorId, LocalDateTime date);
    boolean existsByPatientIdAndDateBetween(Long patientId, LocalDateTime startOfDay, LocalDateTime endOfDay);
}
