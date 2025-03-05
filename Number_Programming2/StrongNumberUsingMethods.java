import java.util.Scanner;
class  StrongNumberUsingMethods
{
	public static int factorial(int n)
	{
		int fact=1;
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		return fact;
	}

	public static int sumOfDigits(int n)
	{
		int sum=0;
		while(n!=0)
		{
			int digit=n%10;
			sum=sum+factorial(n);
			n=n/10;
		}
		return sum;
	}


	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.print("enter a number:");
		int n=sc.nextInt();
		if(sumOfDigits(n)==n)
		{
			System.out.print("strong number");
		}
		else
		{
            System.out.print("strong number");
		}


	}
}
