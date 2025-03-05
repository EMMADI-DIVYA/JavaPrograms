package org;

public class ReverseString {
	public static void main(String [] args)
	{
		String s ="Java";
		String srev="";
		for(int i=s.length()-1;i>=0;i--)
		{
			char ch=s.charAt(i);
			srev=srev+ch;
		}
		System.out.println("reverse of the string "+s+" is : "+ srev);
		
	}
	

}
