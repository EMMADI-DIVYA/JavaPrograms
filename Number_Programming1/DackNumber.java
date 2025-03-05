// program to check wheather  agiven number is duck number or not
// Duck number: in the number there will be atleast one "0" .ex:--405,3040,240 are the duck numbers ---> hint to do this program is :prouct of the digits of number is equal to zero'
class DackNumber 
{
	public static void main(String[] args) 
	{
		int n=405;
		int pro=1;
		while(n!=0)
		{
			int last_digit=n%10;
			pro=pro*last_digit;
			n=n/10;
		}
		if(pro==0)
		{
			System.out.println("duck number.");
		}

		else
		{
            System.out.println("duck number.");
		}

	}
}
