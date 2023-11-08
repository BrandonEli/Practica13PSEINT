/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.practica13pseint;
import javax.swing.JOptionPane; 
//Brandon Eli Ramirez Vicente, Ing TICS, 01/10/23 Realizar un DF para resolver la condicional de pago de una persona siguiendo la tabla siguiente.
/**
 *
 * @author berv
 */
public class Practica13PSEINT {

    public static void main(String[] args) {
        Object[] opciones = {"Solo tiene seguro social", "Solo tiene seguro medico", "No tiene seguro social ni seguro medico", "Tiene seguro social y seguro medico"};
        
        int Seleccion = JOptionPane.showOptionDialog(null, "Selecciona una opcion:", "Cuandro de dialogo de opcion multiple.",JOptionPane.DEFAULT_OPTION,JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);
        
        if (Seleccion == 0) {
            JOptionPane.showMessageDialog(null, "Paga el 60% del total");
        } else if (Seleccion == 1) {
            JOptionPane.showMessageDialog(null,"Paga el 30% del total");
        } else if (Seleccion == 2) {
            JOptionPane.showMessageDialog(null, "Paga todo");
        } else if (Seleccion == 3) {
            JOptionPane.showMessageDialog(null, "No paga");
        } else {
            JOptionPane.showMessageDialog(null, "Cerraste el cuadro de dialogo");
        }
    }
}
        


