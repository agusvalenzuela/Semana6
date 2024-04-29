package com.example.atencionmedica.repository;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import com.example.atencionmedica.model.Paciente;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class PacienteRepositoryTest {
    @Autowired
    private PacienteRepository pacienteRepository;

    @Test
    public void guardarPacienteTest(){
        //Arrange
        Paciente paciente = new Paciente();
        paciente.setPacientenombre("Andrea González");

        //Act
        Paciente resultado = pacienteRepository.save(paciente);

        //Assert
        assertNotNull(resultado.getPacienteid());
        assertEquals("Andrea González", resultado.getPacientenombre());
    }
}
