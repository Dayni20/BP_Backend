/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadora;

import java.util.Scanner;

/**
 *
 * @author dayni
 */
public class Calculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                short num1, num2;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el primer numero:");
        num1 = entrada.nextShort();
         System.out.println("Ingrese el segundo numero:");
        num2 = entrada.nextShort();
        Operaciones op = new Operaciones(num1,num2);
       
        op.getSuma();
        System.out.println("La suma es:");
        System.out.println(op.resultado);
        op.getResta();
        System.out.println("La resta es:");
        System.out.println(op.resultado);
        op.getMultiplicacion();
        System.out.println("La multiplicación es:");
        System.out.println(op.resultado);
        op.getDivision();
        if(num2 != 0){
            System.out.println("La division es:");
            System.out.println(op.resultado);
        }
    }
}
