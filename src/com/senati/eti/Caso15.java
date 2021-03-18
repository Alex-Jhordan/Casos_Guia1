package com.senati.eti;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Caso15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner a = new Scanner(System.in);
		DecimalFormat b = new DecimalFormat("#.00");
		
		System.out.print("Ingrese cantidad: ");
		int cantidad = a.nextInt();
		
		System.out.print("Ingrese precio: ");
		float precio = a.nextFloat();
		
		float importe1 = cantidad * precio;
		float importe2 = (float) (importe1 / 3.24);
		float importe3 =  (float) (importe1 / 3.75);
		
		System.out.println("\nResultado");
		System.out.println("Importe en soles: " + b.format(importe1));
		System.out.println("Importe en dólares: " + b.format(importe2));
		System.out.println("Importe en euros: " + b.format(importe3));
	}

}
