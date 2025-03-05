// to count no.of digits in a given number (to demostrate the while loop)
class NoOfDigits 
{
	public static void main(String[] args) 
	{
		int n=456;
		int count=0;
		while(n!=0)
		{
			count++;
			n=n/10;
		}
		System.out.println("no.of digits in a given number is :"+count);
	}
}
