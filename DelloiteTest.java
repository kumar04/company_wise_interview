package com.delloite.company;

public class DelloiteTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] a ={'a','v'};
		String s1 = a;//Note:compile time error char array can't assign to string types
		String s2 = new String(s1);
		System.out.println(s1);
		System.out.println(s2);
	}

}
