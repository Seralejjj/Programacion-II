package ejerci1;

public class EmpleadoTiempoCompleto extends Empleado {
    
    private double salarioAnual;

    public EmpleadoTiempoCompleto(String nombre, double salarioAnual) {
        super(nombre); 
        this.salarioAnual = salarioAnual;
    }

    public double CalcularSalarioMensual() {
        return this.salarioAnual / 12.0;
    }

    public String toString() {
        return super.toString() + ", Tipo: Tiempo Completo, Salario Anual: $" + salarioAnual;
    }
}
