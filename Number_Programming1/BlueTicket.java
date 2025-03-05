// program from codingbat   question:BlueTicket
//program to demostrate if,else
import java.util.Scanner;
class  BlueTicket 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter 3 numbers i.e, a,b and c values : ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();

		if(a+b==10 || b+c==10 || c+a==10)
		{
			System.out.println(10);
		}

		else if(a+b==10+(b+c) || a+b==10+(a+c))
		{
			System.out.println(5);
		}
		else
		{
			System.out.println(0);
		}

	}
}
