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

    public void visualizarEmpleados() {
        System.out.println("Empleados en el departamento " + nombre + ":");
        for (Empleado empleado : listaEmpleados) {
            System.out.println(empleado);
        }
    }
}
