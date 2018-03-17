package com.societegeneral;

import java.util.ArrayList;
import java.util.List;

public class ArrayListPrimeNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<Integer>();
		
		list.add(13);
		list.add(4);
		int num=0,count = 0,rem=0;
		for(int i=0;i<list.size();i++){
			num = list.get(i);
			if(num==0){
				throw new NullPointerException("Zero is positive number");
			}
			while(num!=0){
				num = i/2;
				rem = i%2;
				count++;
				num = rem;
			}
			if(count>=1){
				System.out.println(list.get(i)+" is a prime number");
			}
		}
		
	}
}
