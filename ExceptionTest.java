package com.delloite.company;

public class ExceptionTest {

	public static void throwit() {
		System.out.println("A ");
		throw new RuntimeException();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.println("B ");
			throwit();
		} catch (Exception e) {
			System.out.println("C ");
		} finally {
			System.out.println("D ");
		}
		System.out.println("E ");
	}

}
