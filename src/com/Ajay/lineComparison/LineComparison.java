package com.Ajay.lineComparison;

import java.util.Scanner;

public class LineComparison {

	private int x1;
	private int y1;
	private int x2;
	private int y2;
	
		
	public LineComparison(int x1, int y1, int x2, int y2) {
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
	}
	public double length() {
		
		double length = Math.sqrt(Math.pow(this.x2-this.x1, 2) + Math.pow(this.y2-this.y1, 2));
		System.out.println("Length of a line is "+length);
		
		return length;
	}
	public void checkEquality(LineComparison lineComparison) {
		if (this.length() == lineComparison.length()) {
			System.out.println("Both lines length are same");
		}else if (this.length() > lineComparison.length()) {
			System.out.println("Line 1 length is greater then line 2 length");
		}else
		{
			System.out.println("Lines 1 length is less then line 2 length");
		}
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Line Comparison Program ");
		
		LineComparison lineComparison1 = new LineComparison(20, 10, 40, 30);
		LineComparison lineComparison2 = new LineComparison(40, 30, 20, 10);
		
		lineComparison1.checkEquality(lineComparison2);
	}

}
