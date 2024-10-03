package IUDIGITAL;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SistemaGestionRRHH sistema = new SistemaGestionRRHH();

        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.println("\nSistema de Gestión de RRHH:");
            System.out.println("1. Gestionar empleados");
            System.out.println("2. Gestionar departamentos");
            System.out.println("3. Asignar empleado a departamento");
            System.out.println("4. Salir");

            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    sistema.gestionarEmpleados();
                    break;
                case 2:
                    sistema.gestionarDepartamentos();
                    break;
                case 3:
                    sistema.asignarEmpleadoADepartamento();
                    break;
                case 4:
                    continuar = false;
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        }

        System.out.println("Saliendo del sistema...");
        scanner.close();
    }
}
