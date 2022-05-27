/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.argprog.backend.service;

import com.argprog.backend.Model.Educacion;
import java.util.List;

/**
 *
 * @author maern
 */
public interface IEducacionService {
    public List<Educacion> getEducacion();
    
    //metodo para dar de alta una persona
    public void saveEducacion (Educacion exper);
    
    //metodo para borrar una persona
    public void deleteEducacion (Long id);
    
    //metodo para encontrar una persona
    public Educacion findEducacion (Long id);
    
}
