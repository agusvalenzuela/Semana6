package com.example.tiendaonline.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.tiendaonline.model.Cliente;
import com.example.tiendaonline.repository.ClienteRepository;

import java.util.List;
import java.util.Optional;


@Service
public class ClienteServiceImpl implements ClienteService{
    @Autowired
    private ClienteRepository clienteRepository;

    @Override
    public List<Cliente> getClientes() {
        return clienteRepository.findAll();
    }

    @Override
    public Optional<Cliente> getClienteById(Integer id){
        return clienteRepository.findById(id);
    }

    @Override
    public Cliente createCliente(Cliente cliente){
        return clienteRepository.save(cliente);
    }

    @Override
    public Cliente updateCliente(Integer clienteid, Cliente cliente){
        if(clienteRepository.existsById(clienteid)){
            cliente.setClienteid(clienteid);
            return clienteRepository.save(cliente);
        } else{
            return null;
        }
    }
    
    @Override
    public void deleteCliente(Integer clienteid){
        clienteRepository.deleteById(clienteid);
    }
}

