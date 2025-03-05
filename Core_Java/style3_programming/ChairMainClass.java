package style3_programming;
class ChairMainClass 
{
	public static void main(String[] args) 
	{

		//class name ---  pascal casing and method and variables in----- camel casing  
		
		Chair c1 =new Chair("office chair");
		Chair c2 =new Chair("dining chair");
		/*c1.chairType("office chair");
		c2.chairType("dining chair");*/
		c1.chairDetails();
		c2.chairDetails();
	}
}
