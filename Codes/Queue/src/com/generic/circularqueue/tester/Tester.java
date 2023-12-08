package com.generic.circularqueue.tester;

import com.generic.circularqueue.core.CircularQueue;

public class Tester {

	public static void main(String[] args)
	{
		
		CircularQueue<Integer> queue = new CircularQueue<Integer>(5);
		queue.enqueue(1);
		queue.enqueue(2);
		queue.enqueue(3);
		queue.enqueue(4);
//		queue.enqueue(5);
		queue.display();
		System.out.println();
		
		System.out.println(queue.dequeue());
//		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		
		queue.enqueue(6);
		queue.enqueue(8);
		
		queue.display();
		
	}
	
}
