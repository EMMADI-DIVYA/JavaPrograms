// two array are same if the numbers are equal (respective of order of elements)
/*package Com;
import java.util.Scanner;
public class CompareTwoArrays {
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("enter size of array a:");
		int size1=sc.nextInt();
		int [] a = new int[size1];
		
		System.out.print("enter size of array b:");
		int size2=sc.nextInt();
		int [] b = new int[size2];
		
		//intialize the array a elements
		System.out.println("enter array a values : ");
		for(int i=0;i<=a.length-1;i++)
		{
			a[i]=sc.nextInt();
			
		}
		
		System.out.println("enter array b values : ");
		//intialize the array a elements 
		for(int i=0;i<=b.length-1;i++)
		{
			b[i]=sc.nextInt();
						
	    }
		boolean iscompare=false;
		if(a.length==b.length)
		{
			for(int i=0;i<=a.length-1;i++)
			{
				if(a[i]==b[i])
				{
					iscompare=true;
				}
				
			}
			
			
		}
		else
		{
			iscompare=false;
			
		}
		if(iscompare)
		{
			System.out.println("Two arrays have same size and compared both arrays.Arrays are equal");
			
		}
		else
		{
			System.out.println("Two arrays not have the same size so,two cannto compare");
		}
		
		
		
	}

}*/




// two array are same if the numbers are equal (irrespective of order of elements)
package Com;
import java.util.Scanner;
public class CompareTwoArrays {
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("enter size of array a:");
		int size1=sc.nextInt();
		int [] a = new int[size1];
		
		System.out.print("enter size of array b:");
		int size2=sc.nextInt();
		int [] b = new int[size2];
		
		//intialize the array a elements
		System.out.println("enter array a values : ");
		for(int i=0;i<=a.length-1;i++)
		{
			a[i]=sc.nextInt();
			
		}
		
		System.out.println("enter array b values : ");
		//intialize the array a elements 
		for(int i=0;i<=b.length-1;i++)
		{
			b[i]=sc.nextInt();
						
	    }
		boolean iscompare=false;
		if(a.length==b.length)
		{
			for(int i=0;i<=a.length-1;i++)
			{
				for(int j=0;j<=b.length-1;j++)
				{
					if(a[i]==b[j])
					{
						iscompare=true;
					}
					
				}
				
				
			}
			
			
		}
		else
		{
			iscompare=false;
			
		}
		if(iscompare)
		{
			System.out.println("Two arrays have same size and compared both arrays.Arrays are equal");
			
		}
		else
		{
			System.out.println("Two arrays not have the same size so,two cannto compare");
		}
		
		
		
	}

}
