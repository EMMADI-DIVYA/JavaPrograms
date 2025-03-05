// program codinbat(logic 1)  question:More20
//program to demonstrate the if ,else
import java.util.Scanner;
class More20 
{
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value i.e, n value:");
		int n = sc.nextInt();
		if(n%20==1 || n%20==2)
		{
			System.out.println(true);
		}
		else
		{
			System.out.println(false);
		}


		
	}
}
