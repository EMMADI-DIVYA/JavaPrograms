import java.util.Scanner;
class LargestOf3Numbers 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter first number:");
		int n1=sc.nextInt();
		System.out.print("Enter second number:");
		int n2=sc.nextInt();
		System.out.print("Enter third number:");
		int n3=sc.nextInt();
		int largest = (n1>n2) ? ((n2>n3)?n2:n3) : ((n2>n3)?n2:n3);
		System.out.println("largest among 3 numbers is: " +largest);
	}
}
