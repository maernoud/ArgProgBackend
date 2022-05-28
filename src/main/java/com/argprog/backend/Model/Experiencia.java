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
 *
 * @author maern
 */
@Getter @Setter
@Entity
public class Experiencia {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String company;
    private String position;
    private String img;
    private String url;
    private String years;
    
   public Experiencia(){}
   
    public Experiencia(Long id, String company, String position, String img, String url, String years){
        this.id=id;
        this.company=company;
        this.position=position;
        this.img=img;
        this.url=url;
        this.years=years;
    }
    
}
