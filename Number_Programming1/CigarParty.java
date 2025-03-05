//program from codingbat(logic 1) question:CigarParty
//program to demostrate the if,else
import java.util.Scanner;
class CigarParty
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter no.of cigers i.e, n value:");
		int n=sc.nextInt();
		System.out.println("enter true (if it is weekend) OR false (if it is not weekend ):");
		boolean day= sc.nextBoolean();
		if((day==true && n>=40) || (day==false && n>=40 && n<=60))
		{
			System.out.println(true);
			
		}
		else 
		{
			System.out.println(false);
		}

	
	}
}
