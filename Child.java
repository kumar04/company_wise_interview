package com.societegeneral;

public class Child extends Parent{
	
	public Child(){
		super();
		show();
	}
	
	public static void show(){
		System.out.println("Child:show() called");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent child = new Child();
		
		/* 
		 	if not static method then output is 
			Child:show() called
			Child:show() called
		*/
		
		/* 
	 	if static method then output is 
		Parent:show() called
		Child:show() called
	  */
		
		
	}

}
