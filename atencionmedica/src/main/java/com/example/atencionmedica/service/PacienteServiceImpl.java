package com.example.atencionmedica.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.atencionmedica.model.Paciente;
import com.example.atencionmedica.repository.PacienteRepository;

import java.util.List;
import java.util.Optional;


@Service
public class PacienteServiceImpl implements PacienteService{
    @Autowired
    private PacienteRepository pacienteRepository;

    @Override
    public List<Paciente> getPacientes() {
        return pacienteRepository.findAll();
    }

    @Override
    public Optional<Paciente> getPacienteById(Integer id){
        return pacienteRepository.findById(id);
    }

    @Override
    public Paciente createPaciente(Paciente paciente){
        return pacienteRepository.save(paciente);
    }

    @Override
    public Paciente updatePaciente(Integer pacienteid, Paciente paciente){
        if(pacienteRepository.existsById(pacienteid)){
            paciente.setPacienteid(pacienteid);
            return pacienteRepository.save(paciente);
        }
        else{
            return null;
        }
        }
    
    @Override
    public void deletePaciente(Integer pacienteid){
        pacienteRepository.deleteById(pacienteid);
    }
}
