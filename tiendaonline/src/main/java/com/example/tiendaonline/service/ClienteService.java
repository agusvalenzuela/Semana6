package com.example.tiendaonline.service;

import java.util.List;
import java.util.Optional;

import com.example.tiendaonline.model.Cliente;

//Declaración de servicios
public interface ClienteService {
    List<Cliente> getClientes();
    Optional<Cliente> getClienteById(Integer id);
    Cliente createCliente(Cliente cliente);
    Cliente updateCliente(Integer clienteid, Cliente cliente);
    void deleteCliente(Integer clienteid);
}







