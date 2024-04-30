package com.example.tiendaonline.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.example.tiendaonline.model.Cliente;
import com.example.tiendaonline.repository.ClienteRepository;

@ExtendWith(MockitoExtension.class)
public class ClienteServiceTest {
    @InjectMocks
    private ClienteServiceImpl pacienteServicio;

    @Mock
    private ClienteRepository pacienteRepositoryMock;

    @Test
    public void guardarPacienteTest(){
        //Arrange
        Cliente cliente = new Cliente();
        cliente.setClientenombre("Antonio Díaz");

        when(pacienteRepositoryMock.save(any())).thenReturn(cliente);

        //Act
        Cliente resultado = pacienteServicio.createCliente(cliente);

        //Assert
        assertEquals("Antonio Díaz", resultado.getClientenombre());
    }
}
