/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ariketa46;

import javax.swing.JOptionPane;


public class Ariketa46 {

    static int dia = 0;
    
    public static void main(String[] args) {
       /*Control de las falta de asistencia de los alumnos. Se dispone de los partes de faltas
        de los alumnos en el mes de noviembre y se pretende contabilizar el total de faltas
        de cada alumno. Se teclear´an los partes diarios introduciendo la fecha, el c´odigo
        del alumno y el n´umero de faltas de ese d´ıa. Cada vez que el usuario nos introduzca datos, 
        le preguntaremos si desea continuar. Supondremos a efectos pr´acticos un m´aximo de 5 alumnos en clase. 
        Cogeremos los 5 primeros c´odigos distintos que introduzcan como correctos, no admitiremos ninguno m´as. */
       
       
       //tengo que hacer un array doble con el número del alumno [5] y del día de noviembre [30]
       
       
       int [] arrayNotas= new int [5];
       inicializarNotasNoviembre (arrayNotas);
       
       char pedirDatos;
        do
        {
            solicitarDatosEntrada(arrayNotas);
            pedirDatos = JOptionPane.showInputDialog("¿Quieres seguir introduciendo datos? s/n").toLowerCase().charAt(0);
        }
        while (pedirDatos == 's');
        
        visualizarNotasNoviembre(arrayNotas);
    }
    
    public static void inicializarNotasNoviembre (int []arrayNotas) {
        
        for (int x=0; x < arrayNotas.length; x++) {
            arrayNotas[x]=0;
        }        
    }
    
    public static void solicitarDatosEntrada (int [] arrayNotas) {
        
        double codigo = Double.parseDouble(JOptionPane.showInputDialog("Introduce el código del alumno/a"));
        int falta = Integer.parseInt(JOptionPane.showInputDialog("Introduce las faltas del alumno"));
        dia = Integer.parseInt(JOptionPane.showInputDialog("Introduce el día del mes"));       
        
    }
    
    public static void visualizarNotasNoviembre ( int [] arrayNotas){
        
        //tengo que hacer un for dentro de otro for
        
        
        int falta = 0;   
        
        for (int dia = 0; dia < 32; dia++)
        {
          JOptionPane.showMessageDialog(null, "Las faltas introducidas son del día \n" + dia);
          
          if (falta < 6) {
              
              JOptionPane.showMessageDialog(null, "El número de faltas es \n" + falta);
            }
  
        }  
        
        JOptionPane.showMessageDialog(null, "Las faltas totales durante el mes de noviembre son: \n" + dia + falta);
    }
}
