package com.nongeneric.arraystack.tester;

import java.util.Scanner;

import com.nongeneric.arraystack.core.Stack;

public class Tester {

	public static void main(String[] args)
	{
		try (Scanner scanner = new Scanner(System.in))
		{
			System.out.print("Enter Size of Stack: ");
			Stack stack = new Stack(scanner.nextInt());
			boolean exit = false;
			System.out.println("\t\t\t\tStack With Growable Array!");
			
			while(!exit)
			{
				System.out.print(   "\n1. Push\n"
									+ "2. Pop\n"
									+ "3. Peek\n"
									+ "4. Display\n"
									+ "5. isEmpty?\n"
									+ "0. EXIT\n\n"
									+ "CHOICE: ");
				switch (scanner.nextInt())
				{
				case 1:
					System.out.print("Enter Value: ");
					stack.push(scanner.nextInt());
					System.out.println("Pushed!");
					break;

				case 2:
					System.out.println("Popped: "+stack.pop());
					break;
					
				case 3:
					System.out.println("Peeked: "+stack.peek());
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
		}
	}

}
