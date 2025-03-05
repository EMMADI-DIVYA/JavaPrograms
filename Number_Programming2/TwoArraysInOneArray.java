class TwoArraysInOneArray 
{
	public static void main(String[] args) 
	{
		int [] a={1,2,3,4};
		int [] b={5,6,7,8,9};
		int size=a.length+b.length;
		int [] c= new int[size];
		for(int i=0;i<=a.length-1;i++)
		{
			c[i]=a[i];
		}

		/*
		int j=0;
		for(int i=a.length;i<=(c.length-1);i++)
		{                                                                                                                                             
			while(j<=b.length-1)
			{

			   c[i]=b[j];
			   j++;
			   break;
			}
			*/
		
		for(int i=0;i<=b.length-1;i++)
		{
			c[a.length+i]=b[i];

		}
			
		
		System.out.println("Array c elements are :");
		for(int i=0;i<=c.length-1;i++)
		{
			System.out.println(c[i]);
		}


	}
}
