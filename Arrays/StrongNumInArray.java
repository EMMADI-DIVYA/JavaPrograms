package Com;

import java.util.Scanner;
public class StrongNumInArray {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size of an array : ");
		int size = sc.nextInt();
		int [] a = new int[size];
	
		for(int i=0;i<=a.length-1;i++)
		{
			System.out.print("Enter value for the index  : ");
			a[i]=sc.nextInt();
			
		}
		for(int i=0;i<=a.length-1;i++)
		{
			int num=a[i];
			int temp=num;
			int sum=0;
			while(temp!=0) 
			{
				int ld=temp%10;
				int pro=1;
				for(int j=1;j<=ld;j++)
				{
					pro=pro*j;
					
				}
				sum=sum+pro;
				temp=temp/10;
				
			
		
			}
			if(sum==num)
			{
				System.out.println(sum+" "+num);
				
			}
			
			
			
			
		}
		
	}

}
