package com.senati.eti;
import java.util.Scanner;

public class Caso21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner a = new Scanner(System.in);
		
		float monto_gastado = 0, monto_disminuido = 0;
		
		System.out.println("Programa para disminuir el valor de un gasto en 12%");
		System.out.println("======================================================");
		
		System.out.print("\nIngrese cantidad de productos: ");
		float cantidad = a.nextInt();
		System.out.print("Ingrese precio por producto: ");
		float precio = a.nextFloat();
		
		monto_gastado = cantidad * precio;
		monto_disminuido = (float)(monto_gastado * 0.88);
		
		System.out.println("\nMonto gastado en productos: " + monto_gastado);
		System.out.println("Monto disminuido en 12%: " + monto_disminuido);

	}

}

