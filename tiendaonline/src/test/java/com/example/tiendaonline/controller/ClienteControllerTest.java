package com.example.tiendaonline.controller;

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

import com.example.tiendaonline.model.Cliente;
import com.example.tiendaonline.service.ClienteServiceImpl;

@WebMvcTest(ClienteController.class)
public class ClienteControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private ClienteServiceImpl clienteServicioMock;

    @Test
    public void obtenerTodosTest() throws Exception{
        //Arrange
        Cliente cliente1 = new Cliente();
        cliente1.setClientenombre("Alicia Castro");
        cliente1.setClientecorreo("acastro@gmail.com");
        cliente1.setClientegenero("M");
        cliente1.setClienterut(145698741);
        cliente1.setClientedireccion("Los Lirios 12");
        cliente1.setClienteid(1);
        Cliente cliente2  = new Cliente();
        cliente2.setClientenombre("Andrés Contreras");
        cliente1.setClientecorreo("acontreras@gmail.com");
        cliente1.setClientegenero("M");
        cliente1.setClienterut(145698723);
        cliente1.setClientedireccion("Los Lirios 17");
        cliente1.setClienteid(2);
        List<Cliente> clientes = Arrays.asList(cliente1, cliente2);
        when(clienteServicioMock.getClientes()).thenReturn(clientes);

        //Act & Assert
        mockMvc.perform(MockMvcRequestBuilders.get("/clientes"))
									.andExpect(MockMvcResultMatchers.status().isOk())
									//.andExpect(MockMvcResultMatchers.jsonPath("$", Matchers.hasSize(2)))
									.andExpect(MockMvcResultMatchers.jsonPath("$[0].name", Matchers.is("Alicia Castro")))
									.andExpect(MockMvcResultMatchers.jsonPath("$[1].name", Matchers.is("Andrés Contreras")));
    }
}
