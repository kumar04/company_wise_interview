package com.societegeneral;

import java.util.ArrayList;
import java.util.List;

public class AddArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		System.out.println(list.toString());
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i));
			if (i != 2) {
				System.out.print(",");
			}
		}
	}
}
