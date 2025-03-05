// program from codingbat(logic 1)  question:DateFashion
//program to demonstrate if, else if ,else
import java.util.Scanner;
class DateFashion
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter 2 members rating for stylishness  i.e a and b values between (0 to 10):");
		int a =sc.nextInt();
		int b =sc.nextInt();
		if(a<=2 || b<=2)
		{
			System.out.println(0);
		}
		
		else if(a>=8 || b>=8)
		{
			System.out.println(2);
		}

		else
		{
			System.out.println(1);
		}

	}
}
