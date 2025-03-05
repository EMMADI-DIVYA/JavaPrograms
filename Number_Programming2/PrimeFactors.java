import java.util.Scanner;
class PrimeFactors 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n=sc.nextInt();
		System.out.println("prime factors of "+n +" are : ");
		for(int i=1;i<=n;i++)
		{
			boolean isprime=true;

			if(n%i==0)
			{
				
				if(i==1)
				{
					isprime=false;
				}
				for(int j=2;j<i;j++)
				{
					if(i%j==0)
					{
						isprime=false;
						break;
						
					}
				}
			}

			else
			{
				isprime=false;
			}

			if(isprime)
			{
				System.out.println(i);
			}
		}

	}
}
