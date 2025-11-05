package com.mycompany.biblioteca;

import java.util.ArrayList;

public class Biblioteca {
    private String nombre;
    private ArrayList<Libro> libros;   // Agregación
    private ArrayList<Autor> autores;  // Agregación
    private ArrayList<Prestamo> prestamos; // Asociación
    private Horario horario;           // Composición

    public Biblioteca(String nombre, String dias, String horaApertura, String horaCierre) {
        this.nombre = nombre;
        this.libros = new ArrayList<>();
        this.autores = new ArrayList<>();
        this.prestamos = new ArrayList<>();
        this.horario = new Horario(dias, horaApertura, horaCierre);
    }

    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }

    public void agregarAutor(Autor autor) {
        autores.add(autor);
    }

    public void prestarLibro(Estudiante estudiante, Libro libro) {
        Prestamo p = new Prestamo(estudiante, libro);
        prestamos.add(p);
    }

    public void mostrarEstado() {
        System.out.println("\n=== Estado de la Biblioteca " + nombre + " ===");
        horario.mostrarHorario();
        System.out.println("Libros registrados: " + libros);
        System.out.println("Autores registrados: " + autores);
        System.out.println("Préstamos activos:");
        for (Prestamo p : prestamos) p.mostrarInfo();
    }

    public void cerrarBiblioteca() {
        System.out.println("\nBiblioteca " + nombre + " cerrada. Todos los préstamos finalizan.");
        prestamos.clear();
    }
}