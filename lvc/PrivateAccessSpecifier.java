package com.simplilearn.first.lvc;

public class PrivateAccessSpecifier {
	private int a=23;
	public static void main(String[] args) {
		PrivateAccessSpecifier obj= new PrivateAccessSpecifier();
	System.out.println(obj.a);
		
	AccessSpecifier objj = new AccessSpecifier();
	System.out.println(objj.display());
	}

}
