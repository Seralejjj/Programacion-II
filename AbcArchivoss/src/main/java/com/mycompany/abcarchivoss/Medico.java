package com.mycompany.abcarchivoss;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.File;

public class Medico {

    private int idMed;
    private String nombreMed, apellidoMed;
    private int aniosExperiencia;

    public Medico(int idMed, String nombreMed, String apellidoMed, int aniosExperiencia) {
        this.idMed = idMed;
        this.nombreMed = nombreMed;
        this.apellidoMed = apellidoMed;
        this.aniosExperiencia = aniosExperiencia;
    }

    public Medico() {
        this.idMed = -1;
        this.nombreMed = "";
        this.apellidoMed = "";
        this.aniosExperiencia = -1;
    }

    public void alta() {
 
        String ruta = "archivosMedicos/medico" + this.idMed + ".txt";
        try {
            FileWriter w = new FileWriter(ruta);
            BufferedWriter escritor = new BufferedWriter(w);

            // Escribir los atributos en líneas separadas
            escritor.append(this.idMed + "\n");
            escritor.append(this.nombreMed + "\n");
            escritor.append(this.apellidoMed + "\n");
            escritor.append(this.aniosExperiencia + "");

            escritor.close();
            w.close();
            System.out.println("\t\t---ALTA DE MEDICO CORRECTA---");

        } catch (Exception e) {
            System.out.println("ERROR EN ALTA DE MEDICO:\n\n" + e);
        }
    }

    // Carga (Lee y llena el objeto Medico desde un archivo .txt)
    public void carga(String ruta) {
        try {
            FileReader r = new FileReader(ruta);
            BufferedReader lector = new BufferedReader(r);

            // Leer y parsear los atributos
            this.idMed = Integer.parseInt(lector.readLine());
            this.nombreMed = lector.readLine();
            this.apellidoMed = lector.readLine();
            this.aniosExperiencia = Integer.parseInt(lector.readLine());

            lector.close();
            r.close();
            System.out.println("\t\t---CARGA DE MEDICO CORRECTA---");

        } catch (Exception e) {
            System.out.println("ERROR EN CARGA DE MEDICO:\n\n" + e);
        }
    }

    // Baja (Elimina el archivo .txt del Medico)
    public void baja() {
        String ruta = "archivosMedicos/medico" + this.idMed + ".txt";
        File archivo = new File(ruta);

        if (archivo.delete()) {
            System.out.println("SE HA ELIMINADO CORRECTAMENTE EL ARCHIVO " + archivo.getPath());
        } else {
            System.out.println("ERROR EN LA ELIMINACION DEL ARCHIVO " + archivo.getPath());
        }
    }

    // --- Getters y Setters ---

    public int getIdMed() {
        return idMed;
    }

    public void setIdMed(int idMed) {
        this.idMed = idMed;
    }

    public String getNombreMed() {
        return nombreMed;
    }

    public void setNombreMed(String nombreMed) {
        this.nombreMed = nombreMed;
    }

    public String getApellidoMed() {
        return apellidoMed;
    }

    public void setApellidoMed(String apellidoMed) {
        this.apellidoMed = apellidoMed;
    }

    public int getAniosExperiencia() {
        return aniosExperiencia;
    }

    public void setAniosExperiencia(int aniosExperiencia) {
        this.aniosExperiencia = aniosExperiencia;
    }

    @Override
    public String toString() {
        return "Medico{" + "idMed=" + idMed + ", nombreMed=" + nombreMed + ", apellidoMed=" + apellidoMed + ", aniosExperiencia=" + aniosExperiencia + '}';
    }
}
