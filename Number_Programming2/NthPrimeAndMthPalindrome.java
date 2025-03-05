import java.util.*;
class NthPrimeAndMthPalindrome 
{
	public static void nthPrime(int n)
	{
     
	  int count=0;
	  
	  for(int i=2;count<n;i++)
		{
		  boolean isprime=true;
		  
		  for(int j=2;j<i;j++)
			{
			  if(i%j==0)
				  isprime=false;
			}
		}
		if(isprime)
		{
			count++;
		}
		if (count==5)
		{
			System.out.print(i);
		}

	}
	public static void mthPalindrome(int n)
	{
	  int count=0;
	  int temp2=n;
	  int rev=0;
	  
	  for(int i=1;count<m;i++)
		{

		   boolean ispalindrome=false;

			while(temp2!=0)
			{
				int ld=temp2%10;
				rev=rev*10+ld;
				temp1=temp1/10;
			}
			if(n==rev)
			{
				return true;
				count1++;
			}
		}
			
			if(count==m)
			{
				if(ispalindrome)
					System.out.print(i);
					
			}
		}


	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter n value : ");
		int n=sc.nextInt();
		System.out.println("enter m value : ");
		int m=sc.nextInt();
		int r1=nthPrime(n);
		int r2=mthPalindrome(n);
		if(r1==r2)
			System.out.print("number is equal : "+r1);
		else
			System.out.print("number is not equal");
			
	}
}


