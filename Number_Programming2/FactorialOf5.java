import java.util.Scanner;
class FactorialOf5 
{
	public static void main(String[] args) 
	{
		int product=1;
		System.out.println("Factorial of 5 is:");
		for(int i=1;i<=5;i++)
		{
			product=product*i;
		}
		System.out.println(product);
	}
}
