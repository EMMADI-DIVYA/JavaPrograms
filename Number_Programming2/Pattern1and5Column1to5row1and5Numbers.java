class Pattern1and5Column1to5row1and5Numbers
{
	public static void main(String[] args) 
	{
		for(int r=1;r<=5;r++)
		{
			for(int c=1;c<=5;c++)
			{
				if(r==1 || r==5)
				{
		           System.out.print(c+"  ");
				}
				else if(c==1)	
				{
					System.out.print("1 ");
				}
				else if(c==5)	
				{
					System.out.print(" 5 ");
				}
			    else 	
				{
					System.out.print("   ");
				}
				
			}
			System.out.println();
		}
	}
}
