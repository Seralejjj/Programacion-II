package ejercicio3;

public class ejercicio3Objetos {

    private double[] numeros;

    public ejercicio3Objetos(double[] numeros) {
        this.numeros = new double[numeros.length];
        for (int i = 0; i < numeros.length; i++) {
            this.numeros[i] = numeros[i];
        }
    }

    public double promedio() {
        double suma = 0;
        for (int i = 0; i < numeros.length; i++) {
            suma += numeros[i];
        }
        return suma / numeros.length;
    }

    public double desviacion() {
        double prom = promedio();
        double sumaCuadrados = 0;
        for (int i = 0; i < numeros.length; i++) {
            sumaCuadrados += Math.pow(numeros[i] - prom, 2);
        }
        return Math.sqrt(sumaCuadrados / (numeros.length - 1));
    }
}