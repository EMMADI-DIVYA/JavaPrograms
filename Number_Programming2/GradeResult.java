// This program is example for the "switch"


import java.util.Scanner;
class GradeResult 
{
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.print("enter your grade:");
		char grade= sc.next().charAt(0);
		switch (grade)
		{    
			// If the user entered capital(A,B,C,D,E,F) or small(a,b,c,d,e,f) letters also it will work


			case 'A':case 'a':System.out.println("You got first rank");
			                  System.out.println("You got first rank");
			break;
			case 'B':case 'b':System.out.println("You got second rank");
			break;
			case 'C':case 'c':System.out.println("You got first rank");
			break;
			case 'D':case 'd':System.out.println("You got first class");
			break;
			case 'E':case 'e':System.out.println("You got second class");
			break;
			case 'F':case 'f':System.out.println("You got failed");
			break;
			default:System.out.println("enter valid grade");
		}

	}
}


/*
import java.util.Scanner;
class GradeResult 
{
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.print("enter your grade:");
		char grade= sc.next().charAt(0);
		switch (grade)
		{    
			// If the user entered capital(A,B,C,D,E,F) or small(a,b,c,d,e,f) letters also it will work

            // if you want print multiple lines if enter Grade='A' (if you want to give multiple lines in the each case of switch ) then follow the syntax given below:

			case 'A':case 'a':System.out.println("You got first rank");
			                  System.out.println("You got first rank");
			break;
			case 'B':case 'b':System.out.println("You got second rank");
			break;
			case 'C':case 'c':System.out.println("You got first rank");
			break;
			case 'D':case 'd':System.out.println("You got first class");
			break;
			case 'E':case 'e':System.out.println("You got second class");
			break;
			case 'F':case 'f':System.out.println("You got failed");
			break;
			default:System.out.println("enter valid grade");
		}

	}
}

ouput:
------
enter your grade:A
You got first rank
You got first rank




*/
