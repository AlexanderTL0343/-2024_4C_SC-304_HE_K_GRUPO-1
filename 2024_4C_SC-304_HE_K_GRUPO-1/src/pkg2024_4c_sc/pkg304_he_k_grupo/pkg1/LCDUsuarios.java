/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg2024_4c_sc.pkg304_he_k_grupo.pkg1;

/**
 *
 * @author Alexander
 */
public class LCDUsuarios {
    private NodoListaUsuarios cabeza;
    private NodoListaUsuarios ultimo;

    public void agregarUsuario(Usuario nuevoUsuario) {
        NodoListaUsuarios nuevoNodo = new NodoListaUsuarios(nuevoUsuario);
        if (cabeza == null) {
            cabeza = nuevoNodo;
            ultimo = nuevoNodo;
        } else {
            ultimo.siguiente = nuevoNodo;
            nuevoNodo.anterior = ultimo;
            ultimo = nuevoNodo;
        }
    }

    public boolean eliminarUsuario(String correo) {
        NodoListaUsuarios actual = cabeza;
        while (actual != null) {
            if (actual.getDato().getCorreo().equals(correo)) {
                if (actual.anterior == null) {
                    cabeza = actual.siguiente;
                    if (cabeza != null)
                        cabeza.anterior = null;
                } else if (actual.siguiente == null) {
                    ultimo = actual.anterior;
                    ultimo.siguiente = null;
                } else {
                    actual.anterior.siguiente = actual.siguiente;
                    actual.siguiente.anterior = actual.anterior;
                }
                return true;
            }
            actual = actual.siguiente;
        }
        return false;
    }

    public boolean existeUsuario(String correo) {
        NodoListaUsuarios actual = cabeza;
        while (actual != null) {
            if (actual.getDato().getCorreo().equals(correo)) {
                return true;
            }
            actual = actual.siguiente;
        }
        return false;
    }
    
}
