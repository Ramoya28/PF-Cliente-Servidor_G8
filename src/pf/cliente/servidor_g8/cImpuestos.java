/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pf.cliente.servidor_g8;

/**
 *
 * @author Randall
 */
public class cImpuestos {
    
    private String descripcion;
    private double tasaImpuesto;
    private String fechaVencimiento;

    public String getDescripcion() {
        return descripcion;
    }

    public double getTasaImpuesto() {
        return tasaImpuesto;
    }

    public String getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setTasaImpuesto(double tasaImpuesto) {
        this.tasaImpuesto = tasaImpuesto;
    }

    public void setFechaVencimiento(String fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public cImpuestos(String descripcion, double tasaImpuesto, String fechaVencimiento) {
        this.descripcion = descripcion;
        this.tasaImpuesto = tasaImpuesto;
        this.fechaVencimiento = fechaVencimiento;
    }
    
    
    
}
