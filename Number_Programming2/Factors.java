import java.util.Scanner;
class Factors 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number:");
		int n= sc.nextInt();
		System.out.println("The Factors of " +n+ " is:");
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				System.out.println(i);
			}

		}
	}
}
