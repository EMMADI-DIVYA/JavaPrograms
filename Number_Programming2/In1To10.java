// program from codingbat question:In1To10
//program to demostrate if,else
import java.util.Scanner;
class  In1To10 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter number i.e, a value: ");
		int a =sc.nextInt();
		System.out.print("enter outsideMood boolean value (true or false) : ");
		boolean outsideMode= sc.nextBoolean();
		if(outsideMode==false)
		{
			if(a>=1 && a<=10)
			{
				System.out.println(true);
			}
			else
			{
				System.out.println(false);
			}
		}
		else
		{
			if(a<=1 || a>=10)
			{
				System.out.println(true);
			}
			else
			{
				System.out.println(false);
			}
		}
	}
}
