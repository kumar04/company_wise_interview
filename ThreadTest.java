package com.delloite.company;

public class ThreadTest extends Thread {

	@Override
	public void run() {
		System.out.println("run() method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		(new Thread(new ThreadTest())).run();
		
	}

}
