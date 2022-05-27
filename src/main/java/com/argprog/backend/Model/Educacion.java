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
public class Educacion {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String school;
    private String career;
    private String img;
    private String url;
    private String years;
    
     public Educacion(Long id, String school, String career, String img, String url, String years){
        this.id=id;
        this.school=school;
        this.career=career;
        this.img=img;
        this.url=url;
        this.years=years;
    }
    
}
