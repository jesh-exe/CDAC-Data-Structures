package com.generic.circularqueue.core;

import java.util.ArrayList;
import java.util.EmptyStackException;

public class CircularQueue <E> {

	private ArrayList<E> arr;
	private int rear;
	private int front;
	private int size;

	public CircularQueue(int val)
	{
		size = val;
		arr = new ArrayList<E>(val + 1);
		rear = front = -1;
	}

	public boolean isFull()
	{
		return front == 0 && rear == size - 1 ? true : (front == rear + 1) ? true : false;
	}

	public boolean isEmpty()
	{
		if (front == -1) return true;
		else return false;
	}

	public void enqueue(E val)
	{
		if (isFull())
		{
			System.out.println("Queue is Full!");
			return;
		}

		rear = (rear + 1) % size;
		arr.add(val);

		if (front == -1) front = 0;

	}

	public E dequeue()
	{
		if (isEmpty()) throw new EmptyStackException();

		E val = arr.get(front);

		if (front == rear)
		{
			front = -1;
			rear = -1;
		}
		else
		{
			front = (front + 1) % size;
		}
		return val;
	}

	public E peek()
	{
		if (isEmpty()) throw new EmptyStackException();

		return arr.get(front);
	}

	public void display()
	{
		if (isEmpty()) throw new EmptyStackException();
		int i;
		for (i = front; i != rear; i = (i + 1) % size)
			System.out.print(arr.get(i) + " ");
		System.out.print(arr.get(i));
	}

}
