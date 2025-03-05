// index position of the special character
package org;
import java.util.Scanner;
public class IndeaxPositionOfSpecialCharactersUsingMethod {
	public static void IndeaxPosition(String s)
	{
		for(int i=0;i<=s.length()-1;i++)
		{
			char ch=s.charAt(i);
			if(!Character.isDigit(ch) && !Character.isAlphabetic(ch))
			{
			System.out.println(i);
			}
		}
		
	}
	public static void main(String[] args)
	{
		String s="Hyd@$-erab!%ad";
		IndeaxPosition(s);
		
	}

}
