package style3_programming;
public class Circle 
{
	private static double pi=3.14;
	private int r;	

	
	public Circle(int a)
	{
		if(a>=7 && a<=25)
		{
			r=a;
		}
		else
		{
			System.err.println("you have entered invalid range of radius....");
			System.err.println("enter a valid radius between 7 to 25 inclusive.. ");
	    }
	}

	public void findArea()
	{
		double area=pi*r*r;
		System.out.println("Area of circle is:"+area);

	}

	public void circumference()
	{
		double circumference=2*pi*r;
		System.out.println("Circumference of circle is:"+circumference);
	}

	public void detailsOfCircle()
	{
		System.out.println("pi : "+Circle.pi);
		System.out.println("radius : "+r);
		findArea();
		circumference();
	}


}



