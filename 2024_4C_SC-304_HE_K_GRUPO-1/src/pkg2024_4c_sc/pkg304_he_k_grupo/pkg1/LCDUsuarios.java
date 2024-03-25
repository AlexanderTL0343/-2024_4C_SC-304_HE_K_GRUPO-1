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
    
     public void AgregarUsuario(String nombre,String apellidos,String correo )
    {
      
    }
    public void eliminar(String nombre){
    }
    
    public boolean existe(String nombre){
         boolean respuesta = false;
        
        NodoListaUsuarios auxiliar = cabeza;
        
        while(auxiliar != null)
        {
            if(auxiliar.getDato().getNombre() == nombre)
            {
                respuesta = true;
                break;
            }
            else
            {
                auxiliar = auxiliar.getSiguiente();
            }
        }
        
        return respuesta;
    }
    

    @Override
    public String toString() {
        String respuesta = "Lista doble circular: \n";
        
        if(cabeza != null)
        {
            NodoListaUsuarios aux = cabeza;
            
            respuesta += aux.toString() + "\n";
             
            aux = aux.getSiguiente();
            
            while(aux != cabeza)
            {
                respuesta += aux.toString() + "\n";
                aux = aux.getSiguiente();
            }
        }
        else
        {
            respuesta += "Vacía";
        }
        
        return respuesta;
    }
    
}
