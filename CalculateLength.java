package com.bridgelabz;

import java.util.Scanner;

//As a fan of geometry, I want to model a line based on a point consisting of (x, y) co-ordinates using the Cartesian system, So that I can calculate its length
public class CalculateLength {

	public static void main(String[] args) {
		System.out.println("Welcome to Line Comparison Computation Program");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter x1 coordinate:");
		double x1 = scanner.nextInt();
		System.out.println("Enter x2 coordinate:");
		double x2 = scanner.nextInt();
		System.out.println("Enter y1 coordinate:");
		double y1 = scanner.nextInt();
		System.out.println("Enter y2 coordinate:");
		double y2 = scanner.nextInt();
		double LineOflength = Math.sqrt(Math.pow((x2 - x1), 2)) + Math.sqrt(Math.pow((y2 - y1), 2));

		System.out.println("..........");
		System.out.println("length of Line: " + LineOflength);

	}

}
