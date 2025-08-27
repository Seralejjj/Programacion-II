package ejercicio2;

public class ejercicio2 {

    private double a;
    private double b;
    private double c;

    public ejercicio2(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getDiscriminante() {
        return b * b - 4 * a * c;
    }

    public double getRaiz1() {
        double discriminante = getDiscriminante();
        if (discriminante < 0) {
            System.out.println("La ecuación no tiene raíces reales");
            return 0; 
        }
        return (-b + Math.sqrt(discriminante)) / (2 * a);
    }

    public double getRaiz2() {
        double discriminante = getDiscriminante();
        if (discriminante < 0) {
            System.out.println("La ecuación no tiene raíces reales");
            return 0;
        }
        return (-b - Math.sqrt(discriminante)) / (2 * a);
    }
}