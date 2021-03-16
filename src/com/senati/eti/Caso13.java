package com.senati.eti;
import java.util.Scanner;

public class Caso13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner a = new Scanner(System.in);
		
		System.out.print("Ingrese nombre: ");
		String nombre = a.nextLine();
		
		System.out.print("Ingrese apellido: ");
		String apellido = a.nextLine();
		
		System.out.println("Resultado");
		System.out.println("Alumno(a): " + nombre + " " + apellido);
		
	}

}
