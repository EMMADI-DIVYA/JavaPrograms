//program to print all automorphic nubers from 1 to 1000(by using while in for)
import java.util.Scanner;
class AutomorphicNumber1To100 
{
	public static void main(String[] args) 
	{
	
		
		for(int num=1;num<=1000;num++)
		{
			boolean isAutomorphic=true;
			int temp=num;
			int square=temp*temp;
			while(temp!=0)
		    {
			  if((temp%10)!=(square%10))
			  {
				isAutomorphic=false;
				break;
			  }
			  temp=temp/10;
			  square=square/10;
			}
		if(isAutomorphic)
		{
			System.out.println(num);
		}
	
	  }
	}
}




// automorphic numbers from 1 to 100(using while in while)
/*




import java.util.Scanner;
class AutomorphicNumber1To100 
{
	public static void main(String[] args) 
	{
	
		int num=1;
		while(num<=1000)
		{
			boolean isAutomorphic=true;
			int temp=num;
			int square=temp*temp;
			while(temp!=0)
		    {
			  if((temp%10)!=(square%10))
			  {
				isAutomorphic=false;
				break;
			  }
			  temp=temp/10;
			  square=square/10;
			}
		if(isAutomorphic)
		{
			System.out.println(num);
		}
		num++;

	
	  }
	}
}





*/