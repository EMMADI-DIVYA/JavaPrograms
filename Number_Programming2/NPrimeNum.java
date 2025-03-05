// first n prime numbers
import java.util.Scanner;
class NPrimeNum 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter a number: ");
		int n=sc.nextInt();
		int count=0;
		System.out.println("First "+n+" prime numbers");
		for(int i=2;count<n;i++)
		{
			boolean isprime=true;
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
				{
					isprime=false;
				}

			}
			if(isprime)
			{
				System.out.println(i);
				count++;
			}
		}
		
		
	}
}
