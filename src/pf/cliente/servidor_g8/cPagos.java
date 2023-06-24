/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pf.cliente.servidor_g8;

/**
 *
 * @author Randall
 */
public class cPagos {
    
    private String pagosRecibidos;
    private String fechaPago;

    public void setPagosRecibidos(String pagosRecibidos) {
        this.pagosRecibidos = pagosRecibidos;
    }

    public void setFechaPago(String fechaPago) {
        this.fechaPago = fechaPago;
    }

    public String getPagosRecibidos() {
        return pagosRecibidos;
    }

    public String getFechaPago() {
        return fechaPago;
    }

    public cPagos(String pagosRecibidos, String fechaPago) {
        this.pagosRecibidos = pagosRecibidos;
        this.fechaPago = fechaPago;
    }

    
}
