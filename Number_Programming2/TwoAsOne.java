//question from codingbat:   question:twoAsOne
// program to demonstrate the if,else
import java.util.Scanner;
class TwoAsOne
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 3 numbers i.e a,b and c values:");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		if(a+b==c || a+c==b || b+c==a)
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}

	}
}
