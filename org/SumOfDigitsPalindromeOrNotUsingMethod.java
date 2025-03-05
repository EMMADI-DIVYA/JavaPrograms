package org;

public class SumOfDigitsPalindromeOrNotUsingMethod {
	public static void checkPalindrom(String s)
	{
		String str="";
		for(int i=0;i<=s.length()-1;i++)
		{
			char ch=s.charAt(i);
			if(Character.isDigit(ch))         //  or we can also write this =====>   if(ch>=0 && ch<=9)
			{
				str=str+ch;
				
			}
			
		}
		int num=Integer.parseInt(str);
		int temp=num;
		int sum=0;
		while(temp!=0)
		{
			int ld=temp%10;
			sum=sum+ld;	
			temp=temp/10;
			
		}
		
		int temp1=sum;
		int rev=0;
		while(temp1!=0)
		{
			int ld1=temp1%10;
			rev=rev*10+ld1;
			temp1=temp1/10;
		}
		if(sum==rev)
		{
			System.out.println("sum of the digits are the palindrome");
		}
		else
		{
			System.out.println("sum of the digits are not the palindrome");
		}
		
		
	}
	public static void main(String[] args)
	{
		String s= "J12s345p";
    	checkPalindrom(s);
	
		
	}

}
