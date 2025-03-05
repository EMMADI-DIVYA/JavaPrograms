// do the sum of the digits till we get single digit
import java.util.Scanner;
class SumOfDigitsToSingleDigit 
{
	public static int SumofDigits(int n)
	{
      if(n>=1 && n<=9)
		  return n;
	  
	  else 
		{
		  int sum=(n%10)+SumofDigits(n/10);
		  return SumofDigits(sum);
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number : ");
		int n=sc.nextInt();
		System.out.println(SumofDigits(n));

	}
}
