/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg2024_4c_sc.pkg304_he_k_grupo.pkg1;

import javax.swing.JOptionPane;



/**
 *
 * @author Alexander
 */
public class Menu {

    private Usuario actual;
    private LCDUsuarios usuarios;
    private ColaFeed feed;
    private int opcion = 0;
    Menu menu = new Menu();

    public void mostrarMenuPricipal() {
        OUTER:
        while (opcion != 5) {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "Menú:\n"
                    + "1 - Crear Usuario\n"
                    + "2 - Cambiar Usuario\n"
                    + "3 - Eliminar Usuario\n"
                    + "4 - Editar Usuario\n"
                    + "5 - Salir \n"
                    + "Digite una opción para continuar: "
            ));
            switch (opcion) {
                case 1:
                    menu.CrearUsuario();

                    break;
                case 2:
                    menu.CambiarUsuario();

                    break;
                case 3:
                    menu.EliminarUsuario();

                case 4:
                    menu.EditarUsuario();
                    break;

                case 5:
                    break OUTER;

                case 6:
                    System.exit(0);
                default:
                    JOptionPane.showMessageDialog(null, "Opción inválida", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    public boolean CrearUsuario() {
    }

    public boolean CambiarUsuario() {
    }

    public boolean EliminarUsuario() {
        String nombre = JOptionPane.showInputDialog(null, "Ingrese el nombre del usuario a eliminar:");

        if (nombre != null && !nombre.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Usuario con nombre '" + nombre + "' eliminado correctamente.");
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "Debe ingresar un nombre de usuario válido.");
            return false;
           }
      }

    public boolean EditarUsuario() {
         String nombreAntiguo = JOptionPane.showInputDialog(null, "Ingrese el nombre del usuario a editar:");

        if (nombreAntiguo != null && !nombreAntiguo.isEmpty()) {
            String nombreNuevo = JOptionPane.showInputDialog(null, "Ingrese el nuevo nombre para el usuario:");

            if (nombreNuevo != null && !nombreNuevo.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Usuario editado correctamente. Nombre anterior: " + nombreAntiguo + ", nuevo nombre: " + nombreNuevo);
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Debe ingresar un nombre válido.");
                return false;
            }
        } else {
            JOptionPane.showMessageDialog(null, "Debe ingresar un nombre de usuario válido.");
            return false;
        }
    }

}
