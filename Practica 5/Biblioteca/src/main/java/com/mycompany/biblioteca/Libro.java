package com.mycompany.biblioteca;

import java.util.ArrayList;

public class Libro {
    private String titulo;
    private String isbn;
    private ArrayList<Pagina> paginas; // Composición

    public Libro(String titulo, String isbn) {
        this.titulo = titulo;
        this.isbn = isbn;
        this.paginas = new ArrayList<>();
    }

    public void agregarPagina(int numero, String contenido) {
        paginas.add(new Pagina(numero, contenido));
    }

    public void leer() {
        System.out.println("Leyendo el libro: " + titulo);
        for (Pagina p : paginas) {
            p.mostrarContenido();
        }
    }

    public String getTitulo() {
        return titulo;
    }

    @Override
    public String toString() {
        return "Libro [" + titulo + ", ISBN=" + isbn + "]";
    }
}