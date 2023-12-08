package com.array.tester;

import java.util.Arrays;
import java.util.Scanner;
import static com.array.utils.BasicFunctionality.*;

public class Assignment1 {

	public static void main(String[] args) {

		try (Scanner scanner = new Scanner(System.in)) {

			System.out.print("Enter the size of the array: ");
			int[] arr = new int[scanner.nextInt()];

			System.out.println("Enter " + arr.length + " Elements of array");
			for (int i = 0; i < arr.length; i++)
				arr[i] = scanner.nextInt();

			boolean exit = false;

			while (!exit) {
				System.out.print("\n1. Display the array\r\n" + "2. Reverse the array\r\n"
						+ "3. Replace the nth element from the array and print\r\n"
						+ "4. Find the addition of all elements of the array\r\n"
						+ "5. Find the maximum number from the array\r\n"
						+ "6. Print the average of all the elements from the array.\r\n"
						+ "7. Display the even and odd number from the array separately\n" + "0. EXIT\n\n"
						+ "CHOICE : ");

				switch (scanner.nextInt()) {

				case 1:
					Arrays.stream(arr).forEach(ele -> System.out.print(ele + " "));
					break;
					
				case 2:
					arr = reverseArray(arr);
					Arrays.stream(arr).forEach(ele -> System.out.print(ele + " "));
					break;
					
				case 3:
					System.out.print("Enter position & new element: ");
					int pos = scanner.nextInt();
					int element = scanner.nextInt();
					if (pos >= arr.length)
						System.out.println("\nInvalid Position!\n");
					else
						arr[pos] = element;
					break;
					
				case 4:
					System.out.println(Arrays.stream(arr).sum());
					break;
					
				case 5:
					System.out.println(Arrays.stream(arr).max().orElseThrow());
					break;
					
				case 6:
					System.out.println((double)((Arrays.stream(arr).sum())/arr.length));
					break;
					
				case 7:
					System.out.print("\nEven Elements: ");
					Arrays.stream(arr).filter(ele -> ele%2==0).forEach(ele -> System.out.print(ele+" "));
					System.out.print("\nOdd Elements: ");
					Arrays.stream(arr).filter(ele -> ele%2!=0).forEach(ele -> System.out.print(ele+" "));
					break;

				default:
					break;
				}

			}

		}
	}

}
