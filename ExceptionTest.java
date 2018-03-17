package com.delloite.exception;

public class ExceptionTest {

	public static void add() throws Test1, Test2 {
		int a = 10;
		if (a == 20) {
			throw new Test1();
		} else {
			throw new Test2();
		}
	}

	public static void main(String args[]) throws Test1, Test2 {
		add();
	}
}
