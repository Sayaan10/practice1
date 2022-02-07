package com.simplilearn.first.lvc;

public class AccessSpecifier {

	protected void display()
	{
		System.out.println("U are accessing protected one");
	}
	private void test()
	{
		System.out.println("Accessing private method");
	}
	
	public void hello()
	{
		System.out.println("Public");
	}
	void world() {
		System.out.println("Default method");
	}
	
	public static void main(String[] args) {
		AccessSpecifier obj = new AccessSpecifier();
		obj.test();
		obj.world();
	}
}
