

// program to check the given number is disarium number or not
import java.util.*;
class DisariumNumberUsingMethod 
{
	public static int countDigits(int n)
	{
       int temp1=n;
	   int count=0;
	   while(temp1!=0)
		{
		   temp1=temp1/10;
		   count++;
		}
		return count;
	}
	public static boolean DisariumNumber(int n)
	{
		int sum=0;
		int c=countDigits(n);
		int temp2=n;
	
	    while(temp2!=0)
	    {
		 
		   int ld=temp2%10;
		   int prod=1;
		   for(int i=1;i<=c;i++)
			{
			  prod=prod*ld;
			}
			 sum=sum+prod;
			  temp2=temp2/10;
			  c--;
		}
	 
	  if(sum==n)
		return true;
	  else
		  return false;

	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int n=sc.nextInt();
		if(DisariumNumber(n))
			System.out.println("Disarium Number");
		else
			System.out.println("Not Disarium Number");

		
	}
}
