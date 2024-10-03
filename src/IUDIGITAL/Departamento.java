package IUDIGITAL;

import java.util.ArrayList;

public class Departamento {
    private final String nombre;
    private final ArrayList<Empleado> listaEmpleados;

    public Departamento(String nombre) {
        this.nombre = nombre;
        this.listaEmpleados = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void agregarEmpleado(Empleado empleado) {
        listaEmpleados.add(empleado);
        empleado.asignarDepartamento(this);
    }

    public void eliminarEmpleado(Empleado empleado) {
        listaEmpleados.remove(empleado);
        empleado.asignarDepartamento(null);
    }

    public void visualizarEmpleados() {
        System.out.println("Empleados en el departamento " + nombre + ":");
        if (listaEmpleados.isEmpty()) {
            System.out.println("No hay empleados asignados a este departamento.");
        } else {
            for (Empleado empleado : listaEmpleados) {
                System.out.println(empleado);
            }
        }
    }
}
