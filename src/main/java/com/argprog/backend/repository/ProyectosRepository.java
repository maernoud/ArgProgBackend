/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.argprog.backend.repository;

import com.argprog.backend.Model.Proyectos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


/**
 *
 * @author maern
 */
@Repository
public interface ProyectosRepository extends JpaRepository <Proyectos, Long>{
    
}
