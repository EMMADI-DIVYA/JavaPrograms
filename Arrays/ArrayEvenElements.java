package Com;

import java.util.Scanner;
public class ArrayEvenElements {
	public static void main(String[] args)
	{
	   Scanner sc = new Scanner(System.in);
	   System.out.print("Enter size of an array : ");
	   int size = sc.nextInt();
	   //declaration of an array
	   int [] a= new int[size];
	   //access the array values from user and store them in that array
	   for(int i=0;i<=a.length-1;i++) // i values are the index's of array
	   {
		   System.out.print("enter the element for the index "+i +": ");
		   a[i]=sc.nextInt();
		   
	   }
	   //printing the even elements which is present in the array
	   System.out.println("Even elements in the array are : ");
	   for(int i=0;i<=a.length-1;i++)
	   {
		   if(a[i]%2==0)
		   {
			   System.out.println(a[i]);
		   }
	   }
	
	}
	
	
	

}
