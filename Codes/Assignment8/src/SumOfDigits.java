import java.util.Scanner;

public class SumOfDigits {

	public static int sumOfDigits(int a)
	{
		if(a==0)
			return 0;
		
		return ((a%10)+(sumOfDigits(a/10)));
	}
	
	public static void main(String[] args){
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the Number: ");
		System.out.println(sumOfDigits(scanner.nextInt()));

	}
	
}
