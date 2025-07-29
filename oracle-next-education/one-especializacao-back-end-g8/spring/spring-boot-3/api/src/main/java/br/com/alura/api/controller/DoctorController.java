package br.com.alura.api.controller;

import br.com.alura.api.model.dto.DoctorDTO;
import br.com.alura.api.model.dto.DoctorListDTO;
import br.com.alura.api.model.dto.DoctorUpdateDTO;
import br.com.alura.api.service.DoctorService;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import jakarta.validation.Valid;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping("/doctors")
@SecurityRequirement(name = "bearer-key")
public class DoctorController {

    private final DoctorService doctorService;

    public DoctorController(DoctorService doctorService) {
        this.doctorService = doctorService;
    }

    @PostMapping
    public ResponseEntity<DoctorDTO> register(@RequestBody @Valid DoctorDTO json, UriComponentsBuilder uriBuilder){
        DoctorDTO createdDoctor = doctorService.createDoctor(json);
        URI uri = uriBuilder.path("/doctors/{id}").buildAndExpand(createdDoctor.id()).toUri();
        System.out.println("Doutor registrado: " + createdDoctor);
        return ResponseEntity.created(uri).body(createdDoctor);
    }

    @GetMapping
    public ResponseEntity<Page<DoctorListDTO>> listAllDoctors(
            @PageableDefault(size = 10, sort = {"name"}) Pageable page
    ){
        Page<DoctorListDTO> doctor = doctorService.listDoctors(page);
        return ResponseEntity.ok(doctor);
    }

    @PutMapping
    public ResponseEntity<DoctorDTO> updateDoctor(@RequestBody @Valid DoctorUpdateDTO data) {
        DoctorDTO updatedDoctor = doctorService.updateDoctor(data);
        return ResponseEntity.ok(updatedDoctor);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deactivateDoctor(@PathVariable Long id) {
        doctorService.deactivateDoctor(id);
        return ResponseEntity.noContent().build();
    }


    @GetMapping("/{id}")
    public ResponseEntity<DoctorDTO> getDoctorById(@PathVariable Long id) {
        DoctorDTO doctor = doctorService.findDoctorById(id);
        return ResponseEntity.ok(doctor);
    }
}