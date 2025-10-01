package ejerci1;

import java.util.Scanner;
import java.util.Locale;

public class ProgramaPrueba {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US); 

        Empleado[] empleados = new Empleado[5];
        
        String nombre;
        double salarioAnual;
        double horasTrabajadas;
        double tarifaPorHora;

        System.out.println("--- INGRESO DE DATOS ---");

        for (int i = 0; i < 3; i++) {
            System.out.println("\n[Empleado Tiempo Completo " + (i + 1) + "]");
            System.out.print("Nombre: ");
            nombre = scanner.nextLine();
            System.out.print("Salario Anual (ej: 60000.00): $");
            salarioAnual = scanner.nextDouble();
            scanner.nextLine(); 

            empleados[i] = new EmpleadoTiempoCompleto(nombre, salarioAnual);
        }

        for (int i = 3; i < 5; i++) {
            System.out.println("\n[Empleado Tiempo Horario " + (i - 2) + "]");
            System.out.print("Nombre: ");
            nombre = scanner.nextLine();
            System.out.print("Horas Trabajadas (ej: 160.0): ");
            horasTrabajadas = scanner.nextDouble();
            System.out.print("Tarifa por Hora (ej: 20.00): $");
            tarifaPorHora = scanner.nextDouble();
            scanner.nextLine();

            empleados[i] = new EmpleadoTiempoHorario(nombre, horasTrabajadas, tarifaPorHora);
        }
        
        System.out.println("\n==========================================");
        System.out.println("   RESULTADO DE CÁLCULO DE SALARIOS (POLIMORFISMO)   ");
        System.out.println("==========================================");

        for (Empleado emp : empleados) {
            System.out.println(emp.toString());
            System.out.printf("Salario Mensual: $%.2f%n", emp.CalcularSalarioMensual());
            System.out.println("------------------------------------------");
        }
        
        scanner.close();
    }
}
