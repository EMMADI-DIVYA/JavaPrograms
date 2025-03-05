package javaprogramstudyhour;

public class RepeatedCharacters {
	public static void main(String [] args)
	{
		
	String s="aaacccbbbbb";
	int larCount=0;
	for(int i=0;i<=s.length()-1;i++)
	{
		int count=0;
		
		char ch=s.charAt(i);	
		for(int j=0;j<=s.length()-1;j++)
		{
			
			if(ch==s.charAt(j))
			{
				
				count++;
			}
			
		}
		if(count>larCount)
		{
			larCount=count;
		}
		
		
			
		
	}
	
	
	}

}
