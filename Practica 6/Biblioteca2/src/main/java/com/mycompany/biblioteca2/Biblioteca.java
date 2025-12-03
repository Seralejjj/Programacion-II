package com.mycompany.biblioteca2;

import java.util.ArrayList;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Serializable;
import java.io.File;
import java.util.List;

public class Biblioteca implements Serializable {
    private static final long serialVersionUID = 1L; 
    
    private String nombre;
    public List<Libro> libros;
    public List<Autor> autores; 
    public List<Estudiante> estudiantes; 
    private ArrayList<Prestamo> prestamos;
    private Horario horario;

    public Biblioteca(String nombre, String dias, String horaApertura, String horaCierre) {
        this.nombre = nombre;
        this.libros = new ArrayList<>();
        this.autores = new ArrayList<>();
        this.estudiantes = new ArrayList<>();
        this.prestamos = new ArrayList<>();
        
        this.horario = new Horario(dias, horaApertura, horaCierre); 
    }
    
    public void agregarLibro(Libro libro) { libros.add(libro); }
    public void agregarAutor(Autor autor) { autores.add(autor); }
    public void agregarEstudiante(Estudiante estudiante) { estudiantes.add(estudiante); }
    
    public String prestarLibro(Estudiante estudiante, Libro libro) {
        if (libro == null || estudiante == null) {
            return "ERROR: Libro o Estudiante no encontrados.";
        }
        
        if (libro.disminuirStock()) {
            Prestamo p = new Prestamo(estudiante, libro);
            prestamos.add(p);
            return "[ACCIÓN] Nuevo préstamo registrado:\n" + 
                   "  Libro: " + libro.getTitulo() + 
                   " a Estudiante: " + estudiante.getNombre();
        } else {
            return "ERROR: El libro '" + libro.getTitulo() + "' no tiene stock disponible.";
        }
    }
    
    public Libro getLibroPorTitulo(String titulo) {
        for (Libro l : libros) {
            if (l.getTitulo().equalsIgnoreCase(titulo)) {
                return l;
            }
        }
        return null;
    }
    
    public Estudiante getEstudiantePorCodigo(String codigo) {
        for (Estudiante e : estudiantes) {
            if (e.getCodigo().equalsIgnoreCase(codigo)) { 
                return e;
            }
        }
        return null;
    }
    
    public String mostrarEstado() {
        StringBuilder sb = new StringBuilder();
        sb.append("--- ESTADO ACTUAL DE LA BIBLIOTECA ").append(nombre.toUpperCase()).append(" ---\n");
        sb.append(horario.mostrarHorario()).append("\n"); 
        sb.append("Libros registrados (Stock): ").append(libros.size()).append("\n");
        sb.append("Autores registrados: ").append(autores.size()).append("\n");
        sb.append("Estudiantes registrados: ").append(estudiantes.size()).append("\n");
        sb.append("Préstamos activos: ").append(prestamos.size()).append("\n\n");

        if (!prestamos.isEmpty()) {
            sb.append("--- DETALLE DE PRÉSTAMOS ACTIVOS ---\n");
            for (Prestamo p : prestamos) {
                sb.append("  [P] Libro: ").append(p.getLibro().getTitulo())
                  .append(" | Estudiante: ").append(p.getEstudiante().getNombre())
                  .append(" (Cod: ").append(p.getEstudiante().getCodigo()).append(")\n");
            }
        }
        return sb.toString();
    }
    
    public String listarLibros() {
        if (libros.isEmpty()) {
            return "No hay libros registrados en la biblioteca.";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("--- LISTA DE LIBROS ---\n");
        for (Libro l : libros) {
            sb.append("Título: ").append(l.getTitulo())
              .append(" | ISBN: ").append(l.getIsbn())
              .append(" | Stock: ").append(l.getStock()).append("\n");
        }
        return sb.toString();
    }
    
    private static final String ARCHIVO_JSON = "biblioteca.json";
    
    public void guardarDatos() {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        try (FileWriter writer = new FileWriter(ARCHIVO_JSON)) {
            gson.toJson(this, writer);
            System.out.println("[PERSISTENCIA] ✅ Datos guardados exitosamente en: " + ARCHIVO_JSON);
        } catch (IOException e) {
            System.err.println("[PERSISTENCIA] ❌ Error al guardar datos: " + e.getMessage());
        }
    }
    
public static Biblioteca cargarDatos(String nombreDefault, String diasDefault, String aperturaDefault, String cierreDefault) {
    File file = new File(ARCHIVO_JSON);
    
    if (file.exists() && file.length() > 0) {
        Gson gson = new Gson();
        try (FileReader reader = new FileReader(ARCHIVO_JSON)) {
            Biblioteca biblio = gson.fromJson(reader, Biblioteca.class);
            System.out.println("[PERSISTENCIA] ✅ Datos cargados exitosamente desde: " + ARCHIVO_JSON);

            if (biblio.libros == null) biblio.libros = new ArrayList<>();
            if (biblio.autores == null) biblio.autores = new ArrayList<>();
            if (biblio.estudiantes == null) biblio.estudiantes = new ArrayList<>();
            if (biblio.prestamos == null) biblio.prestamos = new ArrayList<>();
            
            return biblio;
        } catch (IOException e) {
            System.err.println("[PERSISTENCIA] ❌ Error al leer datos. Creando nueva biblioteca: " + e.getMessage());
        }
    }
    
    System.out.println("[PERSISTENCIA] ⚠️ Archivo " + ARCHIVO_JSON + " no encontrado o vacío. Creando nueva biblioteca...");
    return new Biblioteca(nombreDefault, diasDefault, aperturaDefault, cierreDefault);
}
    
    private class Horario implements Serializable {
        private static final long serialVersionUID = 1L; 
        private String dias;
        private String horaApertura;
        private String horaCierre;

        public Horario(String dias, String horaApertura, String horaCierre) {
            this.dias = dias;
            this.horaApertura = horaApertura;
            this.horaCierre = horaCierre;
        }

        public String mostrarHorario() {
            return "Horario de Atención: " + dias + " de " + horaApertura + " a " + horaCierre + ".";
        }
    }
}