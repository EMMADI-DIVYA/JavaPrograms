package Com;

public class DuplicateNumberInArray {
	public static void main(String[] args)
	{
		int []a= {8,6,6,4,9,4};
		for(int i=0;i<=a.length-1;i++)
		{
			int count=0;
			for(int j=i+1;j<=a.length-1;j++)
			{
				if(a[i]==a[j])
				{
					
					System.out.println(a[i]);	
				}
			}
			

		}
	}

}
