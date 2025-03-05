package org;

public class tochararrAndtolowAndtoUpp {
	

		public static  void toCharArray(String s)
		{
			char s1[] =new char[100];
			for(int i=0;i<s.length()-1;i++)
			{
				char c=s.charAt(i);
				for(int j=0;j<s1.length;j++)
				{
					s1[j]=c;
				}
				
			}
			for(int k=0;k<=s1.length;k++)
			{
				System.out.print(s1[k]);
			}
			
		
		}
		
		
		public static  void toLowerCase(char c2)
		{
			
			 if(c2>='a' && c2<='z')		
			{
				System.out.println(c2);
				
			}
			 else
			 {
				 int a=c2+32;
				 System.out.println();
				 
			 }
			
		}
		
		public static  boolean isUpperCase(char c3)
		{
			boolean isUpp=false;
			if(c3>='A' && c3<='Z')		
			{
				isUpp=true;
				
			}
			if(isUpp)
			{
				return true;
			}
			else
			{
				return false;
			}
			
		}
		
		public static  boolean isLowerCase(char c4)
		{
			boolean isLow=false;
			if(c4>='a' && c4<='z')		
			{
				isLow=true;
				
			}
			if(isLow)
			{
				return true;
			}
			else
			{
				return false;
			}
			
		}
		
		
		
		
		
		
		
		public static void main(String[] args) {
			char c1=9;
			boolean c1res=isDigit(c1);
			if(c1res)
			{
				System.out.println(c1+"is digit");
			}
			else
			{
				System.out.println(c1+" is not digit");
			}
			
			char c2='D';
			boolean c2res=isAlphabetic(c2);
			if(c2res)
			{
				System.out.println(c1+"is alphabet");
			}
			else
			{
				System.out.println(c1+" is not alphabet");
			}
			
			
			char c3='V';
			boolean c3res=isUpperCase(c3);
			if(c3res)
			{
				System.out.println(c1+"is in upper case");
			}
			else
			{
				System.out.println(c1+" is not in upper case");
			}
			
			
			char c4='j';
			boolean c4res=isLowerCase(c3);
			if(c4res)
			{
				System.out.println(c1+"is in lower case");
			}
			else
			{
				System.out.println(c1+" is not in  case");
			}
			
			
		}

	}


}
