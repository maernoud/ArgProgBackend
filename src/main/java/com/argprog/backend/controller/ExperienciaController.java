/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.argprog.backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.argprog.backend.Model.Experiencia;
import com.argprog.backend.service.IExperienciaService;
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
public class ExperienciaController {
     @Autowired
    private IExperienciaService interExperiencia;
    
   
    @PostMapping("/new/experiencia")
    public void agregarExperiencia (@RequestBody Experiencia exper){
        //listaExperiencia.add(exper);
    }
   
    @GetMapping("/experiencia/traer")
    public List<Experiencia> getExperiencias(){
        return interExperiencia.getExperiencias();
    }
    @PostMapping("/experiencia/crear")
    public String createExperiencia(@RequestBody Experiencia exper){
        interExperiencia.saveExperiencia(exper);
        //devuelve un string avisando si se creo correctamente
        return "la experiencia fue creada correctamente";
    }
    
    @DeleteMapping ("/experiencia/borrar/{id}")
    public String deleteExperiencia (@PathVariable Long id){
        interExperiencia.deleteExperiencia(id);
        //devuelve un string avisando si se elimino correctamente
        return "La Experiencia fue eliminada correctamente";
    }
    
    @PutMapping("/personas/editar/{id}")
    public Experiencia editExperiencia(@PathVariable Long id,
                               @RequestParam ("company") String nuevoCompany,
                               @RequestParam ("position") String nuevoPosition,
                               @RequestParam("img") String nuevoImg,
                               @RequestParam("url") String nuevoUrl,
                               @RequestParam("years") String nuevoYears
                               ){
        //busco la persona en cuestión
        Experiencia exper = interExperiencia.findExperiencia(id);
        
        //esto tambien puede ir en service
        //para desacoplar mejor aun el codigo en un nuevo metodo
       exper.setCompany(nuevoCompany);
       exper.setPosition(nuevoPosition);
       exper.setImg(nuevoImg);
       exper.setUrl(nuevoUrl);
       exper.setYears(nuevoYears);
        
        interExperiencia.saveExperiencia(exper);
        
        return exper;
}
}
