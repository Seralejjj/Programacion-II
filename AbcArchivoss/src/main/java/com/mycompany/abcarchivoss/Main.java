package com.mycompany.abcarchivoss;

import java.io.File;

public class Main {
    
    public static void crearCarpetas() {
        new File("archivosConsultas").mkdirs();
        new File("archivosMedicos").mkdirs();
    }
    
    public static void main(String[] args) {
       
        crearCarpetas();
        
        Consultorio consultorio = new Consultorio("archivosConsultas", "archivosMedicos");

        System.out.println("=================================================");
        System.out.println("-------------- EJERCICIO A: ALTAS ---------------");
        System.out.println("=================================================");
        
        Medico m1 = new Medico(101, "Carlos", "Perez", 15);
        Medico m2 = new Medico(102, "Ana", "Gomez", 8);
        Medico m3 = new Medico(103, "Javier", "Soliz", 20);
        
        consultorio.agregarMedico(m1);
        consultorio.agregarMedico(m2);
        consultorio.agregarMedico(m3);
        
        System.out.println("\n--- Médicos dados de alta ---\n");
        consultorio.mostrarMedicos();
        
        Consulta c1 = new Consulta(1, "Luis", "Mamani", 101, 5, "Septiembre", 2004); // Cumpleaños
        Consulta c2 = new Consulta(2, "Maria", "Flores", 102, 5, "Septiembre", 2004); // Cumpleaños
        Consulta c3 = new Consulta(3, "Pedro", "Quispe", 101, 25, "Diciembre", 2025); // Navidad
        Consulta c4 = new Consulta(4, "Laura", "Condori", 102, 1, "Enero", 2026); // Año Nuevo
        Consulta c5 = new Consulta(5, "Sofia", "Aramayo", 103, 10, "Febrero", 2025); // Médico 103 para ser borrado
        Consulta c6 = new Consulta(6, "Juan", "Vargas", 101, 20, "Marzo", 2025);
        Consulta c7 = new Consulta(7, "Elena", "Roca", 102, 15, "Abril", 2025);
        Consulta c8 = new Consulta(8, "Andres", "Miranda", 103, 2, "Febrero", 2025); // Médico 103 para ser borrado
        Consulta c9 = new Consulta(9, "Carmen", "Choque", 101, 10, "Enero", 2026);
        
        consultorio.agregarConsulta(c1);
        consultorio.agregarConsulta(c2);
        consultorio.agregarConsulta(c3);
        consultorio.agregarConsulta(c4);
        consultorio.agregarConsulta(c5);
        consultorio.agregarConsulta(c6);
        consultorio.agregarConsulta(c7);
        consultorio.agregarConsulta(c8);
        consultorio.agregarConsulta(c9);
        
        System.out.println("\n--- Consultas dadas de alta ---\n");
        consultorio.mostrarConsultas();

        System.out.println("\n\n=================================================");
        System.out.println("-------------- EJERCICIO B: BAJA ----------------");
        System.out.println("=================================================");

        consultorio.ejercicioB("Javier", "Soliz"); 

        System.out.println("\n--- ESTADO DESPUÉS DE LA BAJA ---\n");
        System.out.println("--- Médicos restantes ---\n");
        consultorio.mostrarMedicos();
        System.out.println("\n--- Consultas restantes ---\n");
        consultorio.mostrarConsultas();

        System.out.println("\n\n=================================================");
        System.out.println("-------------- EJERCICIO C: CAMBIO --------------");
        System.out.println("=================================================");
        
        consultorio.ejercicioC(7); 
        
        System.out.println("\n--- ESTADO DESPUÉS DEL CAMBIO ---\n");
        consultorio.mostrarConsultas();

        System.out.println("\n\n=================================================");
        System.out.println("----------- EJERCICIO D: OPCIONAL ---------------");
        System.out.println("=================================================");

        consultorio.ejercicioD(5, "Septiembre", 2004); 
    }
}


