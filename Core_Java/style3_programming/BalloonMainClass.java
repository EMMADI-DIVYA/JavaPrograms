package style3_programming;
class BalloonMainClass
{
	public static void main(String[] args) 
	{
		//class name ---  pascal casing and method and variables in----- camel casing  
		Balloon b1= new Balloon("blue");
		Balloon b2= new Balloon("gold");
		Balloon b3= new Balloon("red");
		Balloon b4= new Balloon("silver");
		Balloon b5= new Balloon("white");

	/*	b1.color("blue");
		b2.color("gold");
		b3.color("red");
		b4.color("silver");
		b5.color("white"); */

	    b1.display();
		System.out.println("=======================================================================================");
		b2.display();
		System.out.println("=======================================================================================");
		b3.display();
		System.out.println("=======================================================================================");
		b4.display();
		System.out.println("=======================================================================================");
		b5.display();

	}
}
