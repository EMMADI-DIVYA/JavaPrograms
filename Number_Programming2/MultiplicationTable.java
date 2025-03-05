//multiplication table of a given number 
import java.util.Scanner;
class MultiplicationTable 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter a number:");
		int n=sc.nextInt();
		System.out.println("multiplication table of a "+n);
		for(int i=1;i<=10;i++)
		{
			System.out.println(n+" X "+i+" = "+n*i);
		}

	}
}
