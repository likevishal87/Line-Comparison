package com.bridgelabz;

import java.util.Scanner;

//As a fan of geometry, I want to compare two lines based on the end points, So that I know one line is equal, greater or less than other line.
public class GreaterorLess {

	public static void main(String[] args) {
		System.out.println("Welcome to Line Comparison Computation Program");
		double x1, x2, x3, x4, y1, y2, y3, y4, Line_1, Line_2;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter x1 coordinate:");
		x1 = scanner.nextInt();
		System.out.println("Enter x2 coordinate:");
		x2 = scanner.nextInt();
		System.out.println("Enter y1 coordinate:");
		y1 = scanner.nextInt();
		System.out.println("Enter y2 coordinate:");
		y2 = scanner.nextInt();
		Line_1 = Math.sqrt(Math.pow((x2 - x1), 2)) + Math.sqrt(Math.pow((y2 - y1), 2));
//	         second line
		System.out.println("Enter x3 coordinate:");
		x3 = scanner.nextInt();
		System.out.println("Enter x4 coordinate:");
		x4 = scanner.nextInt();
		System.out.println("Enter y3 coordinate:");
		y3 = scanner.nextInt();
		System.out.println("Enter y4 coordinate:");
		y4 = scanner.nextInt();
		Line_2 = Math.sqrt(Math.pow((x4 - x3), 2)) + Math.sqrt(Math.pow((y4 - y3), 2));

		if (Line_1 == Line_2) {
			System.out.println("Line_1 is equal Line_2");
		} else if (Line_1 > Line_2) {
			System.out.println("Line_1 is greater Line_2");
		} else {
			System.out.println("line_1 is not Line_2");
		}

	}

}
