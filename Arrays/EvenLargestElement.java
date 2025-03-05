package Com; 

public class EvenLargestElement {
	
	public static void EvenLargestNum(int a[])
	{
		
		int large=0;
		for(int i=0;i<=a.length-1;i++)
		{
			if(a[i]%2==0)
			{
				for(int j=0;j<=a.length-1;j++)
				{
					if(a[j]%2==0)
					{
						
						if(a[j]>a[i])
						{
							large=a[j];
							
						}
					}
				}
			  
				
			}
		}
		System.out.println("largest : "+large);
	}
	
	public static void main(String[] args)
	{
		int a[]= {2,5,4,6,9};
		EvenLargestNum(a);
		
	}

}
