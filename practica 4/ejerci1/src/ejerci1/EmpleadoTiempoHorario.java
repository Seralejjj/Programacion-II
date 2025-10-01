package ejerci1;

public class EmpleadoTiempoHorario extends Empleado {
    
    private double horasTrabajadas;
    private double tarifaPorHora;

    public EmpleadoTiempoHorario(String nombre, double horasTrabajadas, double tarifaPorHora) {
        super(nombre);
        this.horasTrabajadas = horasTrabajadas;
        this.tarifaPorHora = tarifaPorHora;
    }
    
    public double CalcularSalarioMensual() {
        return this.horasTrabajadas * this.tarifaPorHora;
    }
    
    public String toString() {
        return super.toString() + ", Tipo: Tiempo Horario, Horas: " + horasTrabajadas + 
               ", Tarifa: $" + tarifaPorHora;
    }
}