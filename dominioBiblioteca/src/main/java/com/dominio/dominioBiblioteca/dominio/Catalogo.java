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
public class Catalogo {
    
    private String nombre;
    private String cantidadLibros;
    private ArrayList<String> librosTitulo = new ArrayList<String>();
    private ArrayList<String> librosAutor = new ArrayList<String>();
    private ArrayList<String> librosTema = new ArrayList<String>();
    private ArrayList<String> librosFecha = new ArrayList<String>();
    
    public Catalogo(String nombre, String cantidadLibros, ArrayList<String> librosTitulo,
            ArrayList<String> librosAutor,
            ArrayList<String> librosTema,
            ArrayList<String> librosFecha){
        
        this.nombre = nombre;
        this.cantidadLibros = cantidadLibros;
        this.librosTitulo = librosTitulo;
        this.librosAutor = librosAutor;
        this.librosTema = librosTema;
        this.librosFecha = librosFecha;        
    
    }
    
    
    //metodos
    public void actualizarCatalogo(){
        
    }

    
    
}
