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
public class Bibliotecario extends Persona {
        
    public Bibliotecario(String nombre, String apellido, String correo){
        super(nombre, apellido, correo);
    }
    
    // Relacion de asociacion biblioteca-persona -> referencia a biblioteca
    public Biblioteca AdminBiblioteca;
    
}
