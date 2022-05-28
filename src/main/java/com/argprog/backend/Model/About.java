/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.argprog.backend.Model;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;
/**

/**
 *
 * @author maern
 */

@Getter @Setter
@Entity
public class About{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String nombre;
    private String position;
    private String img;
    private String backimage;
    private String ubication;
    private String about;
    
    public About(){}
   
    public About(Long id, String nombre, String position, String img, String backimage, String ubication, String about){
        this.id=id;
        this.nombre=nombre;
        this.position=position;
        this.img=img;
        this.backimage=backimage;
        this.ubication=ubication;
        this.about=about;
    }
}
