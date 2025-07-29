package br.com.alura.api.controller;

import br.com.alura.api.model.dto.AppointmentDetailDTO;
import br.com.alura.api.model.dto.AppointmentSchedulingDTO;
import br.com.alura.api.model.enums.Specialty;
import br.com.alura.api.service.AppointmentService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.json.JacksonTester;
import org.springframework.boot.test.mock.mockito.MockBean; // Import necessário
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.test.web.servlet.MockMvc;

import java.time.LocalDateTime;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.any; // Import necessário
import static org.mockito.Mockito.when; // Import necessário
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;

@SpringBootTest
@AutoConfigureMockMvc
class AppointmentControllerTest {

    @Autowired
    private MockMvc mvc;

    @Autowired
    private JacksonTester<AppointmentSchedulingDTO> schedulingDTOJson;

    @Autowired
    private JacksonTester<AppointmentDetailDTO> detailDTOJson;

    @MockBean // Anotação para mockar o serviço
    private AppointmentService appointmentService;

    @Test
    @DisplayName("Deveria devolver codigo http 400 quando as informacoes estao invalidas")
    @WithMockUser
    void schedule_scenario1() throws Exception {
        // ... seu teste de erro 400 ...
        var response = mvc.perform(post("/appointments"))
                .andReturn().getResponse();

        assertThat(response.getStatus()).isEqualTo(HttpStatus.BAD_REQUEST.value());
    }


    @Test
    @DisplayName("Deveria devolver codigo http 201 quando as informacoes estao validas")
    @WithMockUser
    void schedule_scenario2() throws Exception {
        LocalDateTime date = LocalDateTime.now().plusHours(1);
        Specialty specialty = Specialty.CARDIOLOGY;

        AppointmentDetailDTO detailDTO = new AppointmentDetailDTO(null, 2L, 5L, date);
        when(appointmentService.schedule(any(AppointmentSchedulingDTO.class))).thenReturn(detailDTO);

        var response = mvc.perform(
                        post("/appointments")
                                .contentType(MediaType.APPLICATION_JSON)
                                .content(schedulingDTOJson.write(
                                        new AppointmentSchedulingDTO(2L, 5L, date, specialty)
                                ).getJson())
                )
                .andReturn().getResponse();

        assertThat(response.getStatus()).isEqualTo(HttpStatus.CREATED.value());

        String expectedJson = detailDTOJson.write(detailDTO).getJson();
        assertThat(response.getContentAsString()).isEqualTo(expectedJson);
    }
}