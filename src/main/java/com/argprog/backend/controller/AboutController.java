/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.argprog.backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.argprog.backend.Model.About;
import com.argprog.backend.service.IAboutService;
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
public class AboutController {
     @Autowired
    private IAboutService interAbout;
    

    @PostMapping("/new/about")
    public void agregarAbout (@RequestBody About abo){
        //listaAbout.add(educ);
    }
   
    @GetMapping("/about/traer")
    public List<About> getAbout(){
        return interAbout.getAbout();
    }
    @PostMapping("/about/crear")
    public String createAbout(@RequestBody About abo){
        interAbout.saveAbout(abo);
        //devuelve un string avisando si se creo correctamente
        return "la educiencia fue creada correctamente";
    }
    
    @DeleteMapping ("/about/borrar/{id}")
    public String deleteAbout (@PathVariable Long id){
        interAbout.deleteAbout(id);
        //devuelve un string avisando si se elimino correctamente
        return "La About fue eliminada correctamente";
    }
    
    @PutMapping("/about/editar/{id}")
    public About editAbout(@PathVariable Long id,
                               
                               @RequestParam (value ="position") String nuevoPosition,
                               @RequestParam(value ="img") String nuevoImg,
                               @RequestParam(value ="about") String nuevoAbout
                               ){
        //busco la persona en cuestión
        About educ = interAbout.findAbout(id);
        
        //esto tambien puede ir en service
        //para desacoplar mejor aun el codigo en un nuevo metodo
       
       educ.setPosition(nuevoPosition);
       educ.setImg(nuevoImg);
      
       educ.setAbout(nuevoAbout);
        
        interAbout.saveAbout(educ);
        
        return educ;
}
}
