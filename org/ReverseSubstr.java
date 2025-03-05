package org;

public class ReverseSubstr {
	public static void main(String[] args)
	{
		String s="Java Developer";
		String srev="";
		String s1=s.substring(4);
		for(int i=s1.length()-1;i>=0;i--)
		{
			srev=srev+s1.charAt(i);
		}
		System.out.println(s.substring(0, 4)+""+srev);
		}
	}


