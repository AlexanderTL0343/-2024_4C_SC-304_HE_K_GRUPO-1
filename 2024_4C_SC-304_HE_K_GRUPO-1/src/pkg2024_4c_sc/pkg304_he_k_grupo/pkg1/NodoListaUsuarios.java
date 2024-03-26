/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg2024_4c_sc.pkg304_he_k_grupo.pkg1;

/**
 *
 * @author Alexander
 */
public class NodoListaUsuarios {
    private Usuario dato;
    NodoListaUsuarios siguiente;
    NodoListaUsuarios anterior;

    public NodoListaUsuarios(Usuario dato) {
        this.dato = dato;
        this.siguiente = null;
        this.anterior = null;
    }

    public Usuario getDato() {
        return dato;
    }

    public void setDato(Usuario dato) {
        this.dato = dato;
    }

    public NodoListaUsuarios getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoListaUsuarios siguiente) {
        this.siguiente = siguiente;
    }

    public NodoListaUsuarios getAnterior() {
        return anterior;
    }

    public void setAnterior(NodoListaUsuarios anterior) {
        this.anterior = anterior;
    }
    
}
