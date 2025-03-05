class BalloonMainClass
{
	public static void main(String[] args) 
	{
		//class name ---  pascal casing and method and variables in----- camel casing  
		Balloon b1= new Balloon();
		Balloon b2= new Balloon();
		Balloon b3= new Balloon();
		Balloon b4= new Balloon();
		Balloon b5= new Balloon();

		b1.color("blue");
		b2.color("gold");
		b3.color("red");
		b4.color("silver");
		b5.color("white");

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
