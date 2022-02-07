package com.simplilearn.first.lvc;

public class TestAccessSpecifier {
	
	public static void main(String[] args) {
		//Default accessible in same package
		DefAccessSpecifier def = new DefAccessSpecifier();
		def.display();
		
		PrivateAccessSpecifier obj = new PrivateAccessSpecifier();
		System.out.println(obj.a);
	}

}
