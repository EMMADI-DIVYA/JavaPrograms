// program to check wheather a given is strong number or not   (while loop demostration)
class StrongNumber 
{
	public static void main(String[] args) 
	{
      int n=145;
	  int temp=n;
	  int sum=0;
	  while(temp!=0)
		  {
		  int ld=temp%10;
		  int prod=1;
		  for(int i=1;i<=ld;i++)
			  {
			  prod=prod*i;
			  }
          sum=sum+prod;
		  temp=temp/10;
		  }
      if(sum==n)
		{
		  System.out.println(n+" is a Strong number");
		}
		else
		{
			System.out.println(n+" is not a Strong number");
		}

	}

}
