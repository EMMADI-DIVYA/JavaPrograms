package org;

public class CharacterOfEvenIndex {
	public static void main(String[] args)
	{
	String s="Jspider";
	for(int i=1;i<=s.length()-1;i++)
	{
		if(i%2==0)
		{
			System.out.print(s.charAt(i) +" ");
		}
		
	}
	}

}
