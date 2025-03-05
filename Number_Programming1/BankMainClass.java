import java.util.Scanner;
class BankMainClass 
{
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);

		boolean isexit=false;		
		while(isexit==false)
		{
			
		System.out.println("enter 1 for deposite of amount ");
		System.out.println("enter 2 for withdraw of amount ");
		System.out.println("enter 3 to check current account balance ");
		System.out.println("enter 4 to exit ");
		System.out.print("enter your choice : ");
		int ch=sc.nextInt();
		switch(ch)
		{
			case 1:
			        System.out.print("Enter amount to deposit: ");
			         int amount1=sc.nextInt();
			         Bank.deposite(amount1);
		             break;
			case 2:
				    System.out.print("Enter amount to withdraw: ");
			        int amount2=sc.nextInt();
				    Bank.withDraw(amount2);
			        break;
			case 3:
				    Bank.showBal();
			        break;
			case 4:
					System.out.println("Exiting. Thank you!");
					isexit =true;
					break;
			default:
                    System.out.println("Invalid choice! Please enter a valid option.");
		}
		}
	}
}
