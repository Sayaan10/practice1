package com.simplilearn.first.conditionals;

public class Loop {

	public static void main(String[] args) {
		//print my name 5 times
		int i=1;
		while(i<=5) {
			System.out.println(i+ "Sayan");
			i++;
		}
		do
		{
			System.out.println(i+"sayan");
			i++;
		} while(i<=10);
		
		for( i=11;i<=15;i++) {
			System.out.println(i+"sayan");
		}
	}
}
