
/* write a program for the below requirements: 
program for chair
requirements:
1)material 2)type
data requirements:
1)all the chairs are manfactured by using wood material
2)chair type can be office chair ,dining chair ,reclinear
perform below operations :
1)intialize accordingly
2)display chair details
*/

class  Chair
{
	// variable declaration (requirements)
	private static String material="wood";
	private String type;

// intializtaion

	public void chairType(String type)
	{
		if(type.equals("office chair") || type.equals("dining chair") || type.equals("reclinear") )
		{
			this.type=type;// left side one is arg(local variable bec it is in the method )
			// when local variable name and non-static variable name is same we use this keyword to acces the non static variable
		}
		else
		{
			System.out.println("enter valid type...");
		}

    }

	// display chair details

	public void chairDetails()
	{
		System.out.println("*****************************************************************");
		System.out.println(" the " + type + " is made of " + material + " material");
		System.out.println("*****************************************************************");
	}
}

