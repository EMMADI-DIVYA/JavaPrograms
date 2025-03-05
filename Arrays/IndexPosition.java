package Com;

import java.util.Scanner;
public class IndexPosition {
	public static void indexNum(int a[],int n)
	{
		boolean found=false;
		for(int i=0;i<=a.length-1;i++)
		{
			
			if(a[i]==n)
			{
				System.out.println(n + " is found at index " + i);
				found=true;
				break;
				
			}
		
			
		}
		if(found==false)
		{
			 System.out.println(n + " is not found in the array.");
		}
		
		
	}
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter a number:");
		int n= sc.nextInt();
		int a[]= {2,3,4,68,664};
		indexNum(a,n);
		
		
		
	}

}
