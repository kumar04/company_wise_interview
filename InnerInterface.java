package com.societegeneral;

public class InnerInterface {

	interface Sample{
		String change(int f);
	}
	class Mytest implements Sample{
		public String change(int s){
			return "test";
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sample s = (change((10)->{return ""}));
	}

}
