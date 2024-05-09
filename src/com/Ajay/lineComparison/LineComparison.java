package com.Ajay.lineComparison;

import java.util.Scanner;

public class LineComparison {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Line Comparison Program ");
		
		Scanner scanner = new Scanner(System.in);
		int x1;
		int y1;
		int x2;
		int y2;
		double lengthOfLine;
		
		System.out.println("Enter two points X1 & Y1 , X2 & Y2");
		x1 = scanner.nextInt();
		y1 = scanner.nextInt();
		x2 = scanner.nextInt();
		y2 = scanner.nextInt();
		
		lengthOfLine = Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2));
		System.out.println("Length of a line is "+lengthOfLine);
	}

}
