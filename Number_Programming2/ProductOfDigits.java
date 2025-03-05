//program to print the product of the digits i a given number (to demostrate while loop)
class ProductOfDigits 
{
	public static void main(String[] args) 
	{
		int n=456;
		int product=1;
		while(n!=0)
		{
			int last_digit=n%10;
			product=product*last_digit;
			n=n/10;
		}
		System.out.println("product of all the digits in a given number: "+product);
	}
	
}
