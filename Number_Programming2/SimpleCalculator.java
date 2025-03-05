// example for else if
//simple calculator for arthmetic operator
import java.util.Scanner;
class SimpleCalculator
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("====================================================================================================");
		System.out.println("                                          Simple Calculator");
		System.out.println("====================================================================================================");
		System.out.print("enter first number:");
		double n1 = sc.nextInt();
		System.out.print("enter second number:");
		double n2 = sc.nextInt();
		System.out.print("enter Arthimetic operator:");
		char ch = sc.next().charAt(0);
		if (ch=='+')
		{
          System.out.println("Sum of the numbers is :"+(n1+n2));
		}
		else if (ch=='-')
		{
          System.out.println("Difference of the numbers is :"+(n1+n2));
		}
		else if (ch=='*')
		{
          System.out.println("Product of the numbers is :"+(n1*n2));
		}
		else if (ch=='/')
		{
          System.out.println("Qutotient of the numbers is :"+(n1/n2));
		}
		else if (ch=='%')
		{
          System.out.println("Remainder of the numbers is :"+(n1%n2));
		}
		else
		{
           System.out.println("enter valid operator:");
		}



	}
}
