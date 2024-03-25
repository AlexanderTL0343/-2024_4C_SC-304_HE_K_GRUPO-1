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
    }

    public boolean EditarUsuario() {
    }

}
