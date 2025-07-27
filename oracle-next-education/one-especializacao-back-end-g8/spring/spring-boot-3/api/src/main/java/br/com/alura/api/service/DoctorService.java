package br.com.alura.api.service;

import br.com.alura.api.model.Doctor;
import br.com.alura.api.model.dto.DoctorListDTO;
import br.com.alura.api.model.dto.DoctorDTO;
import br.com.alura.api.model.dto.DoctorUpdateDTO;
import br.com.alura.api.model.mapper.DoctorMapper;
import br.com.alura.api.repository.DoctorRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class DoctorService {
    private final DoctorRepository doctorRepository;
    private final DoctorMapper doctorMapper;

    public DoctorService(DoctorRepository doctorRepository, DoctorMapper doctorMapper) {
        this.doctorRepository = doctorRepository;
        this.doctorMapper = doctorMapper;
    }

    @Transactional
    public DoctorDTO createDoctor(DoctorDTO dto){
        Doctor doctor = doctorMapper.toEntity(dto);
        Doctor savedDoctor = doctorRepository.save(doctor);
        return doctorMapper.toDTO(savedDoctor);
    }

    public Page<DoctorListDTO> listDoctors(Pageable page) {
        return doctorRepository.findAllByActiveTrue(page).map(DoctorListDTO::new);
    }

    @Transactional
    public DoctorDTO updateDoctor(DoctorUpdateDTO data) {
        Doctor doctor = doctorRepository.findById(data.id())
                .orElseThrow(() -> new EntityNotFoundException("Médico com ID " + data.id() + " não encontrado."));

        doctor.updateDoctor(data);
        return doctorMapper.toDTO(doctorRepository.save(doctor));
    }

    @Transactional
    public void deactivateDoctor(Long id) {
        Doctor doctor = doctorRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Médico com ID " + id + " não encontrado."));
        doctor.setActive(false);
    }

    public DoctorDTO findDoctorById(Long id) {
        Doctor doctor = doctorRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Médico com ID " + id + " não encontrado."));
        return doctorMapper.toDTO(doctor);
    }
}