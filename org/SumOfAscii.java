package org;

public class SumOfAscii {
	public static void main(String [] args)
	{
		String s="ABCD";
		int sum=0;
		for(int i=0;i<=s.length()-1;i++)
		{
			sum=sum+s.charAt(i);
			
		}
		System.out.println("sum of the ascii values of the digits of a given string is : "+sum);
	}

}
