package Triangulo;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

//		double aX, bX, cX, aY, bY, cY;

		Triangulo triangleX, triangleY;

		triangleX = new Triangulo();
		triangleY = new Triangulo();

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite os lados do triangulo X");
		triangleX.saidA = sc.nextDouble();
		triangleX.saidB = sc.nextDouble();
		triangleX.saidC = sc.nextDouble();

		System.out.println("Digite os lados do triangulo Y");
		triangleY.saidA = sc.nextDouble();
		triangleY.saidB = sc.nextDouble();
		triangleY.saidC = sc.nextDouble();

		/*
		 * double p = (triangleX.saidA + triangleX.saidB + triangleX.saidC) / 2; double
		 * areaX = Math.sqrt(p * (p - triangleX.saidA) * (p - triangleX.saidB) * (p -
		 * triangleX.saidC));
		 * 
		 * p = (triangleY.saidA + triangleY.saidB + triangleY.saidC) / 2; double areaY =
		 * Math.sqrt(p * (p - triangleY.saidA) * (p - triangleY.saidB) * (p -
		 * triangleY.saidC));
		 */
		double areaX = triangleX.area();
		double areaY = triangleY.area();

		System.out.printf("Triangulo x area: %.2f", areaX);
		
		System.out.printf("Triangulo y area: %.2f", areaY);

		if (areaX > areaY) {
			System.out.println("a area do triangulo x e maior");
		} else {
			System.out.println("a area do triangulo y e maior");
		}

		sc.close();

	}

}
