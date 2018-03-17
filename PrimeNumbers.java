package com.societegeneral;

import java.util.ArrayList;
import java.util.List;

class PrimeNumbers {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(10);
		list.add(17);
		list.add(20);
		list.add(23);
		boolean checkPrime = false;
		for (int i = 0; i <= list.size() - 1; i++) {
			checkPrime = isPrime(list.get(i));
			if (checkPrime) {
				System.out.println(list.get(i) + " is a prime number");
			}
		}

	}

	private static boolean isPrime(int n) {
		for (int i = 2; i < n; i++) {
			if (n % i == 0)
				return false;
		}
		return true;
	}
}