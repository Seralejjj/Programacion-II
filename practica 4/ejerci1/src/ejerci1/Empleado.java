package ejerci1;

public abstract class Empleado {

    protected String nombre;

    public Empleado(String nombre) {
        this.nombre = nombre;
    }

    public abstract double CalcularSalarioMensual();

    public String toString() {
        return "Empleado [Nombre: " + nombre + "]";
    }
}
