package com.mycompany.biblioteca;

public class Main {
    public static void main(String[] args) {
        // Crear autores
        Autor a1 = new Autor("Gabriel García Márquez", "Colombiano");
        Autor a2 = new Autor("Mario Vargas Llosa", "Peruano");

        // Crear libros
        Libro l1 = new Libro("Cien años de soledad", "123-456");
        l1.agregarPagina(1, "En Macondo, todo era mágico.");
        l1.agregarPagina(2, "La historia continúa...");

        Libro l2 = new Libro("La ciudad y los perros", "789-101");
        l2.agregarPagina(1, "La vida en el colegio militar...");
        l2.agregarPagina(2, "El conflicto interno de los personajes.");

        // Crear estudiantes
        Estudiante e1 = new Estudiante("2021001", "Sergio Pérez");
        Estudiante e2 = new Estudiante("2021002", "Ana López");

        // Crear biblioteca con horario (composición)
        Biblioteca biblio = new Biblioteca("UMSA", "Lunes a Viernes", "08:00", "18:00");

        // Agregar libros y autores (agregación)
        biblio.agregarLibro(l1);
        biblio.agregarLibro(l2);
        biblio.agregarAutor(a1);
        biblio.agregarAutor(a2);

        // Crear préstamos (asociación)
        biblio.prestarLibro(e1, l1);
        biblio.prestarLibro(e2, l2);

        // Mostrar estado de la biblioteca
        biblio.mostrarEstado();

        // Cerrar biblioteca
        biblio.cerrarBiblioteca();
    }
}
