/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.argprog.backend.service;

/**
 *
 * @author maern
 */
import com.argprog.backend.Model.Experiencia;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.argprog.backend.repository.ExperienciaRepository;

@Service
public class ExperienciaService implements IExperienciaService{
    @Autowired
    private ExperienciaRepository argRepository;

    @Override
    public List<Experiencia> getExperiencias() {
        List<Experiencia> listaExperiencia = argRepository.findAll();
        return listaExperiencia;
    }
  

    @Override
    public void saveExperiencia(Experiencia exper) {
        argRepository.save(exper);
    }

    @Override
    public void deleteExperiencia(Long id) {
        argRepository.deleteById(id);
        
    }

    @Override
    public Experiencia findExperiencia(Long id) {
        //aca si no encuentro a la persona, devuelvo null por eso el orElse
        Experiencia exper = argRepository.findById(id).orElse(null);
        return exper;
    }
    
}
