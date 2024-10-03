package IUDIGITAL;

public abstract class Empleado {
    protected int idEmpleado;
    protected String nombre;
    protected String apellido;
    protected String tipoEmpleado;
    protected Departamento departamento;

    public Empleado(int idEmpleado, String nombre, String apellido, String tipoEmpleado) {
        this.idEmpleado = idEmpleado;
        this.nombre = nombre;
        this.apellido = apellido;
        this.tipoEmpleado = tipoEmpleado;
        this.departamento = null;
    }

    public void asignarDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public void cambiarDepartamento(Departamento nuevoDepartamento) {
        this.departamento = nuevoDepartamento;
    }

    public abstract void generarReporteDesempeño();

    @Override
    public String toString() {
        return "ID: " + idEmpleado + ", Nombre: " + nombre + " " + apellido +
                ", Tipo: " + tipoEmpleado + ", Departamento: " +
                (departamento != null ? departamento.getNombre() : "Sin departamento");
    }
}
