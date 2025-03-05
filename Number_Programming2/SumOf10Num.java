import java.util.Scanner;
class SumOf10Num 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Sum of 10 numbers:");
		int sum=0;
		for (int i=0;i<=10;i++)
		{
			sum=sum+i;
		}
		System.out.println(sum);
	}
}
