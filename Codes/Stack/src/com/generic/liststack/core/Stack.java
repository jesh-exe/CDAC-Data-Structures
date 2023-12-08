package com.generic.liststack.core;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.Iterator;

public class Stack<T> {

	private ArrayList<T> arr;
	int top = -1;

	public Stack()
	{
		this.arr = new ArrayList<T>(10);
		this.top = -1;
	}

	public Stack(int val)
	{
		this.arr = new ArrayList<T>(val);
		top = -1;
	}

	public void push(T val)
	{
		top++;
		arr.add(val);
	}

	public boolean isEmpty()
	{
		return top == -1 ? true : false;
	}

	public T pop()
	{
		if (isEmpty()) throw new EmptyStackException();

		return arr.get(top--);
	}

	public T peek()
	{
		if (isEmpty()) throw new EmptyStackException();

		return arr.get(top);
	}

	public void display()
	{
		if (isEmpty()) throw new EmptyStackException();

		for (int i = top; i >= 0; i--)
			System.out.print(arr.get(i) + " ");

	}

}
