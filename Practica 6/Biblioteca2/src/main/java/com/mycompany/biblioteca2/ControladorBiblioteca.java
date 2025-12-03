package com.mycompany.biblioteca2;

public class ControladorBiblioteca {
    
    private Biblioteca biblioteca;
    
    public ControladorBiblioteca() {
        this.biblioteca = Biblioteca.cargarDatos(
            "Biblioteca Central UMSA", "Lunes a Viernes", "08:00", "18:00"
        );
        
        if (biblioteca.libros.isEmpty()) { 
            inicializarDatosDePrueba();
        }
    }
    
    private void inicializarDatosDePrueba() {
        System.out.println("\n[INICIALIZACIÓN] Agregando datos de prueba...");

        Autor a1 = new Autor("Gabriel García Márquez", "Colombiano");
        biblioteca.agregarAutor(a1);

        Libro l1 = new Libro("Cien años de soledad", "123-456", 5); // 5 unidades
        biblioteca.agregarLibro(l1);
        
        Estudiante e1 = new Estudiante("2021001", "Sergio Pérez");
        biblioteca.agregarEstudiante(e1);
    }

    public Biblioteca getBiblioteca() {
        return biblioteca;
    }
    
    public String mostrarEstado() {
        return this.biblioteca.mostrarEstado();
    }
    
    public void guardarDatos() {
        this.biblioteca.guardarDatos();
    }

    public String registrarEstudiante(String codigo, String nombre) {
        if (biblioteca.getEstudiantePorCodigo(codigo) != null) {
            return "ERROR: Ya existe un estudiante con el código " + codigo;
        }
        Estudiante nuevo = new Estudiante(codigo, nombre);
        biblioteca.agregarEstudiante(nuevo);
        return "Estudiante registrado: " + nombre + " (Código: " + codigo + ")";
    }

    public String registrarAutor(String nombre, String nacionalidad) {

        Autor nuevo = new Autor(nombre, nacionalidad);
        biblioteca.agregarAutor(nuevo);
        return "Autor registrado: " + nombre + " (Nacionalidad: " + nacionalidad + ")";
    }

    public String registrarLibro(String titulo, String isbn, int stock) {
        if (biblioteca.getLibroPorTitulo(titulo) != null) {
            return "ERROR: El libro '" + titulo + "' ya existe.";
        }
        if (stock <= 0) {
             return "ERROR: El stock inicial debe ser mayor a cero.";
        }
        Libro nuevo = new Libro(titulo, isbn, stock);
        biblioteca.agregarLibro(nuevo);
        return "Libro registrado: " + titulo + " (Stock inicial: " + stock + ")";
    }

    public String listarLibros() {
        return biblioteca.listarLibros();
    }

    public String realizarPrestamo(String codigoEstudiante, String tituloLibro) {

        Estudiante e = biblioteca.getEstudiantePorCodigo(codigoEstudiante);
        if (e == null) return "ERROR: Estudiante con código " + codigoEstudiante + " no encontrado.";

        Libro l = biblioteca.getLibroPorTitulo(tituloLibro);
        if (l == null) return "ERROR: Libro con título '" + tituloLibro + "' no encontrado.";

        return biblioteca.prestarLibro(e, l);
    }
}