package ejerci2;

public class Circulo extends Figura {
    
    private double radio;

    public Circulo(String color, double radio) {
        super(color); 
        this.radio = radio;
    }

    public double area() {
        return Math.PI * radio * radio;
    }

    public double perimetro() {
        return 2 * Math.PI * radio;
    }
}
