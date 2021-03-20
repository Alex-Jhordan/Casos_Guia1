package com.senati.eti;
import java.util.Scanner;

public class Caso24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner a = new Scanner(System.in);
		
		float res1, res2, res3;
		
		System.out.print("Monto 1: ");
		float monto1 = a.nextFloat();
		System.out.print("Monto 2: ");
		float monto2 = a.nextFloat();
		System.out.print("Monto 3: ");
		float monto3 = a.nextFloat();
		
		res1 = (float)(monto1 / 5 + monto2 * 0.20);
		res2 = (float)((monto3 * 1.60) / 2);
		res3 = (float)((monto1 + monto2 + monto3) * 0.92);
		
		System.out.println("\nmonto1 / 5 + 20% del monto2: " + res1);
		System.out.println("160% del monto3  / 2: " + res2);
		System.out.println("monto1 + monto2 + monto3 - 8% de la suma: " + res3);

	}

}
