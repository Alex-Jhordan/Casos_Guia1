package com.senati.eti;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Caso17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner a = new Scanner(System.in);
		DecimalFormat b = new DecimalFormat("#.00");
		
		System.out.print("Número de aprobados: ");
		float na = a.nextInt();
		
		System.out.print("Número de desaprobados: ");
		float nd = a.nextInt();
		
		System.out.print("Número de retirados: ");
		float nr = a.nextInt();
		
		float total = na + nd + nr;
		
		float pa = na / total * 100;
		float pd = nd / total * 100;
		float pr = nr / total * 100;
		
		System.out.println("\nResultado");
		System.out.println("Aprobados: " + b.format(pa) + "%");
		System.out.println("Desaprobados: " + b.format(pd) + "%");
		System.out.println("Retirados: " + b.format(pr) + "%");
	}

}
