package org;

public class FirstLetterExtraction 
{
	public static void extractionOfFirstLetter(String s)
	{
		String [] str=s.split(" ");
		for(int i=0;i<=str.length-1;i++)
		{
			
				System.out.println(str[i].charAt(0));
		}
				
				
				
		
	}
		
	
	public static void main(String [] args)
	{
		String s="This is India";
		extractionOfFirstLetter(s);
	}

}
