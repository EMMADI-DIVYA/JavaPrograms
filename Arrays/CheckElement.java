package Com;

import java.util.Scanner;
public class CheckElement {
	public static String CheckNum(int a[],int n)
	{
		boolean ispresent=false;
		for(int i=0;i<=a.length-1;i++)
		{
			
			if(a[i]==n)
			{
				ispresent=true;
				return "yes given element is present";
			}
		}
			if(ispresent==false)
			{
				return "given element is not present";
			}
			return "";
			
			/*else
			{
				System.out.println(n+" is not found in the array.");
				break;
			}*/
		
		
	}
	
	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		int [] a= {7,1,5,6};
		System.out.print("enter a number to check wheather element is present or not : ");
		int n=sc.nextInt();
		String result=CheckNum(a,n);
		System.out.println(result);
		
		
	}

}
