/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.argprog.backend.service;

import com.argprog.backend.Model.About;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.argprog.backend.repository.AboutRepository;

/**
 *
 * @author maern
 */

@Service
public class AboutService implements IAboutService{
     @Autowired
    private AboutRepository argRepository;

    @Override
    public List<About> getAbout() {
        List<About> listaAbout = argRepository.findAll();
        return listaAbout;
    }
  

    @Override
    public void saveAbout(About exper) {
        argRepository.save(exper);
    }

    @Override
    public void deleteAbout(Long id) {
        argRepository.deleteById(id);
        
    }

    @Override
    public About findAbout(Long id) {
        //aca si no encuentro a la persona, devuelvo null por eso el orElse
        About exper = argRepository.findById(id).orElse(null);
        return exper;
    }
    
    
}
