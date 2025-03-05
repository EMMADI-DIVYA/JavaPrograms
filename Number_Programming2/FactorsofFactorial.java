// program to find the factors of the factorial of a number
import java.util.Scanner;
class FactorsofFactorial 
{
	public static long factorial(long n)
	{
		long  prod=1;
		if (n==0 || n==1)
		{
			prod=1;
		}
		else
		{
		
		for(int i=1;i<=n;i++)
		{
			prod=prod*i;
		}
		}
	    return prod;
	}
	public static void FactorsOfFactorialofNumber(long n)
	{
		long fact=factorial(n);
		for(int i=1;i<=fact;i++)
		{
		   if(fact%i==0)
		   {
					
			   System.out.println(i);
					
			}
			
			
		}
    }


	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter a number : ");
		long n= sc.nextLong();
		FactorsOfFactorialofNumber(n);
	}
}
