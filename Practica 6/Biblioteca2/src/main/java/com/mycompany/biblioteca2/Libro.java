package com.mycompany.biblioteca2;

import java.io.Serializable;
import java.util.ArrayList;

public class Libro implements Serializable {
    private static final long serialVersionUID = 1L; 
    
    private String titulo;
    private String isbn;
    private int stock; 
    private ArrayList<Pagina> paginas; 

    public Libro(String titulo, String isbn, int stockInicial) { 
        this.titulo = titulo;
        this.isbn = isbn;
        this.stock = stockInicial;
        this.paginas = new ArrayList<>();
        agregarPagina(1, "Contenido de la primera página.");
    }
    
    public String getTitulo() { return titulo; }
    public String getIsbn() { return isbn; }
    public int getStock() { return stock; }
    public void setStock(int stock) { this.stock = stock; } 
    
    public boolean disminuirStock() {
        if (this.stock > 0) {
            this.stock--;
            return true;
        }
        return false;
    }
    public void aumentarStock() {
        this.stock++;
    }

    private class Pagina implements Serializable { 
        private static final long serialVersionUID = 1L; 
        private int numero;
        private String contenido;

        public Pagina(int numero, String contenido) {
            this.numero = numero;
            this.contenido = contenido;
        }
        public void mostrarContenido() {
            System.out.println("Página " + numero + ": " + contenido);
        }
    }

    public void agregarPagina(int numero, String contenido) {
        paginas.add(new Pagina(numero, contenido)); 
    }
}