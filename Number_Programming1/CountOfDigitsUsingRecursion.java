import java.util.*;
class CountOfDigitsUsingRecursion
{
	public static int CountOfDigits(int n)
	{
		if(n==0)
			return 0;
		else
		  return 1+CountOfDigits(n/10);
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number : ");
		int num=sc.nextInt();
		System.out.println("no.of digits present in a "+num+" is: "+CountOfDigits(num));

	}

}
