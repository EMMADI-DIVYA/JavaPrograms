import java.util.*;
class Recursion
{
	public static int factorial(int a)
	{
		if(a==0)
			return 1;
		else
		   return a*factorial(a-1);
  
	}
	public static void main(String [] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int n=sc.nextInt();
		System.out.println("factorial of the "+n+" is: "+factorial(n));
	}
}

