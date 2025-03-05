//prgram from codingbat question:MaxMod5
//program to demostrate if,else
import java.util.Scanner;
class MaxMod5 
{
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.print("enter 2 numbers i.e, a and b values :");
		int a= sc.nextInt();
		int b=sc.nextInt();
		if(a==b)
		{
			System.out.println(0);
		}

		if(a%5==b%5)
		{
			if(a>b)
			{
				System.out.println(b);
			}
			else
			{
				System.out.println(a);
			}
		}

        if(a>b)
			{
			System.out.println(a);
			}
        else
			{
			System.out.println(b);
			}
	
	}
}