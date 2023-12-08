import java.util.Scanner;

public class FactorialOfNumber {

	public static int factorial(int num)
	{
		if(num == 0)
			return 1;
		
		return num * factorial(--num);
	}
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number: ");
		System.out.println(factorial(scanner.nextInt()));
	}
	
}
