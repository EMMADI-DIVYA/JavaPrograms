// program codinbat(logic 1)  question:NearTen
//program to demonstrate the if ,else
import java.util.Scanner;
class NearTen 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number i.e, n value:");
		int n = sc.nextInt();
		if (n%10==0 || n%10==1 || n%10==2 || n%10==8 || n%10==9)
		{
			System.out.println(true);
		}
		else
		{
			System.out.println(false);
		}
	}
}
