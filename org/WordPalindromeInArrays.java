package org;

public class WordPalindromeInArrays {

	
	// check for string is empty or not .if string is empty return null and if string is not empty return longest word in string
	public static String isEmpty(String s)
	{
		if(s.length()==0)
		{
			return null;
		}
		else
		{
			String []s1= s.split(" ");
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
			return longestString;
		}
	}
	
	public static void palindrome(String s)
	{
		String str=isEmpty(s);
		String rev_str=" ";
		for(int i=str.length()-1;i>=0;i--)
		{
			char ch=str.charAt(i);
			rev_str=rev_str+ch;
			
		}
		if(str.equals(rev_str))
		{
			System.out.println(str+" is palindrome");
			System.out.println("first character :" +str.charAt(0));
			System.out.println("last character :" +str.charAt(str.length()-1));
		}
		else
		{
			System.out.println(str+" is not palindrome");
			System.out.println("vowels in the longest word i.e "+str +" are :");
			for(int i=1;i<=str.length()-1;i++)
			{
				char ch1=str.charAt(i);
				if(ch1=='a' || ch1=='e'|| ch1=='i'|| ch1=='o'||ch1=='u')
				{
					System.out.println(ch1);
				}
				
			}
			  
		}
	}
	
	public static void main(String[] args)
	{
		String s="I am Divya!!";
		String s1=isEmpty(s);
		System.out.println("longest word in the string is : "+s1);
		palindrome(s1);
		
		
	}
}

