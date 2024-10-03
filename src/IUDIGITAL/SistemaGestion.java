package IUDIGITAL;

import java.util.ArrayList;
import java.util.Scanner;

public class SistemaGestion {
    protected ArrayList<Empleado> listaEmpleados;
    protected ArrayList<Departamento> listaDepartamentos;

    public SistemaGestion() {
        listaEmpleados = new ArrayList<>();
        listaDepartamentos = new ArrayList<>();
    }

    public void gestionarEmpleados() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Gestión de empleados:");
        System.out.println("1. Crear empleado");
        System.out.println("2. Visualizar empleados");

        int opcion = scanner.nextInt();
        scanner.nextLine(); // Consume el salto de línea

        switch (opcion) {
            case 1:
                crearEmpleado();
                break;
            case 2:
                visualizarEmpleados();
                break;
            default:
                System.out.println("Opción no válida");
        }
    }

    public void gestionarDepartamentos() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Gestión de departamentos:");
        System.out.println("1. Crear departamento");
        System.out.println("2. Visualizar empleados en departamento");

        int opcion = scanner.nextInt();
        scanner.nextLine(); // Consume el salto de línea

        switch (opcion) {
            case 1:
                crearDepartamento();
                break;
            case 2:
                visualizarEmpleadosEnDepartamento();
                break;
            default:
                System.out.println("Opción no válida");
        }
    }

    private void crearEmpleado() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el ID del empleado:");
        int idEmpleado = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Ingrese el nombre del empleado:");
        String nombre = scanner.nextLine();

        System.out.println("Ingrese el apellido del empleado:");
        String apellido = scanner.nextLine();

        System.out.println("¿Es un empleado permanente o temporal? (1: Permanente, 2: Temporal)");
        int tipo = scanner.nextInt();

        if (tipo == 1) {
            System.out.println("Ingrese el salario:");
            double salario = scanner.nextDouble();
            Empleado nuevoEmpleado = new EmpleadoPermanente(idEmpleado, nombre, apellido, salario);
            listaEmpleados.add(nuevoEmpleado);
        } else if (tipo == 2) {
            System.out.println("Ingrese la tarifa por hora:");
            double tarifaPorHora = scanner.nextDouble();
            Empleado nuevoEmpleado = new EmpleadoTemporal(idEmpleado, nombre, apellido, tarifaPorHora);
            listaEmpleados.add(nuevoEmpleado);
        } else {
            System.out.println("Tipo de empleado no válido.");
        }

        System.out.println("Empleado creado con éxito.");
    }

    private void visualizarEmpleados() {
        System.out.println("Lista de empleados:");
        if (listaEmpleados.isEmpty()) {
            System.out.println("No hay empleados registrados.");
        } else {
            for (Empleado empleado : listaEmpleados) {
                System.out.println(empleado);
            }
        }
    }

    private void crearDepartamento() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el nombre del departamento:");
        String nombre = scanner.nextLine();
        Departamento nuevoDepartamento = new Departamento(nombre);
        listaDepartamentos.add(nuevoDepartamento);
        System.out.println("Departamento creado con éxito.");
    }

    private void visualizarEmpleadosEnDepartamento() {
        Scanner scanner = new Scanner(System.in);

        if (listaDepartamentos.isEmpty()) {
            System.out.println("No hay departamentos creados.");
            return;
        }

        System.out.println("Departamentos disponibles:");
        for (int i = 0; i < listaDepartamentos.size(); i++) {
            System.out.println((i + 1) + ". " + listaDepartamentos.get(i).getNombre());
        }

        System.out.println("Seleccione el número del departamento:");
        int indiceDepartamento = scanner.nextInt();

        if (indiceDepartamento >= 1 && indiceDepartamento <= listaDepartamentos.size()) {
            Departamento departamento = listaDepartamentos.get(indiceDepartamento - 1);
            departamento.visualizarEmpleados();
        } else {
            System.out.println("Departamento no válido.");
        }
    }

    public void asignarEmpleadoADepartamento() {
        Scanner scanner = new Scanner(System.in);

        if (listaEmpleados.isEmpty()) {
            System.out.println("No hay empleados disponibles para asignar.");
            return;
        }

        if (listaDepartamentos.isEmpty()) {
            System.out.println("No hay departamentos creados.");
            return;
        }

        System.out.println("Seleccione el empleado a asignar:");
        for (int i = 0; i < listaEmpleados.size(); i++) {
            System.out.println((i + 1) + ". " + listaEmpleados.get(i));
        }
        int indiceEmpleado = scanner.nextInt();

        System.out.println("Seleccione el departamento:");
        for (int i = 0; i < listaDepartamentos.size(); i++) {
            System.out.println((i + 1) + ". " + listaDepartamentos.get(i).getNombre());
        }
        int indiceDepartamento = scanner.nextInt();

        if (indiceEmpleado >= 1 && indiceEmpleado <= listaEmpleados.size()
                && indiceDepartamento >= 1 && indiceDepartamento <= listaDepartamentos.size()) {

            Empleado empleado = listaEmpleados.get(indiceEmpleado - 1);
            Departamento departamento = listaDepartamentos.get(indiceDepartamento - 1);

            departamento.agregarEmpleado(empleado);
            System.out.println("Empleado asignado al departamento con éxito.");
        } else {
            System.out.println("Selección inválida.");
        }
    }
}
