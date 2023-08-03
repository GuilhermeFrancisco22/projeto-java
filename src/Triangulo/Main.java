package Triangulo;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		double aX, bX, cX, aY, bY, cY;

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite os lados do triangulo X");
		aX = sc.nextDouble();
		bX = sc.nextDouble();
		cX = sc.nextDouble();

		System.out.println("Digite os lados do triangulo Y");
		aY = sc.nextDouble();
		bY = sc.nextDouble();
		cY = sc.nextDouble();

		double p = (aX + bX + cX) / 2;
		double areaX = Math.sqrt(p * (p - aX) * (p - bX) * (p - cX));

		p = (aY + bY + cY) / 2;
		double areaY = Math.sqrt(p * (p - aY) * (p - bY) * (p - cY));
		
		System.out.printf("Triangulo x area: %.2f", areaX);
		System.out.printf("Triangulo y area: %.2f", areaY);
		
		if(areaX > areaY) {
			System.out.println("a area do triangulo x e maior");
		}else {
			System.out.println("a area do triangulo y e maior");
		}
		
		sc.close();

	}

}
