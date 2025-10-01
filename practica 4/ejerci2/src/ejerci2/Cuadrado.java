package ejerci2;

public class Cuadrado extends Figura implements Coloreado {
    
    private double lado;

    public Cuadrado(String color, double lado) {
        super(color); 
        this.lado = lado;
    }

    public double area() {
        return lado * lado;
    }

    public double perimetro() {
        return 4 * lado;
    }

    public String comoColorear() {
        return "Colorear los cuatro lados.";
    }
}