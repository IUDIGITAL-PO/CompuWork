package IUDIGITAL;

public class EmpleadoPermanente extends Empleado {
    private double salario;

    public EmpleadoPermanente(int idEmpleado, String nombre, String apellido, double salario) {
        super(idEmpleado, nombre, apellido, "Permanente");
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public void generarReporteDesempeño() {
        System.out.println("Generando reporte de desempeño para empleado permanente: " + nombre + " " + apellido);
    }
}
