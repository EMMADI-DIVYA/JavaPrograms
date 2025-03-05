//program from coodingbat    question:Love6
//program to demostrate the if,else 
import java.util.Scanner;
class Love6 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter 2 numbers i. a and b values:");
		int a= sc.nextInt();
		int b= sc.nextInt();
		if(a==6 || b==6 || a+b==6 || a-b==6 || b-a==6)
		{
			System.out.println(true);
		}
		else
		{
           System.out.println(false);
		}

	}
}
