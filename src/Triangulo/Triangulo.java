package Triangulo;

public class Triangulo {
	public double saidA;
	public double saidB;
	public double saidC;

	public double area() {
		double p = (saidA + saidB + saidC);
		return Math.sqrt(p * (p - saidA) * (p - saidB) * (p - saidC));
	}
}
