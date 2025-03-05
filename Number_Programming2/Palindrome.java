import java.util.Scanner;
public class Palindrome
{
    
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.print("enter a number:");
	    int str=sc.nextInt();
	    int rev=0;
	    int temp=str;
	    while(temp!=0)
	    {
	        int ld = temp%10;
	        rev=rev*10+ld;
	        temp=temp/10;
	    }
	    if(str==rev)
	    {
	        System.out.println("palindrome");
	        
	    }
	    else{
	        System.out.println("not palindrome");
	    }
	    
	    
    
	}
}