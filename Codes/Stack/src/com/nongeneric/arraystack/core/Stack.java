package com.nongeneric.arraystack.core;

import java.util.Arrays;

import com.nongeneric.arraystack.exception.StackCustomExceptions;

public class Stack {

	private int arr[];
	private int top;

	public Stack()
	{
		this.arr = new int[10];
		this.top = -1;
	}

	public Stack(int size)
	{
		this.arr = new int[size];
		top = -1;
	}

	public void push(int val)
	{
		if (this.top == arr.length - 1) arr = Arrays.copyOf(arr, arr.length * 2);
		top++;
		arr[top] = val;
	}

	public boolean isEmpty()
	{
		return top == -1 ? true : false;
	}

	public int pop()
	{
		try
		{
			if (isEmpty()) throw new StackCustomExceptions("Stack is Empty!");
			return arr[top--];
		} catch (StackCustomExceptions e)
		{
			System.err.println(e.getMessage());
		}
		return Integer.MIN_VALUE; // Garbage
	}

	public int peek()
	{
		try
		{
			if (isEmpty()) throw new StackCustomExceptions("Stack is Empty!");
			return arr[top];
		} catch (StackCustomExceptions e)
		{
			System.err.println(e.getMessage());
		}
		return Integer.MIN_VALUE; // Garbage
	}

	public void display()
	{
		if (isEmpty())
		{
			System.err.println("Stack is Empty!");
			return;
		}

		for (int i = top; i >= 0; i--)
			System.out.print(arr[i] + " ");
	}

}
