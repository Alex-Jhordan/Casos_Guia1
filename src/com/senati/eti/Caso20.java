package com.senati.eti;
import java.util.Scanner;

public class Caso20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner a = new Scanner(System.in);
		
		float monto_ganado = 0, monto_aumentado = 0;
		
		System.out.println("Programa para incrementar el valor de una venta en 42%");
		System.out.println("======================================================");
		
		System.out.print("\nIngrese cantidad de productos: ");
		float cantidad = a.nextInt();
		System.out.print("Ingrese precio por producto: ");
		float precio = a.nextFloat();
		
		monto_ganado = cantidad * precio;
		monto_aumentado = (float)(monto_ganado * 1.42);
		
		System.out.println("\nMonto ganado: " + monto_ganado);
		System.out.println("Monto aumentado en 42%: " + monto_aumentado);

	}

}
