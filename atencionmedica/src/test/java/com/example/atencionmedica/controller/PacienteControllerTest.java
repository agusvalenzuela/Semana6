package com.example.atencionmedica.controller;

import static org.mockito.Mockito.when;
import java.util.Arrays;
import java.util.List;

import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import com.example.atencionmedica.model.Paciente;
import com.example.atencionmedica.service.PacienteServiceImpl;

@WebMvcTest(PacienteController.class)
public class PacienteControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private PacienteServiceImpl pacienteServicioMock;

    @Test
    public void obtenerTodosTest() throws Exception{
        //Arrange
        Paciente paciente1 = new Paciente();
        paciente1.setPacientenombre("Alicia Castro");
        Paciente paciente2  = new Paciente();
        paciente2.setPacientenombre("Andrés Contreras");
        List<Paciente> pacientes = Arrays.asList(paciente1, paciente2);
        when(pacienteServicioMock.getPacientes()).thenReturn(pacientes);

        //Act & Assert
        mockMvc.perform(MockMvcRequestBuilders.get("/pacientes"))
									.andExpect(MockMvcResultMatchers.status().isOk())
									.andExpect(MockMvcResultMatchers.jsonPath("$", Matchers.hasSize(2)))
									.andExpect(MockMvcResultMatchers.jsonPath("$[0].name", Matchers.is("Alicia Castro")))
									.andExpect(MockMvcResultMatchers.jsonPath("$[0].name", Matchers.is("Andrés Contreras")));
    }
}
