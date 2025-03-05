//question from codingbat
// program to demonstrate the if,else
import java.util.Scanner;
class TeenSum 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a and b values:");
		int a =sc.nextInt();
		int b =sc.nextInt();
		if(a>=13 && a<=19 || b>=13 && b<=19)
		{
			System.out.println(19);
		}
		else
		{
          System.out.println(a+b);
		}
	}
}
