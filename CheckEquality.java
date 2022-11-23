package com.bridgelabz;

import java.util.Scanner;

// As a fan of geometry, I want to check equality of two lines based on the end points, So that I know when two lines are the equal.
public class CheckEquality {

	public static void main(String[] args) {
		System.out.println("Welcome to Line Comparison Computation Program");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter x1 coordinate:");
		double x1 = sc.nextInt();
		System.out.println("Enter x2 coordinate:");
		double x2 = sc.nextInt();
		System.out.println("Enter y1 coordinate:");
		double y1 = sc.nextInt();
		System.out.println("Enter y2 coordinate:");
		double y2 = sc.nextInt();
		double Line_1 = Math.sqrt(Math.pow((x2 - x1), 2)) + Math.sqrt(Math.pow((y2 - y1), 2));

		System.out.println("Enter x3 coordinate:");
		double x3 = sc.nextInt();
		System.out.println("Enter x4 coordinate:");
		double x4 = sc.nextInt();
		System.out.println("Enter y3 coordinate:");
		double y3 = sc.nextInt();
		System.out.println("Enter y4 coordinate:");
		double y4 = sc.nextInt();
		double Line_2 = Math.sqrt(Math.pow((x4 - x3), 2)) + Math.sqrt(Math.pow((y4 - y3), 2));

		if (Line_1 == Line_2) {
			System.out.println("Line_1 is equal Line_2");
		} else {
			System.out.println("line_1 is not Line_2");
		}

	}

}
