/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package p1;

import java.util.Scanner;

/**
 *
 * @author dayni
 */
public class P1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

   Scanner sc = new Scanner(System.in);

          

      System.out.println("*** Calcular la división de dos números ***");

        try {
            System.out.println("Ingresa el primer valor (número entero): ");
            int divisor = sc.nextInt();
            System.out.println("Ingresa el segundo valor (número entero): ");
            int dividendo = sc.nextInt();
            int resultado = divisor / dividendo;
            System.out.println("El resultado es: " + resultado);

        } catch (Exception ex) {
            System.out.println("Error en la ejecución.");
        } finally {
            System.out.println("Gracias por visitar @Dayana");
        }
    }
}












































 /*
        System.out.println("Ingresa el divisor (número entero): ");
        int divisor = sc.nextInt();
        System.out.println("Ingresa el dividendo (número entero): ");
        int dividendo = sc.nextInt();
        int resultado = divisor / dividendo;
        System.out.println("El resultado es: " + resultado);
    }
}*/
        
        
        
    /** String cadena="Hola";
    int numero;
    
        try {
            numero=Integer.parseInt(cadena);
            
        } catch (Exception e) {
            
            System.out.println("No es un numero es una cadena");
        }
    
    
    int n1=5,n2=0;
    int r=n1/n2;
        System.out.println("La suma es"+r); 
    Scanner entrada=new Scanner(System.in);
    System.out.println("Digite un numero");
    int numero=entrada.nextInt();
        System.out.println(numero);*/
    