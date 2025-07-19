package br.com.alura.api.repository;

import br.com.alura.api.model.Doctor;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface DoctorRepository extends JpaRepository<Doctor, Long> {
    Optional<Object> findAllByActiveTrue(Pageable page);
}
