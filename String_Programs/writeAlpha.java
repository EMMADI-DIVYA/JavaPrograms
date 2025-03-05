package javaprogramstudyhour;

public class writeAlpha {
	public static void main(String[] args) {
		String s="3a2b1c";
		for(int i=0;i<s.length()-1;i++)
		{
			char ch=s.charAt(i);
			
			String s1="";
			
			if(Character.isDigit(ch))
			{
				s1=s1+ch;
				int n=Integer.parseInt(s1);
				
				
				for(int j=1;j<=n;j++)
				{
					System.out.print(s.charAt(i+1));
				}
			}
		}
	}

}
