package br.com.alura.api.repository;

import br.com.alura.api.model.Doctor;
import br.com.alura.api.model.Patient;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient, Long> {
    Page<Doctor> findAllByIsActiveTrue(Pageable page);
    boolean existsByIdAndIsActiveTrue(Long id);
}
