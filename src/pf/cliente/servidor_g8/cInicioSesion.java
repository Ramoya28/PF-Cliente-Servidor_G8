/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pf.cliente.servidor_g8;

/**
 *
 * @author Randall
 */
public class cInicioSesion {
    
    private String usuario;
    private String clave;

    public String getUsuario() {
        return usuario;
    }

    public String getClave() {
        return clave;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public cInicioSesion(String usuario, String clave) {
        this.usuario = usuario;
        this.clave = clave;
    }
    
    
    
}
