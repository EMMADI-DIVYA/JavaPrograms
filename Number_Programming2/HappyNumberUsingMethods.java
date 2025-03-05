//program to check wheather number is happy number or not.
//happy number:sum of squares of each digit in a given number is recursively calculated as 1.
import java.util.Scanner;
class  HappyNumberUsingMethods
{
	public static int sumOfSquaresOfDigit(int n)
	{
		int sum=0;
		while(n>0)
		{
			int d=n%10;
			sum=sum+d*d;
			n=n/10;
		}
		return sum;
	}
	public static boolean isHappyNumber(int n)
	{
		if(n==1)
			return true;
		else if (n==4)
		{
			return false;
		}
		else
		{
           return isHappyNumber(sumOfSquaresOfDigit(n));
		}
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number : ");
		int n=sc.nextInt();
		if(isHappyNumber(n))
		{
			System.out.println(n+" is happy number");
		}
		else
		{
			System.out.println(n+" is not happy number");
		}
	}

}
