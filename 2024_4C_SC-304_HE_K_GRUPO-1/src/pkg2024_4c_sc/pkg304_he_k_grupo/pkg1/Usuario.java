/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg2024_4c_sc.pkg304_he_k_grupo.pkg1;

import java.util.Date;

/**
 *
 * @author Alexander
 */

/**
 *
 * @author Alexander
 */
public class Usuario {
    private String nombre;
    private String apellidos;
    private String correo;
    private Date fechaDeIngreso;
    private ListaDeSeguidores seguidores;
    private PilaPublicaciones mensajes;

    public Usuario() {
    }
    
    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Date getFechaDeIngreso() {
        return fechaDeIngreso;
    }

    public void setFechaDeIngreso(Date fechaDeIngreso) {
        this.fechaDeIngreso = fechaDeIngreso;
    }
}
