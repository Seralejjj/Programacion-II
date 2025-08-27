package ejercicio3;

import java.util.Scanner;

public class mainpoo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese 10 números separados por espacios:");
        String input = scanner.nextLine();
        String[] valores = input.split(" ");
        double[] numeros = new double[10];
        for (int i = 0; i < 10; i++) {
            numeros[i] = Double.parseDouble(valores[i]);
        }

        ejercicio3Objetos estadistica = new ejercicio3Objetos(numeros);
        double prom = estadistica.promedio();
        double desv = estadistica.desviacion();
        System.out.printf("El promedio es %.2f%n", prom);
        System.out.printf("La desviación estándar es %.5f%n", desv);
    }
}