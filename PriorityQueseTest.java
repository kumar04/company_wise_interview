package com.delloite.company;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.PriorityQueue;

public class PriorityQueseTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<String> obj = new PriorityQueue<String>();// object insert
																// by default
																// sorting order
																// if user not
																// provide
																// customized
																// order
		obj.add("Vishal");
		obj.add("Amit");
		obj.add("Raj");
		obj.add("Raj");
		obj.add("Shekar");
		// obj.add(null);//null pointer exception,null value is not allowed for
		// PriorityQueue
		System.out.println(obj);
		obj.poll();
		obj.remove();// poll and remove work same operation,remove first
						// object(Queue is performed FIFO order)
		obj.remove();
		System.out.println(obj);
		// obj.clear();//clear means clear the queue,remove all element of the
		// queue
		//obj.offer("Raj");// offer method performed add this value in queue

		//System.out.println("tesdt:" + obj.peek());
		Iterator<String> ite = obj.iterator();
		while (ite.hasNext()) {
			System.out.println(ite.next());
		}

	}

}
