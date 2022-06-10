/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapp;

/**
 *
 * @author dayni
 */
public class Operaciones<T extends Number> {

	public Number Sumar(Number a, Number b)
	{
            
		Number r;
		r = a.doubleValue() + b.doubleValue();
		
		
		return r;
		
	}
	
	public Number Restar(Number a, Number b)
	{
		Number r;
		r = a.doubleValue() - b.doubleValue();
		
		
		return r;
		
	}
        public Number Multiplicar(Number a, Number b)
	{
		Number r;
		r = a.doubleValue() * b.doubleValue();
		
		
		return r;
		
	}
        public Number Dividir(Number a, Number b)
	{
		Number r;
		r = a.doubleValue() / b.doubleValue();
		
		
		return r;
		
	}
	
	
}