//example for else if
//program to calculate area of circle,triangle,square,rectangle,parallelogram,trapezium,rhombus
import java.util.Scanner;
class AreaCalculator 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("============================================================================================");
		System.out.println("                                      Area Calculator");
		System.out.println("============================================================================================");
		System.out.println("enter 1 to find the area of the circle");
		System.out.println("enter 2 to find the area of the triangle");
		System.out.println("enter 3 to find the area of the square");
		System.out.println("enter 4 to find the area of the rectangle");
		System.out.println("enter 5 to find the area of the parallelogram");
		System.out.println("enter 6 to find the area of the trapezium");
		System.out.println("============================================================================================");
		System.out.print("Enter your choice:");
		int ch = sc.nextInt();
		if (ch==1)
		{
			// area of circle==>pr2(pXrXr)
			System.out.println("you have choosed circle to calculate area");
			System.out.print("enter radius of circle:");
			double r= sc.nextDouble();
			System.out.println("area of circle is: "+(3.14*r*r));
		}
		else if (ch==2)
		{
			// area of triangle==>baseXheight
			System.out.println("you have choosed triangle to calculate area");
			System.out.print("enter base of triangle:");
			double b= sc.nextDouble();
			System.out.print("enter height of triangle:");
			double h= sc.nextDouble();
			System.out.println("area of triangle is: "+(b*h));
		}
		else if (ch==3)
		{
			// area of square==>sideXside
			System.out.println("you have choosed square to calculate area");
			System.out.print("enter side of square:");
			double s= sc.nextDouble();
			System.out.println("area of square is: "+(s*s));
		}
		else if (ch==4)
		{
			// area of rectangle==>lengthXwidth
			System.out.println("you have choosed rectangle to calculate area");
			System.out.print("enter lenth of rectangle:");
			double l= sc.nextDouble();
			System.out.print("enter width of rectangle:");
			double w= sc.nextDouble();
			System.out.println("area of rectangle is: "+(l*w));
		}
		else if (ch==5)
		{
			// area of parallelogram==>baseXheight
			System.out.println("you have choosed parallelogram to calculate area");
			System.out.print("enter base of parallelogram:");
			double pb= sc.nextDouble();
			System.out.print("enter height of parallelogram:");
			double ph= sc.nextDouble();
			System.out.println("area of parallelogram is: "+(pb*ph));
		}
		else if (ch==6)
		{
			// area of trapezium==>(( (a+b)/2 )*height)
			System.out.println("you have choosed trapezium to calculate area");
			System.out.print("enter base1 of trapezium:");
			double a= sc.nextDouble();
			System.out.print("enter base2 of trapezium:");
			double b= sc.nextDouble();
			System.out.print("enter height of trapezium:");
			double th= sc.nextDouble();
			System.out.println("area of trapezium is: "+((o.5*(a+b))*th));
		}
		else if (ch==7)
		{
			// area of rhombus==>baseXheight
			System.out.println("you have choosed rhombus to calculate area");
			System.out.print("enter base of rhombus:");
			double rb= sc.nextDouble();
			System.out.print("enter height of rhombus:");
			double rh= sc.nextDouble();
			System.out.println("area of rhombus is: "+(rb*rh));

		}


	}
}
