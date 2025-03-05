package Com;
import java.util.Scanner;
public class SumOfElementsInArray {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter size of an array : ");
		int size = sc.nextInt();
		int sum=0;
		//declaration of the array
		int [] a = new int [size];
		//accessing the elements of array from the user
		for(int i=0;i<=a.length-1;i++)
		{
			System.out.print("enter element for the index "+ i+"  : ");
			a[i]=sc.nextInt();
			
		}
		//summation of the elements of the array
		for(int i=0;i<=a.length-1;i++)
		{
			sum=sum+a[i];
		}
		System.out.println("sum of th elements of the array is  : "+sum);
	}
				
}


