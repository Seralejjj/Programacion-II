package com.mycompany.abcarchivoss;

import java.io.File;
import java.util.ArrayList;

public class Consultorio {

    private String consultas;
    private String medicos;

    public Consultorio(String consultas, String medicos) {
        this.consultas = consultas;
        this.medicos = medicos;
    }

    public void agregarMedico(Medico m){
        m.alta();
    }
    
    public void agregarConsulta(Consulta c){
        c.alta();
    }
    
    public ArrayList<Medico> cargarMedicos(){
        ArrayList<Medico> lista = new ArrayList<Medico>();
        File carpeta = new File(this.medicos);
        File[] archivos = carpeta.listFiles();
        
        if (archivos != null) {
            for(File f: archivos){
                Medico nuevo = new Medico();
                nuevo.carga(f.getPath()); 
                lista.add(nuevo);
            }
        }
        return lista;
    }
    
    public ArrayList<Consulta> cargarConsultas(){
        ArrayList<Consulta> lista = new ArrayList<Consulta>();
        File carpeta = new File(this.consultas);
        File[] archivos = carpeta.listFiles();
        
        if (archivos != null) {
            for(File f: archivos){
                Consulta nuevo = new Consulta();
                nuevo.cargar(f.getPath()); 
                lista.add(nuevo);
            }
        }
        return lista;
    }

    public void mostrarMedicos(){
        ArrayList<Medico> lista = this.cargarMedicos();
        for(Medico m: lista){
            System.out.println(m);
        }
    }
    
    public void mostrarConsultas(){
        ArrayList<Consulta> lista = this.cargarConsultas();
        for(Consulta c: lista){
            System.out.println(c);
        }
    }
    
    public void ejercicioB(String nombreX, String apellidoY){
        ArrayList<Medico> medicos = this.cargarMedicos();
        int idBuscado = -1;
        
        for(Medico m: medicos){
            if(m.getNombreMed().equals(nombreX) && m.getApellidoMed().equals(apellidoY)){
                idBuscado = m.getIdMed();
                m.baja(); // Eliminar el archivo del Médico
                System.out.println("-- MEDICO ENCONTRADO Y ELIMINADO: " + m.toString());
                break;
            }
        }
        
        if(idBuscado != -1){ // Si se encontró y eliminó el médico...
            ArrayList<Consulta> consultas = this.cargarConsultas();
            int consultasEliminadas = 0;
            for(Consulta c: consultas){
                if(c.getIdMed() == idBuscado){ // Buscar todas las consultas asociadas a ese médico
                    c.baja(); // Eliminar el archivo de la Consulta
                    consultasEliminadas++;
                }
            }
            System.out.println("-- CONSULTAS ASOCIADAS ELIMINADAS: " + consultasEliminadas);
        } else {
            System.out.println("-- MEDICO NO ENCONTRADO (" + nombreX + " " + apellidoY + ")");
        }
    }

    public void ejercicioC(int nuevoDia){
        ArrayList<Consulta> lista = this.cargarConsultas();
        int consultasCambiadas = 0;

        for(Consulta c: lista){
            // Buscar consultas agendadas en Navidad (25 de diciembre) o Año Nuevo (1 de enero)
            boolean esNavidad = c.getDia() == 25 && c.getMes().equalsIgnoreCase("diciembre");
            boolean esAnioNuevo = c.getDia() == 1 && c.getMes().equalsIgnoreCase("enero");
            
            if(esNavidad || esAnioNuevo){
                c.setDia(nuevoDia); // Cambiar el día
                c.alta(); // Guardar el objeto actualizado, lo que reemplaza el archivo original (operación de Cambio)
                consultasCambiadas++;
            }
        }
        System.out.println("\n--- EJERCICIO C: Cambio de día realizado en " + consultasCambiadas + " consultas. ---");
    }

    public void ejercicioD(int diaCumple, String mesCumple, int anioCumple){
        ArrayList<Consulta> lista = this.cargarConsultas();
        System.out.println("\n--- EJERCICIO D: Pacientes atendidos el día de tu cumpleaños (" + diaCumple + "/" + mesCumple + "/" + anioCumple + ") ---");
        boolean encontrados = false;
        
        for(Consulta c: lista){
            // La búsqueda debe ser exacta en día, mes y año.
            if(c.getDia() == diaCumple && c.getMes().equalsIgnoreCase(mesCumple) && c.getAnio() == anioCumple){
                System.out.println("PACIENTE ENCONTRADO: " + c.getNombrePaciente() + " " + c.getApellidoPaciente());
                encontrados = true;
            }
        }
        
        if (!encontrados) {
            System.out.println("No se encontraron consultas agendadas ese día.");
        }
    }
}