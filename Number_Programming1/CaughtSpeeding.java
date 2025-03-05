// program from codingbat question:CaughtSpeeding
//program to demonstrate if,else if,else
import java.util.Scanner;
class CaughtSpeeding 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter speed:");
		int speed=sc.nextInt();
		System.out.print("is_your birthday if yes then enter 'true' or else 'false':");
		boolean isBirthday=sc.nextBoolean();
		public int caughtSpeeding(int speed, boolean isBirthday) {
        if(isBirthday== false)
        {
          if(speed<=60)
          {
           return 0;
          }
          else if(speed>60 && speed<=80)
          {
           return 1;
          }
          else 
		  {
           return 2;
          }
        }
      else
     {
        if(speed<=65)
        {
          return 0;
        }
        else if(speed>65 && speed<=85)
        {
         return 1;
        }
       else 
       {
        return 2;
       }
   
    }
  
  

}
	   /* if(speed<=60 && isBirthday== false)
        {
          System.out.println(0);
        }
		 else if((speed>60 && speed<=80) && isBirthday== false)
		{
		  System.out.println(1);
        }
        else if(speed>=81 && isBirthday==false)
        {
          System.out.println(2);
        }
         else if(speed<=65 && isBirthday==true)
        {
          System.out.println(0);
        }
        else if((speed>65 && speed<=85) && isBirthday== true)
        {
         System.out.println(1);
        }
        else if(speed>=86 && isBirthday==true)
       {
        System.out.println(2);
       }*/

	
	}
}




