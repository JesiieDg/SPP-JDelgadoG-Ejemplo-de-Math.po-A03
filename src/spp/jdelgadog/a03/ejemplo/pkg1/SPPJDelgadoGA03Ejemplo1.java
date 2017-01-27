/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp.jdelgadog.a03.ejemplo.pkg1;
import java.util.Scanner;


/**
 *
 * @author GILDARDO
 */
public class SPPJDelgadoGA03Ejemplo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // variables
        double c,a,b;
        
        Scanner kb=new Scanner (System.in);
        //Desplegamos el menú
        System.out.println("Ejemplo usando Math.pow");
      //Asignar valores a las variables
        System.out.println("Introduce el valor de a");
        a=kb.nextDouble();
        System.out.println("Introduce el valor de b");
        b=kb.nextDouble();
        //Resolver el problema
        c=Math.sqrt(Math.pow(a,2)+Math.pow(b,2));
        
        System.out.println("El valor de c es" +c);
        
    }
    
}
