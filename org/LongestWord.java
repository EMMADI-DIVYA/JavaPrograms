package org;

public class LongestWord {
	public static void main(String[] args)
	{
		String s="I am a Java Developer";
		String [] s1=s.split(" ");
		int length=0;
		String longestString="";
		for(int i=0;i<=s1.length-1;i++)
		{
			if(s1[i].length()>length)
			{
				length=s1[i].length();
				longestString=s1[i];
				
			}
		}
		System.out.println("longest string : "+longestString);
		
	}

}
