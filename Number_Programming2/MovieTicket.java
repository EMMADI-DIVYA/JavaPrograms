public class MovieTicket 
{
	public static int tolTickets=100;

public static void bookTicket(int noOftickets)
{
	if(noOftickets>0)
	{
		tolTickets=tolTickets-noOftickets;
		System.out.println(noOftickets+" tickets successfully booked your tickets....");
	}
	else
	{
		System.out.println("enter valid no.of tickets to be booked");
	}


}

public static void cancelTicket(int noOftickets)
{
	if(noOftickets>0)
	{
		tolTickets=tolTickets+noOftickets;
		System.out.println(noOftickets+" tickets successfully cancelled your tickets....");
	}
	else
	{
		System.out.println("enter valid no.of tickets to be cancelled");
	}


}

public static void availableTickets()
{
	System.out.println("Total no.of tickets available are : "+tolTickets);
}
}