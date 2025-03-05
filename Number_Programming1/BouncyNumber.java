import java.util.Scanner;
class BouncyNumber 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		boolean isIncreasing=true;
		boolean isDecreasing=true;
		int ld=n%10;
		n/=10;
		while(n>0)
		{
			int cd=n%10;
			if(ld>cd)
				isDecreasing=false;
			else if(ld<cd)
				isIncreasing=false;
			ld=cd;
			n=n/10;
		}
		if(!isIncreasing && !isDecreasing)
			System.out.println("Bouncy number");
		else if(!isIncreasing && isDecreasing)
			System.out.println("Decreasing number");
		else if(isIncreasing && !isDecreasing)
			System.out.println("increasing number");
	}
}
