/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package ezequiel.galletaf;

import java.util.Random;

/**
 *
 * @author bayro
 */
public class GalletaF {

    public static void main(String[] args) {
        Random r = new Random();
        int num;
        num = r .nextInt(5);
        
        String fortun;
        
        switch (num){
            case 1:  fortun = "Te sentirás feliz como un niño y veras al mundo con sus ojos.";
                     break;
            
            case 2:  fortun = "El cielo sera tu limite, pues grandes acontecimientos te sucederán.";
                     break;
            
            case 3:  fortun = "No te tomes la vida demasiado en serio. No saldrás de ella con vida.";
                     break;
            
            case 4:  fortun = "No todo el mundo puede recibir las mismas cosas.";
                     break;
                     
            default: fortun = "Hoy es el momento de explorar: no temas.";
                     break;
        }
        
        System.out.println(fortun);

    }
}
