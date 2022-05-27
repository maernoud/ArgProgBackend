/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.argprog.backend.service;

import com.argprog.backend.Model.Educacion;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.argprog.backend.repository.EducacionRepository;

/**
 *
 * @author maern
 */
@Service
public class EducacionService implements IEducacionService{
    @Autowired
    private EducacionRepository eduRepository;

    @Override
    public List<Educacion> getEducacion() {
        List<Educacion> listaEducacion = eduRepository.findAll();
        return listaEducacion;
    }
  

    @Override
    public void saveEducacion(Educacion educ) {
        eduRepository.save(educ);
    }

    @Override
    public void deleteEducacion(Long id) {
        eduRepository.deleteById(id);
        
    }

    @Override
    public Educacion findEducacion(Long id) {
        //aca si no encuentro a la persona, devuelvo null por eso el orElse
        Educacion educ = eduRepository.findById(id).orElse(null);
        return educ;
    }
    
    
}
