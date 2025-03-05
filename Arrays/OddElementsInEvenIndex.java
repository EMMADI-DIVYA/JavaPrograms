package Com;
import java.util.Scanner;
public class OddElementsInEvenIndex {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter array size : ");
		int size = sc.nextInt();
		//declaration of an array
		int [] arr=new int[size];
		// access the array elements and store
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.print("enter element for index "+i+" : ");
			arr[i]=sc.nextInt();
		}
		//print odd elements in the even index's
		System.out.println("odd elements in the even index : ");
		for(int i=1 ; i<=arr.length-1;i++)
		{
			if(i%2==0 && arr[i]%2!=0)
			{
				System.out.println(arr[i]);
			}
		}
	}
		
}


