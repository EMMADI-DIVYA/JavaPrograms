package Com;

public class SmallestElementUsingMethod {
	
	public static boolean isEmpty(int []a)
	{ if(a.length==0)
		return true;
	else
		return false;	
	}
	
	public static void Smallest(int []a)
	{
		int smallest=a[0];
		for(int i=0;i<=a.length-1;i++)
		{
			if(a[i]>0)
			{
				
				for(int j=0;j<a.length-1;j++)
				{
					if(a[j]<smallest)
					{
						smallest=a[j];
					}
				}
			}
				
		}
		System.out.println("smallest element : "+smallest);
	
	}
	
	public static boolean isNegetive(int []a)
	{
		for(int j=0;j<a.length-1;j++)
		{
			if(a[j]<0)
				return true;
		}
		return false;
		
	}
	
	public static void main(String [] args)
	{
		int a[]= {1,4,49,-2,3};
		if(isEmpty(a))
		{
			System.out.println("your array does not contain any elements");
		}
		else
		{
			if(isNegetive(a))
			{
				System.out.println("your array contain negetive element");
				
			}
			else
			{
				Smallest(a);
			}
		}
	}
	
	

}
