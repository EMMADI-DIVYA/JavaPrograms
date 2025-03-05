 // isblank will not consider space,tab,nextline as a character
class isBlank 
{
	public static void main(String[] args) 
	{
		
		String s1="";

		String s2="jspider";
		if (s1.isBlank()) 
		{
			System.out.println("s1 is empty string");
		}
		else
		{
			System.out.println("s1 is not empty string");
		}
		
	}
}
