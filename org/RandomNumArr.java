package org;

import java.util.Random;

public class RandomNumArr {
	
	
	public static void main(String[] args)
	{
		Random r= new Random();
		int n=r.nextInt(123456);
     
		System.out.println(n+"is randome number");
		
		int temp=n;
		int count=0;
		
		while(temp!=0)
		{
			count++;
			temp/=10;
		}
		int a[]=new int[count];
	    int temp2=n;
		
			while(temp2!=0)
			{
				
				for(int j=count-1;j>=0;j--)
				{
					int ld2=temp2%10;
					a[j]=ld2;
					temp2/=10;
				}
				
			}
			for(int k=0;k<=a.length-1;k++)
			{
				System.out.println(a[k]);
			}
		
	}

}
