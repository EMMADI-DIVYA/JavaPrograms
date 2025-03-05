import java.util.Scanner;
class ArrrayNElements 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter size of array: ");
		int size=sc.nextInt();
		int [] a= new int[size];
		for(int i=0;i<=a.length-1;i++)  // for(int i=0;i<=size-1;i++)
		{
			System.out.print("enter the element in an index " +i +": ");
			a[i]=sc.nextInt();
		}
		for(int i=0;i<=a.length-1;i++)  //for(int i=0;i<=size-1;i++)
		{
			System.out.println(a[i]);
		}
	}
}
