//sum of the digits in a given number(to demostrate while loop)
class SumOfDigits 
{
	public static void main(String[] args) 
	{
		int n=456;
		int sum=0;
		while(n!=0)
		{
			int last_digit=n%10;
			sum=sum+last_digit;
			n=n/10;
		}
		System.out.println("sum of the digits of a given number: "+sum );
	
	}
	
}
