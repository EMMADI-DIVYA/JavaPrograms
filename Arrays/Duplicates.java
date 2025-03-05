package Com;

public class Duplicates {
	public static void DuplicateNum(int a[])
	{
		for(int i=0;i<=a.length-1;i++)
		{
			int count=0;
			for(int j=0;j<=a.length-1;j++)
			{
				if(a[i]==a[j])
				{
					count++;
					
				}
			}
			 if(count>1)
			 {
				 boolean printed=false;
				 for(int k=0;k<i;k++)
				 {
					 if(a[k]==a[i])
					 {
						printed=true;
						break;
					 }	 
				 }
				
				 if(printed==false)
				 {
					 System.out.println("duplicate value in array : "+a[i]);
					 		 
		         }
				
			 }
			
		}
		
	}
	
	public static void main(String [] args)
	{
		int a[]= {8,3,5,4,6,8,6};
		DuplicateNum(a);
	}

}
