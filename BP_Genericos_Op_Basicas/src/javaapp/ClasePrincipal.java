/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapp;
import java.util.*;
/**
 *
 * @author dayni
 */
public class ClasePrincipal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here



	Operaciones<Double> c = new Operaciones<Double>();
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese el primer numero: " );
        int dato1=entrada.nextInt();
        
        
        
        System.out.println("Ingrese el segundo numero: " );
        int dato2=entrada.nextInt();
        
        
   
	Number s= c.Sumar(dato1,dato2);
	Number r = c.Restar(dato1, dato2);
        Number m = c.Multiplicar(dato1, dato2);
        Number d = c.Dividir(dato1, dato2);
      
        
	
	System.out.println("La suma es: " +s);
	System.out.println("La resta es: " +r);
        System.out.println("La multiplicación es: " +m);
	System.out.println("La división es: " +d);
	
	
	
	
	
	}

}