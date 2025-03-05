import java.util.Scanner;
class NextPrimeNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		int x = sc.nextInt();
		
		for(int n=x+1; true; n++)
		{
			boolean isprime=true;
			for(int i=2;i<n;i++)
			{
				if(n%i==0)
				{
					isprime=false;
				}
			}
			if(isprime)
			{
				System.out.println(n);
				break;
			}
		}
		
	}
}
