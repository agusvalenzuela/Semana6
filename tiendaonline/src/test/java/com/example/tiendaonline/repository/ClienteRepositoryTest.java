package com.example.tiendaonline.repository;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import com.example.tiendaonline.model.Cliente;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class ClienteRepositoryTest {
    @Autowired
    private ClienteRepository clienteRepository;

    @Test
    public void guardarPacienteTest(){
        //Arrange
        Cliente cliente = new Cliente();
        cliente.setClientenombre("Andrea González");

        //Act
        Cliente resultado = clienteRepository.save(cliente);

        //Assert
        assertNotNull(resultado.getClienteid());
        assertEquals("Andrea González", resultado.getClientenombre());
    }
}