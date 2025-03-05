class Pattern1To15Numbers 
{
	public static void main(String[] args) 
	{
		
		int spaceCount=0;
		int numCount=5;
		int num=1;
		for(int r=1;r<=5;r++)
		{
			for(int c=1 ;c<=spaceCount;c++) 
			{
		       System.out.print("   ");
			   
			}
			for(int c=1;c<=numCount;c++)
			{
				System.out.printf("%2d ", num); 
				num++;
				
				
				

			}
			spaceCount++;
			numCount--;
			System.out.println();
		}

	}
}
