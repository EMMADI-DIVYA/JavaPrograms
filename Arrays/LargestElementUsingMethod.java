package Com;

public class LargestElementUsingMethod {
	public static void LargeAndSmallNum(int []a)
	{
		int largest=0;
		for(int i=0;i<=a.length-1;i++) 
		{
				if(a[i]>largest)
				   largest =a[i];
			
		}
		int secondLargest=0;
	
			for(int j=0;j<a.length-1;j++)
			{
				if(a[j]>secondLargest && a[j]!=largest)
				{
					secondLargest=a[j];
				}
				
			}
			
			int smallest=a[0];
			for(int l=0;l<=a.length-1;l++)
			{
				if(a[l]<smallest)
				{
					smallest=a[l];
				}
			}
			int secondSmallest=a[0];
			
			for(int m=0;m<=a.length-1;m++)
			{
				if(a[m]<secondSmallest && a[m]>smallest)
				{
					secondSmallest=a[m];
				}
				
			}
			
		
		System.out.println("second Largest : "+secondLargest);
		System.out.println("second Smallest : "+secondSmallest);
	}
	
	
	public static void main(String[] args)
	{
		int a[]= {1,2,3,4};
		LargeAndSmallNum(a);

		
	}

}


