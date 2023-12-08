import java.util.Scanner;

public class PalindromeOrNot {

	static int number;
	static int mul=1;
	public static int reverse(int num)
	{
		if(num == 0)
			return 0;
		number += (num%10)*mul;
		mul *= 10;
		reverse(num/10);
		return number;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter Number: ");
		int original = scanner.nextInt();
		int updated = reverse(original);
		if(updated-original==0)
			System.out.println("Palindrome!");
		else
			System.out.println("Not Palindrome!");
	}
	
}
