import java.util.Scanner;

public class SquareOfNumber {

	public static int square(int a, int b)
	{
		if(b==0)
			return 0;
		
		return square(a, b-1) + a;
		
	}
	
	public static void square(int a)
	{
		System.out.println(square(a,a));
	}
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter Num: ");
		square(scanner.nextInt());
	}
	
}
