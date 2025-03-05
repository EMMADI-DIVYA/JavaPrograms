import java.util.Scanner;
class CheckPrime 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number:");
		int n = sc.nextInt();
		int count=0;
		for (int i=1;i<=n ;i++ )
		{
			if(n%i==0)
			{
				count++;
			}
		}
		System.out.println("no.of factors are : "+count);
		if(count==2)

		{
			
			System.out.println(n+" is a even  prime number");
		}
		else
		{
			System.out.println(n+" is not a prime number");
		}

	}
}
