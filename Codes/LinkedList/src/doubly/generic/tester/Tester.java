package doubly.generic.tester;

import java.util.Scanner;

import doubly.generic.core.DoublyLinkedList;
import linkedlist.core.List;

public class Tester {

	public static void main(String[] args)
	{
		try(Scanner scanner = new Scanner(System.in))
		{
			List<String> list = new DoublyLinkedList<>();
			boolean exit = false;
			
			while(!exit)
			{
				System.out.println(" 1. ADD\n"
						+ " 2. ADD AT START\n"
						+ " 3. ADD AT LAST\n"
						+ " 4. REMOVE\n"
						+ " 5. REMOVE AT START\n"
						+ " 6. REMOVE AT LAST\n"
						+ " 7. GET BY INDEX\n"
						+ " 8. GET AT START\n"
						+ " 9. GET AT LAST\n"
						+ "10. DISPLAY");
				
			}
			
			
		}
	}
}
