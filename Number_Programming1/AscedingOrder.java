import java.util.*;
class AscedingOrder 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number");
		int n=s.nextInt();
		int sort=0;
		for(int i=1;i<=9;i++)
		{
			int temp=n;
			while(temp>0)
			{
				int d=temp%10;
				if(i==d)
					sort=sort*10+d;
				temp=temp/10;
			}
		}
		System.out.println(sort);
	}
}
