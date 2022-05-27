/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.argprog.backend.service;

import com.argprog.backend.Model.Proyectos;
import java.util.List;

/**
 *
 * @author maern
 */
public interface IProyectosService {
     public List<Proyectos> getProyectos();
    
    //metodo para dar de alta una persona
    public void saveProyectos (Proyectos exper);
    
    //metodo para borrar una persona
    public void deleteProyectos (Long id);
    
    //metodo para encontrar una persona
    public Proyectos findProyectos (Long id);
}
