public class Bank
{
	static int accBal=1000;
	
	public static void deposite(int amount)
	{
		if(amount>0)
		{
			accBal=accBal+amount;
			System.out.println("your amount "+amount+" has deposited and balance is : "+accBal);

		}
		else
		{
			System.out.println("enter valid amount");
		}

		
	}
	public static void withDraw(int amount)
	{
		if(accBal>amount)
		{
			accBal=accBal-amount;
			System.out.println("your amount "+amount+" has withdrawed and balance is : "+accBal);
		}
		else
		{
			System.out.println("enter valid amount");
		}
		
	}
	public static void showBal()
	{
		System.out.println("current bal is : "+accBal);
	}

}
