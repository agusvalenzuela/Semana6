package com.example.tiendaonline.controller;
import com.example.tiendaonline.model.Cliente;

import java.util.List;
import java.util.ArrayList;

import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
public class ClienteController {
    private List<Cliente> clientes = new ArrayList<>();

    /* public ClienteController(){
        clientes.add(new Cliente(1, 186168844, "Agustin Navarro Diaz", "anavarro@gmail.com", "La estrella 123, Santiago", "Cliente", "M"));
        clientes.add(new Cliente(2, 106168844, "Martina Diaz Erazo", "mdiaz@gmail.com", "La constitucion 123, Santiago", "Cliente", "F"));
        clientes.add(new Cliente(1, 86168454, "Carla Espinoza Diez", "cespinoza@gmail.com", "Andalucia 234, Santiago", "Cliente", "F"));
    } */

    @GetMapping("/clientes")
    public List<Cliente> getCliente(){
        return clientes;
    }

    @GetMapping("/clientes/{clienteid}")
    public Cliente getClienteById(@PathVariable int clienteid){
        for (Cliente cliente : clientes){
            if (cliente.getClienteid() == clienteid){
                return cliente;
            }
        }
        return null;
    }
        
}