import java.util.Scanner;
class ArmStrongNum1ton
{
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter n value : ");
		int n=sc.nextInt();
		for(int j=1;j<=n;j++)
		{
			int temp=j;
			int count=0;
			while(temp!=0)
			{
				count++;
				temp=temp/10;
			}
			int sum=0;
			temp=j;
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
			if(sum==j)
			{
				System.out.println(j);
			}
		
		}
	}
}
