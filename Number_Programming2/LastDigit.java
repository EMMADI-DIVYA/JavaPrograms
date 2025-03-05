// program from codingbat question:LastDigit
//program to demostrate if and else.
import java.util.Scanner;
class LastDigit 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in); 
		System.out.print("Enter 3 numbers i.e, a,b and c values:");
		int a= sc.nextInt();
		int b= sc.nextInt();
		int c= sc.nextInt();
		if(a%10==b%10 || b%10==c%10 || c%10==a%10)
		{
			System.out.println(true);
		}
		else
		{
			System.out.println(false);
		}
	}
}
