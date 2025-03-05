// elements should be printed in the reverse order
import java.util.Scanner;
class ArrayElementsReverse 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter  array size :");
		int size = sc.nextInt();
		int [] a =new int[size];
		for(int i =0;i<=a.length-1;i++)
		{
			System.out.print("enter element for an index "+i+" : ");
			a[i]=sc.nextInt();

		}
		for(int i=(a.length-1);i>=0;i--)
		{
			System.out.println(a[i]);
		}


	}
}
