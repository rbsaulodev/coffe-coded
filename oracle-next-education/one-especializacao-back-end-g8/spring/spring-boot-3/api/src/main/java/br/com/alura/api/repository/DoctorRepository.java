package br.com.alura.api.repository;

import br.com.alura.api.model.Doctor;
import br.com.alura.api.model.enums.Specialty;
import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.NotNull;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.time.LocalDateTime;

public interface DoctorRepository extends JpaRepository<Doctor, Long> {
    Page<Doctor> findAllByIsActiveTrue(Pageable pageable);

    @Query("""
        SELECT d FROM Doctor d
        WHERE
            d.isActive = true
        AND
            d.specialty = :specialty
        AND
            d.id NOT IN (
                SELECT a.doctor.id FROM Appointment a
                WHERE
                a.date = :date
            )
        ORDER BY FUNCTION('RANDOM')
    """)
    Doctor chooseFreeRandomDoctorOnDate(Specialty specialty, @NotNull @Future LocalDateTime date);

    boolean existsByIdAndIsActiveTrue(Long id);
}