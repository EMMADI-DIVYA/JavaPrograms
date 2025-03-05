import java.util.Scanner;
class AreaOfCyclinder 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter radius of cyclinder:");
        double r= sc.nextDouble();
        System.out.print("Enter height of cyclinder:");
		double h= sc.nextDouble();
        System.out.println("Area of cyclinder:"+3.14*r*h);
	}
}
