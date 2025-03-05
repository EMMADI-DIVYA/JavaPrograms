package org;

public class NoOfCharactersAndNumbers {
	public static void main(String[] args)
	{
		String s="Jsp123";
		int digitCount=0;
		int alphabetCount=0;
		for(int i=0;i<=s.length()-1;i++)
		{
			if(s.charAt(i)>='0' && s.charAt(i)<='9')
			{
				digitCount++;
			}
			if(s.charAt(i)>='A' && s.charAt(i)<='Z' || s.charAt(i)>='a' && s.charAt(i)<='z' )
			{
				alphabetCount++;
			}
		}
		System.out.println("no.of digits is : "+digitCount + " and no.of alphabets is : "+alphabetCount);
	}

}
