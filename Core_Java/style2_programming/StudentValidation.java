/* student validation layer */
/* In validation class all methods are static(can be static or non static) */
package style2_programming;

public class StudentValidation {
	private static int [] stdIds=new int[100];
	private static int index=0;
	
	
	
	/*------------------------------------------------------------------------------------*/
	/*student name validation method*/
	
	public static boolean studentNameValidation(String stdName)
	{
		/* condition1: name must have only 4 letters*/
		/* condition2:first letter must be capital letter*/
		
		int condition1Status=1;
		int condition2Status=0;
		
		/*condition1 logic*/
		int count=0;
		for(int i=0;i<=stdName.length()-1;i++)
		{
		
			 count++;
		
		}
		if(count==4)
		{
			condition1Status=1;
		}
		
		/*condition2*/
		if(Character.isUpperCase(stdName.charAt(0)))
		{
			condition2Status=1;
		}
		
		
		/*climax logic*/
		if(condition1Status==1 && condition2Status==1)
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}
	
	
	
	/*------------------------------------------------------------------------------------*/
	/*student id validation method*/
	public static boolean studentIdValidation(int stdId)
	{
		/*condition1:student id must be only 4 digits*/
		/*condition2:student id should be unique*/
		int condition1Status=0;
		int condition2Status=0;
		
		/*condition1 logic*/
		/* another logic : if(stdId/1000>=1 && stdId/1000<=9) */
		int count=0;
		int temp=stdId;
		while(temp!=0)
		{
			count++;
			temp/=10;
		}
		if(count==4)
		{
			condition1Status=1;
		}
		
		/*condition2 logic*/
		
		boolean isUnique=true;
		for(int i=0;i<=stdIds.length-1;i++)
		{
			if(stdId==stdIds[i])
			{
				isUnique=false;
			}
			
			
		}
		/*if id is unique assign in to array*/
		if(isUnique)
		{
				stdIds[index]=stdId;
				index++;
				condition2Status=1;
				
		
		}
		
		/* climax logic*/
		if(condition1Status==1 && condition2Status==1)
		{
			return true;
		}
		else
		{
			return false;
		}
				
	}
	
	
	
	
	/*------------------------------------------------------------------------------------*/
	/*student percentage validation method*/
	
	// Validate Student Percentage (1-99)
	public static boolean studentPercentageValidation(double stdPercentage)
	{
		if(stdPercentage>=1 && stdPercentage<=99)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	
	
	
	
	
	
	
	

}
