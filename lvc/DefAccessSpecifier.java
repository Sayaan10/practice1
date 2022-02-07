package com.simplilearn.first.lvc;

//Default class
class DefAccessSpecifier {
	
	void display()
	{
		System.out.println("accessing default access specifier");
	}
public static void main(String[] args) {
	AccessSpecifier obj1 = new AccessSpecifier();
	obj1.display();
	obj1.world();
	
}
}
