class PrimeNumber1To100 
{
	public static void main(String[] args) 
	{

		System.out.println("Prime Numbers from 1 to 100:");
		for(int n=2;n<=100;n++)
		{
			boolean isPrime=true;

			for(int i=2;i<n;i++)
			{
				if(n%i==0)
				{
					isPrime=false;
					break;
				}

			}

			if(isPrime)
			{
				System.out.println(n);
			}
		}
	}
}
