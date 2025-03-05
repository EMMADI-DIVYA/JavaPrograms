import java.util.Scanner;
class SumOfFactors 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter a number:");
		int n=sc.nextInt();
		int sum=0;
		System.out.println("sum of the factors of "+n+" is: ");
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				sum=sum+i;
			}
		}
		System.out.println(sum);
	}
}
