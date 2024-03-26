/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg2024_4c_sc.pkg304_he_k_grupo.pkg1;

import java.util.Date;
import java.util.Scanner;
import javax.swing.JOptionPane;



/**
 *
 * @author Alexander
 */
public class Menu {
    private LCDUsuarios lcdUsuarios = new LCDUsuarios();

    public void mostrarMenu() {
        int opcion;
        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(
                    "1. Agregar usuario\n" +
                    "2. Eliminar usuario\n" +
                    "3. Verificar existencia de usuario\n" +
                    "4. Salir\n" +
                    "Ingrese una opción:"
            ));

            switch (opcion) {
                case 1:
                    agregarUsuario();
                    break;
                case 2:
                    eliminarUsuario();
                    break;
                case 3:
                    verificarExistenciaUsuario();
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "Saliendo del programa...");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida. Inténtelo de nuevo.");
            }
        } while (opcion != 4);
    }

    private void agregarUsuario() {
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del usuario:");
        String apellidos = JOptionPane.showInputDialog("Ingrese los apellidos del usuario:");
        String correo = JOptionPane.showInputDialog("Ingrese el correo electrónico del usuario:");
        Date fechaDeIngreso = new Date(); // Fecha actual

        Usuario nuevoUsuario = new Usuario(nombre, apellidos, correo, fechaDeIngreso);
        lcdUsuarios.agregarUsuario(nuevoUsuario);
        JOptionPane.showMessageDialog(null, "Usuario agregado correctamente.");
    }

    private void eliminarUsuario() {
        String correo = JOptionPane.showInputDialog("Ingrese el correo electrónico del usuario a eliminar:");
        boolean eliminado = lcdUsuarios.eliminarUsuario(correo);
        if (eliminado)
            JOptionPane.showMessageDialog(null, "Usuario eliminado correctamente.");
        else
            JOptionPane.showMessageDialog(null, "Usuario no encontrado.");
    }

    private void verificarExistenciaUsuario() {
        String correo = JOptionPane.showInputDialog("Ingrese el correo electrónico del usuario a verificar:");
        boolean existe = lcdUsuarios.existeUsuario(correo);
        if (existe)
            JOptionPane.showMessageDialog(null, "El usuario existe en la lista.");
        else
            JOptionPane.showMessageDialog(null, "El usuario no existe en la lista.");
    }
}
