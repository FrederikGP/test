/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gittutorial;

import java.util.Random;

/**
 *
 * @author ThorNissen
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Random ran = new Random();
       
       int R = ran.nextInt(10) + 1;
       int H = ran.nextInt(10) + 1;
       
      
       System.out.println("A random height from 1 - 10: " + H);
       
       
       System.out.println("A random radius from 1 - 10: " + R);
         
       double pi = Math.PI;
       
       
       System.out.println("Cylinderens Volume er: " + Math.PI*R*R*H);
            //R*R da ^2 ikke virker
       
       System.out.println("Cylinderens Areal er: " + 2*Math.PI*R*H);
    }
    
}
