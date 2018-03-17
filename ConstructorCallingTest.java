package com.delloite.company;

public class ConstructorCallingTest {

	static int i,j;
	
	public ConstructorCallingTest() {
		i = 15;
	}


	public ConstructorCallingTest(int a, int b) {
		i = a;
		j = b;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorCallingTest obj = new ConstructorCallingTest(2,3);
		System.out.println(obj.i);
		ConstructorCallingTest obj1 = new ConstructorCallingTest();
		System.out.println(obj1.i);
	}

}
