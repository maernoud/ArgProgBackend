/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.argprog.backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.argprog.backend.Model.Educacion;
import com.argprog.backend.service.IEducacionService;
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
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
public class EducacionController {
     @Autowired
    private IEducacionService interEducacion;
    
     @GetMapping ("/hello")
     public String Hola(){
         return "Hola! Servidor funcioando";
     }
     
     @PostMapping("/new/educacion")
    public void agregarEducacion (@RequestBody Educacion educ){
        //listaEducacion.add(educ);
    }
   
    @GetMapping("/educacion/traer")
    public List<Educacion> getEducacion(){
        return interEducacion.getEducacion();
    }
    @PostMapping("/educacion/crear")
    public String createEducacion(@RequestBody Educacion educ){
        interEducacion.saveEducacion(educ);
        //devuelve un string avisando si se creo correctamente
        return "la educiencia fue creada correctamente";
    }
    
    @DeleteMapping ("/educacion/borrar/{id}")
    public String deleteEducacion (@PathVariable Long id){
        interEducacion.deleteEducacion(id);
        //devuelve un string avisando si se elimino correctamente
        return "La Educacion fue eliminada correctamente";
    }
    
    @PutMapping("/educacion/editar/{id}")
    public Educacion editEducacion(@PathVariable Long id,
                               @RequestParam ("shool") String nuevoSchool,
                               @RequestParam ("career") String nuevoCareer,
                               @RequestParam("img") String nuevoImg,
                               @RequestParam("url") String nuevoUrl,
                               @RequestParam("years") String nuevoYears
                               ){
        //busco la persona en cuestión
        Educacion educ = interEducacion.findEducacion(id);
        
        //esto tambien puede ir en service
        //para desacoplar mejor aun el codigo en un nuevo metodo
       educ.setSchool(nuevoSchool);
       educ.setCareer(nuevoCareer);
       educ.setImg(nuevoImg);
       educ.setUrl(nuevoUrl);
       educ.setYears(nuevoYears);
        
        interEducacion.saveEducacion(educ);
        
        return educ;
}
}
