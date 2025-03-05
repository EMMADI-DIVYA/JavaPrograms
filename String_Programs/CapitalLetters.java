package org;

public class CapitalLetters {
	public static void main(String [] args)
	{
		String s="IndiA";
		for(int i=0;i<=s.length()-1;i++)
		{
			//if(s.charAt(i)>=65 && s.charAt(i)<=90 )   
			if(s.charAt(i)>='A' && s.charAt(i)<='Z' )
			{
				System.out.println(s.charAt(i));
			}
		}
	}

}
