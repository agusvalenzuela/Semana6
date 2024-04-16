package com.example.tiendaonline.controller;
import com.example.tiendaonline.model.Cliente;
import com.example.tiendaonline.service.ClienteService;

import java.util.List;
import java.util.Optional;


import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;

@RestController
@RequestMapping("/clientes") 
public class ClienteController {
    @Autowired
    private ClienteService clienteService;    

    @GetMapping()
    public List<Cliente> getClientes(){
        return clienteService.getClientes();
    }
    
    @GetMapping("/{clienteid}")
    public Optional<Cliente> getClienteById(@PathVariable Integer clienteid) {
        return clienteService.getClienteById(clienteid);
    }

    @PostMapping
    public Cliente createCliente(@RequestBody Cliente cliente){
        return clienteService.createCliente(cliente);
    }

    @PutMapping("/{clienteid}")
    public Cliente updateCliente(@PathVariable Integer clienteid, @RequestBody Cliente cliente) {
        return clienteService.updateCliente(clienteid, cliente);
    }
    
    @DeleteMapping("/{clienteid}") 
    public void deleteCliente(@PathVariable Integer clienteid){
        clienteService.deleteCliente(clienteid);
    }
    
}

