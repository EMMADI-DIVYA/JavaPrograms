import java.util.Scanner;
class ArmStrongNum 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n= sc.nextInt();
		int temp=n;
		int count=0;
		while(temp!=0)
		{
			count++;
			temp=temp/10;
		}
		int sum=0;
		temp=n;
		while(temp!=0)
		{
			int ld=temp%10;
			int prod=1;
			for(int i=1;i<=count;i++)
			{
				prod=prod*ld;
			}
			sum=sum+prod;
			temp=temp/10;
		}
		if(sum==n)
		{
			System.out.println(n+" is ArmStrong Number.");
		}
		else
		{
			System.out.println(n+" is not ArmStrong Number.");
		}
	}
}
