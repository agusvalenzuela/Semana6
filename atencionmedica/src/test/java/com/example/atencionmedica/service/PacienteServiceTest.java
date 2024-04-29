package com.example.atencionmedica.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.example.atencionmedica.model.Paciente;
import com.example.atencionmedica.repository.PacienteRepository;

@ExtendWith(MockitoExtension.class)
public class PacienteServiceTest {
    @InjectMocks
    private PacienteServiceImpl pacienteServicio;

    @Mock
    private PacienteRepository pacienteRepositoryMock;

    @Test
    public void guardarPacienteTest(){
        //Arrange
        Paciente paciente = new Paciente();
        paciente.setPacientenombre("Antonio Díaz");

        when(pacienteRepositoryMock.save(any())).thenReturn(paciente);

        //Act
        Paciente resultado = pacienteServicio.createPaciente(paciente);

        //Assert
        assertEquals("Antonio Díaz", resultado.getPacientenombre());
    }
}
