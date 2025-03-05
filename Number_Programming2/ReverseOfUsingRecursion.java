import java.util.*;
class ReverseOfUsingRecursion 
{
	public static int ReverseOfNumber(int num,int rev)
	{    
	    
		if(num==0)
	      return rev;
		else
        {
			rev=rev*10+(num%10);
			return ReverseOfNumber(num/10,rev);
			
		}
		
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number:");
		int num = sc.nextInt();
		int rev=0;
		System.out.println("reverse of the number is :"+ReverseOfNumber(num,rev));
	}
}
