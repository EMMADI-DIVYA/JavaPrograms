// spynumber using method
import java.util.Scanner;
class SpyNumUsingRecursion 
{
	public static boolean isSpyNum(int n)
	{
		int temp=n;
		int sum=0;
		int prod=1;
		while(temp!=0)
		{
			int ld=temp%10;
			sum=sum+ld;
			prod=prod*ld;
			temp=temp/10;
		}
		if(sum==prod)
			return true;
		else
			return false;
	}
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num=sc.nextInt();

		if(isSpyNum(num))
			System.out.println(num+" is spy number");
		else
			System.out.println(num+" is not spy number");
	}
}
