/* student user layer*/
package style2_programming;

public class StudentMainClass {
	
	public static void main(String [] args)
	{
		// creation of objects
		Student student1=new Student();
		Student student2=new Student();
		
		//calling provideStudentDetails() method
		student1.provideStudentDetails("Raju",1233,88);
		student2.provideStudentDetails("Rajuu",1234,80);
		
		//calling studentViewDetails() method
		student1.studentViewDetails();
		student2.studentViewDetails();
	}

}
