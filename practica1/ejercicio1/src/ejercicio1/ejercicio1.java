package ejercicio1;

public class ejercicio1 {

    private double a;
    private double b;
    private double c;
    private double d;
    private double e;
    private double f;

    public ejercicio1(double a, double b, double c, double d, double e, double f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }

    public boolean tieneSolucion() {
        double determinante = a * d - b * c;
        return Math.abs(determinante) > 1e-9; 
    }

    public double getX() {
        if (!tieneSolucion()) {
            System.out.println("La ecuación no tiene solución");
            return 0; 
        }
        double determinante = a * d - b * c;
        return (e * d - b * f) / determinante;
    }

    public double getY() {
        if (!tieneSolucion()) {
            System.out.println("La ecuación no tiene solución");
            return 0; 
        }
        double determinante = a * d - b * c;
        return (a * f - e * c) / determinante;
    }
}
         