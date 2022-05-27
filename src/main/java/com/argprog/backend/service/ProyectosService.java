/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.argprog.backend.service;

import com.argprog.backend.Model.Proyectos;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.argprog.backend.repository.ProyectosRepository;

/**
 *
 * @author maern
 */
@Service
public class ProyectosService implements IProyectosService {
    
    @Autowired
    private ProyectosRepository argRepository;

    @Override
    public List<Proyectos> getProyectos() {
        List<Proyectos> listaProyectos = argRepository.findAll();
        return listaProyectos;
    }
  

    @Override
    public void saveProyectos(Proyectos exper) {
        argRepository.save(exper);
    }

    @Override
    public void deleteProyectos(Long id) {
        argRepository.deleteById(id);
        
    }

    @Override
    public Proyectos findProyectos(Long id) {
        //aca si no encuentro a la persona, devuelvo null por eso el orElse
        Proyectos exper = argRepository.findById(id).orElse(null);
        return exper;
    }
    
}
