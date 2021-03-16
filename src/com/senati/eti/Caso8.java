package com.senati.eti;

import java.util.Scanner;

public class Caso8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner a = new Scanner(System.in);
		
		System.out.print("Ingrese lado: ");
		int lado = a.nextInt();
		
		int area = (int)Math.pow(lado, 2);
		int perimetro = lado * 4;
		
		System.out.println("\nResultados");
		System.out.println("Área del cuadrado: " + area);
		System.out.println("Perímetro del cuadrado: " + perimetro);
	}

}
