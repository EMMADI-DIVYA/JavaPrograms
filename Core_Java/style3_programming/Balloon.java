/* question: write a program for the below requirement :

a) program for balloon 
ballon properties are: 1)color, 2)gas type
requirement:1)all the balloons are filled with helium gas 
2)balloon colors can be white or blue or gold or silver or red
perform below operations:
1)initialize accordingly
2)display balloon details
3)create a ballon main class with main method
4)create 4 balloon objects 
5)call the functionalities*/
package style3_programming;
class Balloon
{
	private  String c;
	private static String gas_type="helium";
	public Balloon(String z)
	{ 
		// for primitive datatype(int,double..) we use == to compare 
	/*	if(s=="white" || s=="blue" ||s=="red" || s=="gold" || s=="silver") */
	// for non-primitive datatype(string....) --- we use equals() method instead to compare
	if(z.equals("white") || z.equals("red") || z.equals("gold") || z.equals("silver") || z.equals("blue") )
		{
			c=z;
		}
		else
		{
			System.out.println("enter a valid color: white or blue or gold or silver");
		}
		
	}
	
	public void display()
	{
		System.out.println("color:" +c);
		System.out.println("gas type:" + Balloon.gas_type);
	}



}
