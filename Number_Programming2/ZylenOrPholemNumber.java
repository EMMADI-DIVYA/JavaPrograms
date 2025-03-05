//xylem or pholem number or not+
im+port java.util.Scanner;
class ZylenOrPholemNumber 
{
	public static void zylomOrPholem(int num)
	{
		int temp=num;
		int ld1=temp%10;// last number
		int count=0;
		while(temp!=0)
		{
			temp=temp/10;
			count++;
		}
		temp=num;
		int rev=0;
		for(int i=0;i<=count-1;i++)
		{
			int ld2=temp%10;
			rev=rev*10+ld2;
			temp=temp/10;
		}
		int ld3=rev%10;//first number
		int sum1=ld1+ld3;//sum of the first digit and last digit
		int temp2=rev;
		temp2=temp2/10;
		int sum2=0;
		while(temp2>=10)
		{
          int ld=temp2%10;
		  sum2=sum2+ld;//sum of middle number
		  temp2=temp2/10;
		  
		  
		}
		if(sum1==sum2)
		{
           System.out.println(num+" is xyleom number");
		}
		else
			System.out.println(num+" is phelom number");
	}

           


	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number : ");
		int n=sc.nextInt();
		zylomOrPholem(n);
	}
}
