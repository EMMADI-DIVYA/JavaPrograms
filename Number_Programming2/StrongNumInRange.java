class StrongNumInRange 
{
	public static void main(String[] args) 
	{
		for(int i=1;i<=50000;i++)
		{
			int temp=i;
			int sum=0;
			while(temp!=0)
			{
				int ld=temp%10;
                int prod=1;
			    for(int j=1;j<=ld;j++)
			    {
				prod=prod*j;
			    }
			    sum=sum+prod;
			    temp=temp/10;

			}
			if(sum==i)
			{
				System.out.println(i);
			}
		}
			

	}
}
