// program to check Product Of Even Elements Is Prime Or Not
package Com;
import java.util.Scanner;
public class CheckProductOfEvenElementsIsPrimeOrNot {
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.print("enter size of an array : ");
		int size =sc.nextInt();
		int [] a=new int[size];
		for(int i=0;i<=a.length-1;i++)
		{
			System.out.println("enter value in the index " +i+" : ");
			a[i]=sc.nextInt();
			
		}
		int prod=1;
		for(int i=0;i<=a.length-1;i++)	
		{
			
			if(a[i]%2==0)
			{
				prod=prod*a[i];
				
			}
				
		}
		System.out.println("product= "+prod);
        int ProNum=prod;
		boolean isprime=true;
		if (ProNum <= 1)  
		    isprime = false;  

		
		for(int i=2;i<ProNum;i++)
		{
			if(ProNum%i==0)
			{
				isprime=false;
				break;
			}
			
		}
		
		if(isprime)
		{
				System.out.println("product of the even element in the array is prime");
		
		}
		else
		{
			System.out.println("product of the even elements in the array is not prime");
		}
				
				
	}
		
		
}


