package com.generic.liststack.tester;

import java.util.Scanner;

import com.generic.liststack.core.Stack;

public class Tester {

	public static void main(String[] args)
	{
		
		Scanner scanner = new Scanner(System.in);
		
		Stack<String> stack = new Stack<>();

//		Stack<Integer> stack = new Stack<>();
//		Stack<Double> stack = new Stack<>();
//		Stack<Float> stack = new Stack<>();
		
		boolean exit = false;
		
		while (!exit)
		{
			System.out.print("\n1. Push\n" + "2. Pop\n" + "3. Peek\n" + "4. Display\n" + "5. isEmpty?\n" + "0. EXIT\n\n"
					+ "CHOICE: ");
			switch (scanner.nextInt())
			{
			case 1:
				System.out.print("Enter Value: ");
				stack.push(scanner.next());
				System.out.println("Pushed!");
				break;

			case 2:
				System.out.println("Popped: " + stack.pop());
				break;

			case 3:
				System.out.println("Peeked: " + stack.peek());
				break;

			case 4:
				System.out.print("Printing Stack Elements: ");
				stack.display();
				System.out.println();
				break;

			case 5:
				System.out.println(stack.isEmpty());
				break;

			case 0:
				exit = true;
				break;
			default:
				System.err.println("Invalid Input");
				break;
			}

		}
		scanner.close();
	}

}
