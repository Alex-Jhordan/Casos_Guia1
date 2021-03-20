package com.senati.eti;
import java.util.Scanner;

public class Caso23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner a = new Scanner(System.in);
		
		float importe = 0, igv = 0, descuento = 0, total = 0;
		
		System.out.print("Producto: ");
		String producto = a.nextLine();
		System.out.print("Precio: ");
		float precio = a.nextFloat();
		System.out.print("Cantidad: ");
		int cantidad = a.nextInt();
		
		importe = cantidad * precio;
		igv = (float)(importe * 0.18);
		descuento = (float)(importe *0.03);
		total = importe - (descuento + igv);
		
		System.out.println("Importe: " + importe);
		System.out.println("IGV: " + igv);
		System.out.println("Descuento: " + descuento);
		System.out.println("Total: " + total);
	}

}
