class ToCharArray 
{
	public static void main(String[] args) 
	{
		String s=" i am good girl ";
		char [] s1=s.toCharArray();
		for(int i=0;i<=s1.length-1;i++)
		{
			System.out.print(s1[i]+" ");
		}
		for(int i=0;i<=s1.length-1;i++)
		{
			System.out.println(i+" index value: "+s1[i]);
		}
		
	}
}
