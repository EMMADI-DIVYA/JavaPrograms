import java.util.Scanner;
class IasExamEligibility 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age:");
		int age = sc.nextInt();
        if(age>=21&&age<=32)
		{
			System.out.println("You are eligible to write IAS Exam");
		}
		else
		{
			
			System.out.println("You are not eligible to write IAS Exam");
		}

	}
}
