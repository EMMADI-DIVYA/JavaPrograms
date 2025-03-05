import java.util.Scanner;
class MovieTicketMainClass 
{
	public static void main(String[] args) 
	{   

		Scanner sc = new Scanner(System.in);
		boolean isexit=true;

		while (isexit)
		{
			System.out.println("enter 1.continue..\n 2.exit");

			int ch =sc.nextInt();
			switch (ch)
			{
			case 1:
				{
				System.out.println("enter 1.book ticket \n 2.cancel ticket \n 3.to see available tickets");

				int ch1 =sc.nextInt();
				switch (ch1)
					{

					case 1:
						{
						System.out.println("Enter no of tickets has to book for movie:");
				        int bt=sc.nextInt();
				        MovieTicket.bookTicket(bt);
						}
					break;
					case 2:
						{
						System.out.println("Enter no of tickets has to cancel :");
						int ct=sc.nextInt();
						MovieTicket.cancelTicket(ct);
						}
					break;
					case 3:
						{
						
						System.out.println("Total available tickets are :");
						MovieTicket.availableTickets();
						break;
							
						}
					
					default:System.out.println("enter valid choice");
					}

				
				
				}
		 case 2:
				{
				isexit=false;
			    break;
				}
         
		default:
				System.out.println("enter valid choice");
			
			}
			

				
		}
	
		
		                           


	}
}
