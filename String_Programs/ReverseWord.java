package org;

public class ReverseWord {
	public static void ReverseEachWord(String s)
	{
		String  [] str=s.split(" ");
		for(int i=str.length-1;i>=0;i--)
		{
			
			System.out.print(str[i]+" ");
		}
		
	}
	public static void main(String [] args)
	{
		String s= "this is india";
		ReverseEachWord(s);
		
	}

}
