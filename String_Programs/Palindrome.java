package org;

public class Palindrome {
  public static void main(String[] args)
  {
	  String s="madam";
	  String srev="";
	  for(int i=s.length()-1;i>=0;i--)
	  {
		  char ch=s.charAt(i);
		  srev=srev+ch;
	  }
	  if(s.equals(srev))
	  {
		  System.out.println("given string is palindrome");
		  
	  }
	  else
	  {
		  System.out.println("given string is not  palindrome");
	  }
  }
}
