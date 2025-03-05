//program from coodingbat   question:LessBy10
//program to demonstrate the if,else
import java.util.Scanner;
class LessBy10 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter three numbers i.e a,b and c values :");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		if(a-b>=10 || b-c>=10 || c-a>=10 || b-a>=10 || c-b>=10 ||a-c>=10)
		{
			System.out.println(true);
		}
		else
		{
			System.out.println(false);
		}
	}
}
