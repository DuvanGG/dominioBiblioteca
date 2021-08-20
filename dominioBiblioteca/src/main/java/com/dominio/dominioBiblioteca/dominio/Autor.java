/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dominio.dominioBiblioteca.dominio;

/**
 *
 * @author Duvan
 */
public class Autor extends Persona {
    
    public String nacionalidad;
    public String fechaNacimiento;
    
    public Autor(String nombre, String apellido, String correo, String nacionalidad, String fechaNacimiento) {
        super(nombre, apellido, correo);
        this.nacionalidad = nacionalidad;
        this.fechaNacimiento = fechaNacimiento;
                
    }
    
}
