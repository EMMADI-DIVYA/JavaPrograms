package org;

public class indexOfVowels {
	public static void indexOfVowels(String s)
	{
		for(int i=0;i<=s.length()-1;i++)
		{
			if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u')
			{
				System.out.println(i);
			}
		}
	}
	public static void main(String[] args)
	{
		String str= "i'm a developer";
		indexOfVowels(str);
		
	}

}
