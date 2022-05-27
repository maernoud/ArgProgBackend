/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.argprog.backend.service;

/**
 *
 * @author maern
 * 
 */
import com.argprog.backend.Model.Experiencia;
import java.util.List;

public interface IExperienciaService {
    
     public List<Experiencia> getExperiencias();
    
    //metodo para dar de alta una persona
    public void saveExperiencia (Experiencia exper);
    
    //metodo para borrar una persona
    public void deleteExperiencia (Long id);
    
    //metodo para encontrar una persona
    public Experiencia findExperiencia (Long id);
}
    

