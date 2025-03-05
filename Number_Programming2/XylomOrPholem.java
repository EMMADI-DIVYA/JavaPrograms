/*class XylomOrPholem 
{
	public static void main(String[] args) 
	{
	int n=1234;
	int temp1=n;
	int ld1=temp1%10;
	temp1=n/10;
	
		int temp2=temp1;
		int rev=0;
		while(temp2>0)
		{
			int ld2=temp2%10;
			rev=rev*10+ld2;
			temp2=temp2/10;

		}
		int temp3=rev;
		int ld3=temp3%10;
		temp3/=10;
		
		int sum1=ld1+ld3;
		System.out.println(sum1);
		int sum2=0;
		while(temp3>0)
		{
			int ld4=temp3%10;
			temp3/=10;
			sum2=sum2+ld4;
		}
		System.out.println(sum2);
		if(sum1==sum2)
			System.out.println(" xylom number");
		else
			System.out.println(" pholem number");
			
	}
}
*/
class XylomOrPholem 

{
	public static void main(String[] args) 
	{
	int n=1234;
	int sum1=n%10;
	n=n/10;
	int sum2=0;
	while(n>=9)
		{
		int ld=n%10;
		sum2=sum2+ld;
		n/=10;
		}
		sum1=sum1+n;
		System.out.println(sum1);
		System.out.println(sum2);
		if(sum1==sum2)
			System.out.println(" xylom number");
		else
			System.out.println(" pholem number");



	}
}
