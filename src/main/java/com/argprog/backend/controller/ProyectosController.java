/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.argprog.backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.argprog.backend.Model.Proyectos;
import com.argprog.backend.service.IProyectosService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


/**
 *
 * @author maern
 */
@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST, RequestMethod.DELETE, RequestMethod.PUT})
public class ProyectosController {
    @Autowired
    private IProyectosService interProyectos;
    
 
    @PostMapping("/new/proyecto")
    public void agregarProyectos (@RequestBody Proyectos exper){
        //listaProyectos.add(exper);
    }
   
    @GetMapping("/proyectos/traer")
    public List<Proyectos> getProyectoss(){
        return interProyectos.getProyectos();
    }
    @PostMapping("/proyectos/crear")
    public String createProyectos(@RequestBody Proyectos exper){
        interProyectos.saveProyectos(exper);
        //devuelve un string avisando si se creo correctamente
        return "la experiencia fue creada correctamente";
    }
    
    @DeleteMapping ("/proyectos/borrar/{id}")
    public String deleteProyectos (@PathVariable Long id){
        interProyectos.deleteProyectos(id);
        //devuelve un string avisando si se elimino correctamente
        return "La Proyectos fue eliminada correctamente";
    }
    
    @PutMapping("/proyectos/editar/{id}")
    public Proyectos editProyectos(@PathVariable Long id,
                               @RequestParam ("title") String nuevoTitle,
                               @RequestParam ("description") String nuevoDescription,
                               @RequestParam("img") String nuevoImg,
                               @RequestParam("url") String nuevoUrl
                               ){
        //busco la persona en cuestión
        Proyectos exper = interProyectos.findProyectos(id);
        
        //esto tambien puede ir en service
        //para desacoplar mejor aun el codigo en un nuevo metodo
       exper.setTitle(nuevoTitle);
       exper.setDescription(nuevoDescription);
       exper.setImg(nuevoImg);
       exper.setUrl(nuevoUrl);
       
        
        interProyectos.saveProyectos(exper);
        
        return exper;
}
    
}
