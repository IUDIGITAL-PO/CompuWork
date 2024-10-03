package IUDIGITAL;

import java.util.Date;

public class ReporteDesempenio {
    private int idReporte;
    private Empleado empleado;
    private Date fechaGeneracion;
    private String metricas;

    public ReporteDesempenio(int idReporte, Empleado empleado, String metricas) {
        this.idReporte = idReporte;
        this.empleado = empleado;
        this.fechaGeneracion = new Date();
        this.metricas = metricas;
    }

    public void generarReporteIndividual() {
        System.out.println("Reporte de desempeño para: " + empleado.nombre + " " + empleado.apellido);
        System.out.println("Fecha: " + fechaGeneracion);
        System.out.println("Métricas: " + metricas);
    }
}
