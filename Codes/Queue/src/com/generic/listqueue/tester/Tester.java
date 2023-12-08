package com.generic.listqueue.tester;

import java.util.Scanner;
import com.generic.listqueue.core.Queue;

public class Tester {
	
	public static void main(String[] args)
	{
		try (Scanner scanner = new Scanner(System.in))
		{
//			Queue<Integer> queue = new Queue<>();
			Queue<String> queue = new Queue<String>();
			boolean exit = false;
			System.out.println("\t\t\t\tQueue With Growable Array!");
			
			while(!exit)
			{
				System.out.print(   "\n1. Enqueue\n"
									+ "2. Dequeue\n"
									+ "3. Peek\n"
									+ "4. Display\n"
									+ "5. isEmpty?\n"
									+ "0. EXIT\n\n"
									+ "CHOICE: ");
				switch (scanner.nextInt())
				{
				case 1:
					System.out.print("Enter Value: ");
					queue.enqueue(scanner.next());
					System.out.println("Enqueued!");
					break;

				case 2:
					System.out.println("Dequeued: "+queue.dequeue());
					break;
					
				case 3:
					System.out.println("Peeked: "+queue.peek());
					break;
					
				case 4:
					System.out.print("Printing Queue Elements: ");
					queue.display();
					System.out.println();
					break;
					
				case 5:
					System.out.println(queue.isEmpty());
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
