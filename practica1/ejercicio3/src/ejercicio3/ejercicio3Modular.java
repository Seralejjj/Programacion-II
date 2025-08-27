package ejercicio3;

public class ejercicio3Modular {
    public static double promedio(double[] numeros) {
        double suma = 0;
        for (int i = 0; i < numeros.length; i++) {
            suma += numeros[i];
        }
        return suma / numeros.length;
    }

    public static double desviacion(double[] numeros) {
        double prom = promedio(numeros);
        double sumaCuadrados = 0;
        for (int i = 0; i < numeros.length; i++) {
            sumaCuadrados += Math.pow(numeros[i] - prom, 2);
        }
        return Math.sqrt(sumaCuadrados / (numeros.length - 1));
    }
}