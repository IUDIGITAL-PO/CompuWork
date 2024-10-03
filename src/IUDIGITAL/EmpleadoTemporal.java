package IUDIGITAL;

public class EmpleadoTemporal extends Empleado {
    private double tarifaPorHora;

    public EmpleadoTemporal(int idEmpleado, String nombre, String apellido, double tarifaPorHora) {
        super(idEmpleado, nombre, apellido, "Temporal");
        this.tarifaPorHora = tarifaPorHora;
    }

    public double getTarifaPorHora() {
        return tarifaPorHora;
    }

    public void setTarifaPorHora(double tarifaPorHora) {
        this.tarifaPorHora = tarifaPorHora;
    }

    @Override
    public void generarReporteDesempeño() {
        System.out.println("Generando reporte de desempeño para empleado temporal: " + nombre + " " + apellido);
    }
}
