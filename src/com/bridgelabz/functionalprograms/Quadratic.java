package com.bridgelabz.functionalprograms;

import java.util.Scanner;

public class Quadratic {

	public static void main(String[] args) {
		int a, b, c;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a, b and c: ");
		a = scanner.nextInt();
		b = scanner.nextInt();
		c = scanner.nextInt();
		double root1,root2;
		double delta =  Math.pow(b, 2) - (4 * a * c);
		if(delta > 0.0) {
			root1 = (-b + Math.sqrt(delta)) / (2 * a);
			root2 = (-b - Math.sqrt(delta)) / (2 * a);
			System.out.println("The roots of the equation are real and different " + root1 + " and " + root2);
		}
		else if(delta == 0.0) {
			root1 = -b / (2.0 * a);
			root2 = root1;
			System.out.println("The roots of the equation are real and same " + root1 + " and " + root2);
		}
		else {
			System.out.println("Roots are imaginary");
		}
		scanner.close();
	}
}