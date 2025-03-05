package javaprogramstudyhour;

public class MulOfLarAndSmallEleInArr {
	public static void main(String [] args)
	{
		int a[]= {3,5,9,6,4};
		int largest=a[0];
		int smallest=a[0];
		for(int i=0;i<=a.length-1;i++)
		{
			if(a[i]>largest)
				largest=a[i];
			
		}
		for(int i=0;i<=a.length-1;i++)
		{
			if(a[i]<smallest)
				smallest=a[i];
			
		}
		
		System.out.println("largest elemnt in an array:"+largest);
		System.out.println("smallest elemnt in an array:"+smallest);
		System.out.println("======================================================");
		for(int i=1;i<=10;i++)
		{
			System.out.println(smallest+"X"+i+"="+smallest*i);
		}
		System.out.println("======================================================");
		for(int i=1;i<=10;i++)
		{
			System.out.println(largest+"X"+i+"="+largest*i);
		}
		
	}

}
