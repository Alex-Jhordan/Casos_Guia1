package com.senati.eti;

import java.util.Scanner;

public class Caso14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner a = new Scanner(System.in);
		
		System.out.print("Ingrese n�mero: ");
		int n = a.nextInt();
		
		int sumatoria = (n * (n + 1)) / 2;
		
		System.out.println("Resultado");
		System.out.println("Sumatoria: " + sumatoria);
		

	}

}
