package com.mycompany.biblioteca;

import java.time.LocalDate;

public class Prestamo {
    private LocalDate fechaPrestamo;
    private LocalDate fechaDevolucion;
    private Estudiante estudiante;
    private Libro libro;

    public Prestamo(Estudiante estudiante, Libro libro) {
        this.estudiante = estudiante;
        this.libro = libro;
        this.fechaPrestamo = LocalDate.now();
        this.fechaDevolucion = fechaPrestamo.plusDays(7);
    }

    public void mostrarInfo() {
        System.out.println("Préstamo -> Libro: " + libro.getTitulo() +
            ", Estudiante: " + estudiante +
            ", Fecha Préstamo: " + fechaPrestamo +
            ", Devolución: " + fechaDevolucion);
    }
}

