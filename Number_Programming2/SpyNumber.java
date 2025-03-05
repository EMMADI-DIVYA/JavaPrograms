// spy number program (while loop demostration)
import java.util.Scanner;
class SpyNumber 
{
	public static void main(String[] args) 
	{
	    Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = sc.nextInt();
		int sum=0;
		int product=1;
		while(n!=0)
		{
			int ld=n%10;
			sum=sum+ld;
			product=product;
			n=n/10;
		}
		if(sum==product)
		{
			System.out.println("is a spy number");
		}
		else
		{
			System.out.println("not a spy number");
		}



	}
}
