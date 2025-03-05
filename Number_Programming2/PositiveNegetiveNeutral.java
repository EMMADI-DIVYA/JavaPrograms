import java.util.Scanner;
class PositiveNegetiveNeutral 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter first number:");
		int n=sc.nextInt();
		if (n>0)
		{
			System.out.println(n+" is positive number");
		}
		else if (n<0)
		{
			System.out.println(n+" is negetive number");
		}
		else
        {
			System.out.println(n+" is neutral number");

		}
		
		

	}
}
