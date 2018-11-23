/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ariketa46;

import javax.swing.JOptionPane;

/**
 *
 * @author Tamara
 */
public class Ariketa46 {
    

    static int codigo;

    public static void main(String[] args) {
      /*Control de las falta de asistencia de los alumnos. Se dispone de los partes
de faltas de los alumnos en el mes de noviembre y se pretende contabilizar
el total de faltas de cada alumno. Se teclear´an los partes diarios
introduciendo la fecha, el c´odigo del alumno y el n´umero de faltas de
ese d´ıa.
Cada vez que el usuario nos introduzca datos, le preguntaremos si
desea continuar.
Supondremos a efectos pr´acticos un m´aximo de 5 alumnos en clase.
Cogeremos los 5 primeros c´odigos distintos que introduzcan como
correctos, no admitiremos ninguno m´as.*/
      
      int falta [] = new int [5];
      int dia [] = new int [30];    
      
      inicializaDatosClase(falta,dia);
        
        char continuar;
        do
        {
            solicitarDatosEntrada(falta,dia);
            continuar = JOptionPane.showInputDialog("¿Quieres seguir introduciendo datos? <s/n>").toLowerCase().charAt(0);
        }
        while (continuar == 's');
        
        visualizarFaltasAlumno(falta,dia);
    }
    
    public static void inicializaDatosClase (int [] falta, int [] dia){
        
        for (int x = 0; x < falta.length; x++){
            falta[x] = 0;
            for (int y = 0; y <dia.length; y++)
                dia[x] =0;
    }
     
    }
    
    public static void solicitarDatosEntrada (int [] falta, int [] dia){
        
        codigo = Integer.parseInt(JOptionPane.showInputDialog("Introduce el código del alumno"));
        int faltasAlumno = Integer.parseInt(JOptionPane.showInputDialog("Introduce las faltas del alumno "));
        int diaNoviembre = Integer.parseInt(JOptionPane.showInputDialog("Introduce el dia (nro): "));
        
    }
    
    public static void visualizarFaltasAlumno (int [] falta, int [] dia) {
        
    }
    
}
