//program from codingbat question:FizzString
//program to demonstrate if,else
import java.util.Scanner;
class FizzString 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter a string : ");
		String str = sc.nextLine();
	    if(str.startsWith("f") && str.endsWith("b"))
        {
           System.out.println("FizzBuzz");
    
        }
        else if(str.startsWith("f"))
        {
           System.out.println("Fizz");
        }
       else if(str.endsWith("b"))
        {
          System.out.println("Buzz");
        }
      else
       {
          System.out.println(str);
       }
  
	}
}
