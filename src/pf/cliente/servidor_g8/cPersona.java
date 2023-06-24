/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pf.cliente.servidor_g8;

/**
 *
 * @author Randall
 */
public class cPersona {
    
    private String nombre;
    private String direccion;
    private String cedula;

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getCedula() {
        return cedula;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public cPersona(String nombre, String direccion, String cedula) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.cedula = cedula;
    }
    
    
    
}
