/* student user layer*/
package style3_programming;

public class StudentMainClass {
	
	public static void main(String [] args)
	{
		// creation of objects
		Student student1=new Student("Raju",1233,88);
		Student student2=new Student("Rajuu",1234,80);
		
		//calling provideStudentDetails() method
		/*student1.provideStudentDetails("Raju",1233,88);
		student2.provideStudentDetails("Rajuu",1234,80);*/
		
		//calling studentViewDetails() method
		student1.studentViewDetails();
		student2.studentViewDetails();
	}

}
