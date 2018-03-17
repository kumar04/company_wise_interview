package com.delloite.thread;

public class Test extends Thread implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("inside run method");
	}

	public static void main(String[] args) {
		try{
			Test t = new Test();
			Test t2 = new Test();
			new Thread(t2);
			//new Thread(t2);
			t.start();
			t2.start();
		}catch(Exception ex){
			System.out.println(ex);
		}
	}
}
