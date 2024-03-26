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

    public void agregarUsuario(Usuario user) {
        boolean r = false;
        
        if(esVacia()|| !existe(user.getNombre())){
            NodoListaUsuarios n = new NodoListaUsuarios(user);
            
            if(esVacia()){
                cabeza = n;
                ultimo = cabeza;
                ultimo . setSiguiente(cabeza);
                cabeza.setAnterior(ultimo);
                r = true;
            }else if(user.getHash()<cabeza.getDato().getHash()){
                
                cabeza.setAnterior(n);
                n.setSiguiente(cabeza);
                cabeza = n;
                cabeza.setAnterior(ultimo);
                ultimo.setSiguiente(cabeza);
                r = true;
                
            }else if(user.getHash()>ultimo.getDato().getHash()){
                n.setAnterior(ultimo);
                ultimo.setSiguiente(n);
                ultimo = n;
                cabeza.setAnterior(ultimo);
                ultimo.setSiguiente(cabeza);
                r = true;
            }else{
                NodoListaUsuarios aux = cabeza;
                
                while(aux.getSiguiente().getDato().getHash()>user.getHash()){
                    aux=aux.getSiguiente();
                }
                
                n.setAnterior(aux);
                n.setSiguiente(aux.getSiguiente());
                
                n.getSiguiente().setAnterior(n);
                aux.setSiguiente(n);
                r = true;
            }
  
        }
    }

    public boolean eliminar(String correo){
        boolean r = false;
        int h = correo.hashCode();
        NodoListaUsuarios aux;
        NodoListaUsuarios aux2;
        NodoListaUsuarios aux3;
        if(!esVacia()){
            if(existe(correo)){
                
                if(cabeza == ultimo){
                    cabeza = null;
                    ultimo = null;
                    r=true;
                }else if(cabeza.getDato().getHash()==h){
                    
                    aux = cabeza;
                    
                    cabeza = aux.getSiguiente();
                    aux.setSiguiente(null);
                    aux.setAnterior(null);
                    
                    cabeza.setAnterior(ultimo);
                    ultimo.setSiguiente(cabeza);
                    r=true;
                }else if(ultimo.getDato().getHash() == h){
                    aux = ultimo;
                    ultimo = aux.getAnterior();
                    aux.setAnterior(null);
                    aux.setSiguiente(null);
                    
                    cabeza.setAnterior(ultimo);
                    ultimo.setSiguiente(cabeza);
                    r=true;
                }else{
                    aux = cabeza;
                    while(aux.getDato().getHash()!=h){
                        aux=aux.getSiguiente();
                    }
                    
                    aux2 = aux.getAnterior();
                    aux3 = aux.getSiguiente();
                    
                    aux2.setSiguiente(aux3);
                    aux3.setAnterior(aux2);
                    
                    aux.setSiguiente(null);
                    aux.setAnterior(null);
                    r = true;
                }
                
                
                
                
            }
        }
        return r;
        
    }

    public boolean existe(String correo){
        boolean respuesta = false;
        boolean t =  true;
        int hash = correo.hashCode();
        NodoListaUsuarios auxiliar = cabeza;
        
        while(auxiliar != cabeza || t)
        {
            
            if(auxiliar.getDato().getHash()== hash)
            {
                respuesta = true;
                break;
            }
            else
            {
                t = false;
                auxiliar = auxiliar.getSiguiente();
                
            }
        }
        
        return respuesta;
    }
    
    private boolean esVacia(){
        if (cabeza == null){
            return true;
        }else{
            return false;
        }
    }
    
}
