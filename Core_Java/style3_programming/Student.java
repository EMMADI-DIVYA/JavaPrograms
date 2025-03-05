/* student service layer */
package style3_programming;

public class Student {
	private static String schoolName="sri vidya mandhir High school";
	private  String stdName;
	private  int stdId;
	private  double stdPercentage;


// In student class all the methods non static

public Student(String stdName,int stdId , double stdPercentage)
{
	
	
	/*student name validaion*/
	boolean studentNameValidationStatus=StudentValidation.studentNameValidation(stdName);
	if(studentNameValidationStatus)
	{
		this.stdName=stdName;
		
		
	}
	else
	{
		System.err.println("enter valid student name ....");
	}
	
	
	/*------------------------------------------------------------------------------------*/
	
	/* studentId validation */
	boolean studentIdValidationStatus=StudentValidation.studentIdValidation(stdId);
	if(studentIdValidationStatus)
	{
		this.stdId=stdId;
		
		
	}
	else
	{
		System.err.println("enter valid student Id....");
	}
	
	/*------------------------------------------------------------------------------------*/
	
	/* studentId validation */
	boolean studentPercentageValidationStatus=StudentValidation.studentPercentageValidation(stdPercentage);
	if(studentPercentageValidationStatus)
	{
		this.stdPercentage=stdPercentage;
		
		
	}
	else
	{
		System.err.println("enter valid student percentage...");
	}
	
	
	
}


/*==================================================================*/

//percentageConverter() method is used to convert percentage to cgpa 

public double percentageConverter(double stdPercentage)
{
	double cgpa=0.0;
	cgpa=stdPercentage/9.5;
	return cgpa;
	

}

/*==================================================================*/

//studentViewDetails() method is used to display all the details of all students objects
public void studentViewDetails()
{
	
	System.out.println("============================================================================");
	System.out.println("student name :" +stdName);
	System.out.println("student school name :" +schoolName);
	System.out.println("student id :" +stdId);
	System.out.println("student percentage :" +stdPercentage);
	System.out.println("student cgpa :" +percentageConverter(stdPercentage));
	System.out.println("============================================================================");
	
	



}

}

