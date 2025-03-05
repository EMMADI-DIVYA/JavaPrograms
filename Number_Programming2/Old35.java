//program from codingbat question:Old35
//program to demon
import java.util.Scanner;
class Old35
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number i.e, n value :");
		int n = sc.nextInt();
		if(n%3==0&&n%5==0)
		{
			System.out.println(false);
		}
		else if(n%3==0 || n%5==0)
		{
			System.out.println(true);
		}
		else
		{
			System.out.println(false);
		}

	}
}
