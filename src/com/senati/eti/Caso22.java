package com.senati.eti;
import java.util.Scanner;

public class Caso22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner a = new Scanner(System.in);
		
		float promedio = 0;
		
		System.out.print("\nIngrese el nombre del alumno: ");
		String nombre = a.nextLine();
		System.out.print("Ingrese NOTA 1: ");
		float nota1 = a.nextFloat();
		System.out.print("Ingrese NOTA 2: ");
		float nota2 = a.nextFloat();
		System.out.print("Ingrese NOTA 3: ");
		float nota3 = a.nextFloat();
		
		promedio = (float)(nota1 * 0.20 + nota2 * 0.30 + nota3 * 0.50);
		
		System.out.println("\nEl promedio del alumno " + nombre + " es " + promedio);

	}

}
