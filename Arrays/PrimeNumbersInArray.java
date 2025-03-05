package Com;

import java.util.Scanner;
public class PrimeNumbersInArray {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter size of an array : ");
		int size=sc.nextInt();
		int a[]=new int[size];
		for(int i=0;i<=a.length-1;i++)
		{
			System.out.println("enter element in the index "+i+" : ");
			a[i]=sc.nextInt();
		}
		System.out.println("prime numbers in the array are : ");

		for(int i=0;i<=a.length-1;i++)
		{
			boolean isprime=true;
			
			if(a[i]==1 || a[i]==0)
			{
				isprime=false;
			}
			else
			{
				for(int j=2;j<a[i];j++)
				{
					if(a[i]%j==0)
					{
						isprime=false;
					}
				}
			}
			
			if(isprime)
			{
				System.out.println(a[i]);
			}
			
		}
		   
	}

}
