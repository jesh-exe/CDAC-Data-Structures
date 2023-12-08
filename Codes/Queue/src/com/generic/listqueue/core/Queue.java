package com.generic.listqueue.core;

import java.util.ArrayList;
import java.util.EmptyStackException;

public class Queue<T>{
	
	private ArrayList<T> arr;
	private int rear;
	private int front;
	
	public Queue()
	{
		this.arr = new ArrayList<T>();
		this.rear = this.front = 0;
	}
	public Queue(int size)
	{
		this.arr = new ArrayList<T>(size);
		this.rear = this.front = 0;
	}
	
	public boolean isEmpty()
	{
		return front == rear ? true : false;
	}
	
	public void enqueue(T val)
	{
		arr.add(val);
		rear++;
	}
	
	public T dequeue()
	{
		if(isEmpty())
			throw new EmptyStackException();
		
		return arr.get(front++);
	}
	
	public T peek()
	{
		if(isEmpty())
			throw new EmptyStackException();
		
		return arr.get(front);
	}
	
	public void display()
	{
		if(isEmpty())
			throw new EmptyStackException();
		
		for(int i=front ; i<rear ; i++)
			System.out.print(arr.get(i) + " ");
	}
	

}
