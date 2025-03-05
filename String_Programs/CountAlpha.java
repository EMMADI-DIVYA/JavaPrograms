/*package javaprogramstudyhour;

public class CountAlpha {
	public static void main(String[] args) {
		String s="aaabbcd";
		
	int aCount=0;
	int bCount=0;
	int cCount=0;
	int dCount=0;
	for(int i=0;i<=s.length()-1;i++)
	{
		char c=s.charAt(i);
		if(c=='a')
		{
			aCount++;
		}
		if(c=='b')
		{
			bCount++;
		}
		if(c=='c')
		{
			cCount++;
		}
		if(c=='d')
		{
			dCount++;
		}
		
		
	}
	
	System.out.println("a- "+aCount);
	System.out.println("b- "+bCount);
	System.out.println("c- "+cCount);
	System.out.println("d- "+dCount);
		
	}
	

}  */




package javaprogramstudyhour;

public class CountAlpha {
	public static void main(String[] args) {
		String s="aaabbccd";
		
		char []c=s.toCharArray();
		boolean c1[]=new boolean [c.length];
		for(int i=0;i<=c.length-1;i++)
		{
			int count=0;
			if(c1[i])
				continue;
			else
			{
			
			for(int j=0;j<=c.length-1;j++)
			{
				if(c[i]==c[j])
				{
				count++;
				c1[j]=true;
				}
			}
			}
		
	
			System.out.println(c[i]+" - "+count);
			
		}
		
	}
}
	
