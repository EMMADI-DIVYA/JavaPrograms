//anagram: if to string have same length and after sorting if the each every characters in the 2 strings are the same the we say that the 2 strings are anagram
package org;

public class Anagram {
	public static void main(String[] args)
	{
		String s1="Race";
		String s2="Care";
		//check for the length of the 2 strings
		if(s1.length()==s2.length())
		{
			String s3="";
			String s4="";
			for(int i=0;i<=s1.length()-1;i++)
			{
				char ch=s1.charAt(i);
				s3=s3+Character.toLowerCase(ch);
			}
			for(int i=0;i<=s2.length()-1;i++)
			{
				char ch=s2.charAt(i);
				s4=s4+Character.toLowerCase(ch);
			}
			
			char a1[]=s3.toCharArray();
			char a2[]=s4.toCharArray();
			
			for(int i=0;i<a1.length-1;i++)
			{
				for(int j=0;j<a1.length-1-i;j++)
				{
					if(a1[j]>a1[j+1])
					{
						char temp=a1[j];
						a1[j]=a1[j+1];
						a1[j+1]=temp;
			       }
		       }
		    }
			for(int k=0;k<a1.length-1;k++)
			{
				System.out.print(a1[k]);
				

	     	}
			
			
			for(int i=0;i<a2.length-1;i++)
			{
				for(int j=0;j<a2.length-1-i;j++)
				{
					if(a2[j]>a2[j+1])
					{
						char temp=a2[j];
						a2[j]=a2[j+1];
						a2[j+1]=temp;
			       }
		       }
		    }
			for(int k=0;k<a1.length-1;k++)
			{
				System.out.print(a2[k]);
				

	     	}
			
			if(a1.equals(a2))
			{
				System.out.println("the given two string are the anagram");
			}
			else
			{
				System.out.println("the given two string are not the anagram");
			}
		}
		else
		{
			System.out.println("the given two string are the anagram");
		}
	}

}

