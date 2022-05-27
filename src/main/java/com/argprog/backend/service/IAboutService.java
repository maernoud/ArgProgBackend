/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.argprog.backend.service;

import com.argprog.backend.Model.About;
import java.util.List;

/**
 *
 * @author maern
 */
public interface IAboutService {
     public List<About> getAbout();
    
    //metodo para dar de alta una persona
    public void saveAbout (About exper);
      
    public void deleteAbout (Long id);
    
     
    //metodo para encontrar una persona
    public About findAbout (Long id);
    
}
