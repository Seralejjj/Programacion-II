package ejercicio2;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese a, b, c: ");
        double a1 = scanner.nextDouble();
        double b1 = scanner.nextDouble();
        double c1 = scanner.nextDouble();
        ejercicio2 ecuacion1 = new ejercicio2(a1, b1, c1);
        double discriminante1 = ecuacion1.getDiscriminante();
        System.out.println("Discriminante = " + discriminante1);
        if (discriminante1 > 0) {
            System.out.printf("La ecuación tiene dos raíces - %.6f y %.6f%n", ecuacion1.getRaiz1(), ecuacion1.getRaiz2());
        } else if (discriminante1 == 0) {
            System.out.printf("La ecuación tiene una raíz %.6f%n", ecuacion1.getRaiz1());
        } else {
            System.out.println("La ecuación no tiene raíces reales");
        }

        System.out.println("Ingrese a, b, c: ");
        double a2 = scanner.nextDouble();
        double b2 = scanner.nextDouble();
        double c2 = scanner.nextDouble();
        ejercicio2 ecuacion2 = new ejercicio2(a2, b2, c2);
        double discriminante2 = ecuacion2.getDiscriminante();
        System.out.println("Discriminante = " + discriminante2);
        if (discriminante2 > 0) {
            System.out.printf("La ecuación tiene dos raíces - %.6f y %.6f%n", ecuacion2.getRaiz1(), ecuacion2.getRaiz2());
        } else if (discriminante2 == 0) {
            System.out.printf("La ecuación tiene una raíz %.6f%n", ecuacion2.getRaiz1());
        } else {
            System.out.println("La ecuación no tiene raíces reales");
        }
    }
}