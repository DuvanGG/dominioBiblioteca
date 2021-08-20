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
public class Estudiante extends Persona {
    
    private String numeroCarnet;
    
    public Estudiante(String nombre, String apellido, String correo, String numeroCarnet) {
        super(nombre, apellido, correo);
        this.numeroCarnet = numeroCarnet;
    }
    
    // Relacion de asociacion biblioteca-persona -> referencia a biblioteca
    
    public Biblioteca consultarLibros;
    
    
    
}
