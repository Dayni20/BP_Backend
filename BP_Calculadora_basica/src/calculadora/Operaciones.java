/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadora;

/**
 *
 * @author dayni
 */
public class Operaciones {
 public float cantidadUno;
    public float cantidadDos;
    public float resultado;

    public Operaciones(float cantidadUno, float cantidadDos) {
        this.cantidadUno = cantidadUno;
        this.cantidadDos = cantidadDos;
    }

    public void getSuma(){
        resultado = cantidadUno + cantidadDos;
    }

    public void getResta(){
        resultado = cantidadUno - cantidadDos;
    }

    public void getMultiplicacion(){
        resultado = cantidadUno * cantidadDos;
    }

    public void getDivision(){
        if (cantidadDos != 0){
            resultado = cantidadUno / cantidadDos;
        }else{
            System.out.println("La división para cero no existe");
        }
    }

}
