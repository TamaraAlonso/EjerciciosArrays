/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ariketa47;

import javax.swing.JOptionPane;

/**
 *
 * @author Tamara
 */
public class Ariketa47 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    /* En este ejercicio el usuario nos va a proporcionar a trav´es del teclado
el n´umero de unidades que se venden de los distintos productos con
los que trabaja una empresa.
Esta empresa trabaja con diez productos distintos cuyos c´odigos son:
10, 23, 30, 47, 55, 65,135,256, 526, 663. El usuario cada vez que se
hace una venta, nos proporcionara el c´odigo del producto (hay que
comprobar que es v´alido) y el n´umero de unidades vendidas de ese
producto. Al final del d´ıa, es decir, cuando el usuario nos diga que no
desea continuar, nosotros tenemos que visualizar el n´umero total de
unidades vendidas de cada producto y el c´odigo del producto, todo
ello ordenado de menor a mayor por n´umero de unidades vendidas.  
        */
    
    int [] cod  = new int [10];
    
    cod [0] = 10;
    cod [1] = 23;
    cod [2] = 30;
    cod [3] = 47;
    cod [4] = 55;
    cod [5] = 65;
    cod [6] = 135;
    cod [7] = 256;
    cod [8] = 526;
    cod [9] = 663;
    
    do {
        
    
    int introducirCod = Integer.parseInt(JOptionPane.showInputDialog("Introduce la posición de los dos números que quieres sumar"));
    
    switch (cod){
        
        case (10):
        case (23):    
        case (30):
        case (47): 
        case (55):
        case (65): 
        case (135):
        case (256):    
        case (526):
        case (663): 
                
                JOptionPane.showMessageDialog(null,"El código introducido es correcto");
        break;
        default:
                JOptionPane.showMessageDialog(null, "Introduce un código correcto");
                
    int unidadesVendidas = Integer.parseInt(JOptionPane.showInputDialog("Introduce las unidades vendidas de ese producto"));
        
    JOptionPane.showMessageDialog(null, Las unidades vendidas son + cod + unidadesVendidas);
            
    }
   }
  }
}

