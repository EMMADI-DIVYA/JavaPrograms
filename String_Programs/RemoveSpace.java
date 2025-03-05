package org;

public class RemoveSpace {
	public static void main(String[] args)
	{
		String s="Ja va";
		String s1="";
		for(int i=0;i<=s.length()-1;i++)
		{
			char ch=s.charAt(i);
			if(ch>=65 && ch<=90 || ch>=97 && ch<=122)
			{
				s1=s1+ch;
			}
		}
		System.out.println(s1);
	}

}




