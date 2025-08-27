package ejercicio1;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese a, b, c, d, e, f: ");
        double a1 = scanner.nextDouble();
        double b1 = scanner.nextDouble();
        double c1 = scanner.nextDouble();
        double d1 = scanner.nextDouble();
        double e1 = scanner.nextDouble();
        double f1 = scanner.nextDouble();
        ejercicio1 ecuacion1 = new ejercicio1(a1, b1, c1, d1, e1, f1);
        if (ecuacion1.tieneSolucion()) {
            System.out.printf("x = %.1f, y = %.1f%n", ecuacion1.getX(), ecuacion1.getY());
        } else {
            System.out.println("La ecuación no tiene solución");
        }

        System.out.println("Ingrese a, b, c, d, e, f: ");
        double a2 = scanner.nextDouble();
        double b2 = scanner.nextDouble();
        double c2 = scanner.nextDouble();
        double d2 = scanner.nextDouble();
        double e2 = scanner.nextDouble();
        double f2 = scanner.nextDouble();
        ejercicio1 ecuacion2 = new ejercicio1(a2, b2, c2, d2, e2, f2);
        if (ecuacion2.tieneSolucion()) {
            System.out.printf("x = %.1f, y = %.1f%n", ecuacion2.getX(), ecuacion2.getY());
        } else {
            System.out.println("La ecuación no tiene solución");
        }
    }
}