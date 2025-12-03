package com.mycompany.biblioteca2;

import java.io.Serializable;

public class Prestamo implements Serializable {
    private static final long serialVersionUID = 1L; 
    
    private Estudiante estudiante; 
    private Libro libro;           
    
    public Prestamo(Estudiante estudiante, Libro libro) {
        this.estudiante = estudiante;
        this.libro = libro;
    }

    public void mostrarInfo() {
        System.out.println(" -> Préstamo activo: " + 
                           "Libro: " + libro.getTitulo() + 
                           " a Estudiante: " + estudiante.getNombre());
    }

    public Libro getLibro() {
        return libro;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }
}