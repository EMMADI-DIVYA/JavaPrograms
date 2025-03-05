

// this program is to check wheather the 1000 is prime or not(this is best methos to check a number is prime or not because no.of iteration of loop will be less)
class CheckPrime1000 
{
	public static void main(String[] args) 
	{
		int n=1000;
		boolean isprime=true;
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
			{
				isprime=false;
				break;
			}
		}
		if(isprime==true)
		{
			System.out.println(n+" is a prime number");
		}
		else
		{
			System.out.println(n+" is  not a prime number");
		}
	}
}
