/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ariketa49;

import javax.swing.JOptionPane;

/**
 *
 * @author 1gdaw04
 */
public class Ariketa49 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     /* Queremos almacenar en una matriz el n´umero de alumnos con el que
        cuenta una academia,ordenados en funci´on del nivel y del idioma que se estudia. Tendremos 3 ﬁlas que representar´an al Nivel b´asico,medio
        y de perfeccionamiento y 4 columnas en las que ﬁgurar´an los idiomas (0 = Ingl´es, 1 = Franc´es, 2 = Alem´an y 3 = Ruso). Se pide realizar
        la declaraci´on de la matriz y asignarle unos valores de ejemplo a cada elemento */
     
     int alumnos =0;
     
     String [] nivel;
        nivel = new String [12];
        
        //Llenado
        
        nivel [0] = "Básico";
        nivel [1] = "Medio";
        nivel [2] = "Perfeccionamiento";
        
     String [] idioma;
        idioma= new String [4];
        
        idioma [0]= "Inglés";
        idioma [1]= "Francés";
        idioma [2]= "Alemán";
        idioma [3]="Ruso";
        
     
     alumnos = Integer.parseInt("Introduce el número de alumnos");
     
     String nivelAlumno =  JOptionPane.showInputDialog("Introduce la inicial del nivel: b/m/p");
        nivelAlumno = nivelAlumno.toLowerCase();
        char letraNivel = nivelAlumno.charAt(0);
        
        switch (letraNivel) {
            
            case 'b':  
                JOptionPane.showMessageDialog(null, "Nivel básico");
                break;
            case 'm':   
                JOptionPane.showMessageDialog(null, "Nivel medio");
                break;
            case 'p':             
                JOptionPane.showMessageDialog(null, "Nivel perfeccionamiento");
                break;          
            default:
                JOptionPane.showMessageDialog(null, "El mes introducido no es correcto");
     
    String idiomaAlumno =  JOptionPane.showInputDialog("Introduce la inicial del idioma: i/f/a/r");
        idiomaAlumno = idiomaAlumno.toLowerCase();
        char letraIdioma = idiomaAlumno.charAt(0);
        
        switch (letraNivel) {
            
            case 'i':  
                JOptionPane.showMessageDialog(null, "Nivel inglés");
                break;
            case 'f':   
                JOptionPane.showMessageDialog(null, "Nivel francés");
                break;
            case 'a':             
                JOptionPane.showMessageDialog(null, "Nivel alemán");
                break;  
            case 'r':             
                JOptionPane.showMessageDialog(null, "Nivel ruso");
                break;  
            default:
                JOptionPane.showMessageDialog(null, "El mes introducido no es correcto");
    }
    
  }
    
    }
    
}
