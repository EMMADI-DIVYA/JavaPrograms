//program for swaping of 2 numbers without using 3rd variable
import java.util.Scanner;
class Swap2num 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter first number(n1): ");
		int n1=sc.nextInt();
		System.out.print("Enter second number(n2): ");
		int n2=sc.nextInt();
		System.out.println("Two numbers before swaping i.e n1 = "+ n1 +" "+"n2 = "+n2);
		n1=n1+n2;
		n2=n1-n2;
		n1=n1-n2;
		System.out.println("Two numbers after swaping i.e n1 = "+ n1 +" "+"n2 = "+n2);


	}
}
