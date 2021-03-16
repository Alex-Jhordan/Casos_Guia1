package com.senati.eti;
import java.util.Scanner;

public class Caso4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner a = new Scanner(System.in);
		int n1 = 0, n2 = 0, suma = 0, resta = 0, producto = 0, resto_entero = 0;
		float cociente = 0;

		System.out.print("Ingrese el primer número: ");
		n1 = a.nextInt();
		System.out.print("Ingrese el segundo número: ");
		n2 = a.nextInt();
		
		suma = n1 + n2;
		resta = n1 - n2;
		producto = n1 * n2;
		cociente = (float)n1 / n2;
		resto_entero = n1 % n2;
		
		System.out.println("\nLa suma de los números ingresados es: " + suma);
		System.out.println("La resta de los números ingresados es: " + resta);
		System.out.println("El producto de los números ingresados es: " + producto);
		System.out.println("El cociente de los números ingresados es: " + cociente);
		System.out.println("El resto entero de los números ingresados es: " + resto_entero);
	}
}

