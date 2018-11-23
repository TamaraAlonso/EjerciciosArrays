/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ariketa41;

import javax.swing.JOptionPane;

/**
 *
 * @author Tamara
 */
public class Ariketa41 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 
    /*Crear una matriz de dos dimensiones de 10 x 10. Pediremos que
introduzcan el n´umero de fila y el de columna que vamos a utilizar
y el valor que quieren almacenar. Una vez introducidos los datos. Se
escribir´a la suma correspondientes a las filas de la matriz.*/
    
    int matriz [][] = new int [10] [10];
    int suma [] = new int [10];
    
    try {
        
        int fila = Integer.parseInt(JOptionPane.showInputDialog("Introduce el número de fila que quieres"));
        int columna = Integer.parseInt(JOptionPane.showInputDialog("Introduce el número de la columna que quieres"));
        int posicion = Integer.parseInt(JOptionPane.showInputDialog("Introduce la posición de los dos números que quieres sumar"));
    }
    
    }
    
}
