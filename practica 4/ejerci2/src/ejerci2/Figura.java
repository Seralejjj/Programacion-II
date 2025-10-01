package ejerci2;

public abstract class Figura {
   
    protected String color;

    public Figura(String color) {
        this.color = color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return this.color;
    }

    public String toString() {
        return "Figura [Tipo: " + this.getClass().getSimpleName() + ", Color: " + color + "]";
    }

    public abstract double area();
    public abstract double perimetro();
}