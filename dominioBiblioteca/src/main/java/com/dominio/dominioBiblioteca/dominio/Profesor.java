/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dominio.dominioBiblioteca.dominio;

import com.dominio.dominioBiblioteca.dominio.Persona;

/**
 *
 * @author Duvan
 */
public class Profesor extends Persona {
    private String numeroCarnet;
    
    public Profesor(String nombre, String apellido, String correo, String numeroCarnet){
        super(nombre, apellido, correo);
        this.numeroCarnet = numeroCarnet;
    }        
    
    // Relacion de asociacion biblioteca-persona -> referencia a biblioteca
    
    public Biblioteca consultarReferencias;
}
