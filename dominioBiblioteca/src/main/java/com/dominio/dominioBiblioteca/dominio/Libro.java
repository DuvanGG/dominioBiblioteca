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
public class Libro {
    
    private int id;
    private String titulo;
    private String fecha;
    private String categoria;
    private String tipo;
    private String inventario;
    private String tema;
    private String editorial;
    private String ISBN;
    
    //relacion Libro-Autor Agregacion
    
    private Autor autor; 
    
    //realcion Catalogo-Libro Composicion
    
    private Catalogo catalogo;
    
  
    
    //constructor 
    
    public Libro(int id, String titulo,
            String fecha,
            String categoria, 
            String tipo, 
            String inventario,
            String tema,
            String editorial,
            String ISBN){
        
        this.id = id;
        this.titulo = titulo;
        this.fecha = fecha;
        this.categoria = categoria;
        this.tipo = tipo;
        this.inventario = inventario;
        this.tema = tema;
        this.editorial = editorial;
        this.ISBN = ISBN;
    }
    
    //relacion agregacion Libro-Autor 
    public void setAutor(Autor autor){
        autor = autor; 
    }
    
    //relacion composicion
    
    public void setCatalogo(String nombre, String cantidadLibros, ArrayList<String> librosTitulo,
            ArrayList<String> librosAutor,
            ArrayList<String> librosTema,
            ArrayList<String> librosFecha){
        catalogo = new Catalogo(nombre, cantidadLibros, librosTitulo, librosAutor, librosTema, librosFecha);
    }
}
