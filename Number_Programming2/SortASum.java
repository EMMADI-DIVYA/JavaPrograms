//program from codingbat question:SortASum
//program to demostrate the if,else
import java.util.Scanner;
class SortASum 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter 2 number  i.e, a and b values: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		if(a+b>=10 && a+b<=19)
		{
			System.out.println(20);
		}
		else
		{
			System.out.println(a+b);
		}
	}
}
