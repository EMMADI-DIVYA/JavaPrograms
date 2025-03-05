  import java.util.Scanner;
class ArrayNumSum 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter a size of the array: ");
		int size = sc.nextInt();
		int sum=0;
		int [] a= new int[size];
		for(int i=0;i<=a.length-1;i++)
		{
			System.out.print("enter element in "+ i+" index : ");
			a[i]=sc.nextInt();
		}
		
		for(int i=0;i<=a.length-1;i++)
		{
			sum=sum+a[i];
		}
		System.out.println("Sum of the elemets in an array : "+sum);
	}
}
