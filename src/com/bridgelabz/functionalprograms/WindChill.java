package com.bridgelabz.functionalprograms;

public class WindChill {
	public static void main(String[] args) {
		double t = Double.parseDouble(args[0]);
		double v = Double.parseDouble(args[1]);
		double w = 35.74 + (0.6215 * t) + (Math.pow(v, 0.16) * ((0.4275 * t) - 35.75));
		System.out.println("Windchill: "+w);
	}
}