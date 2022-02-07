package com.simplilearn.first.conditionals;

import java.util.Scanner;

public class IfDemo {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter First Number");
		int num1 = in.nextInt();
		System.out.println("Enter Second Number");
		int num2 =in.nextInt();
		
		if (num1>num2) {
			System.out.println(num1 + " is larger");
		} else {
			System.out.println(num2 +"is larger");
		}
		
	}

}
