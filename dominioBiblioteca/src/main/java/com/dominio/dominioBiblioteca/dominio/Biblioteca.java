/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dominio.dominioBiblioteca.dominio;

import java.util.ArrayList;

/**
 *
 * @author Duvan
 */
public class Biblioteca {
    
    private String nombre;
    private int cantidadLibros;
    private ArrayList<String> libros = new ArrayList<String>();
    private Bibliotecario persona;
    
    // Relacion de asociacion biblioteca-persona -> referencia a personas
    public Estudiante consultaBiblioteca;
    public Bibliotecario AdminBiblioteca;
    public Profesor consultaReferencias; 
    
    
    
    //Metodos de la clase
    
    
    //Metodos getters y setters
           
    
}
