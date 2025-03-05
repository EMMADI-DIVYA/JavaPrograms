//easy program to check wheather a given number is prime or not
import java.util.Scanner;
class PrimeNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int n = sc.nextInt();
		String ans="prime number";
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
			{
			ans="not prime number";
			}

		}
		System.out.println(ans);
	}
}
