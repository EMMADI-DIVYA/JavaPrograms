class Data_Type_Casting
{
	public static void main(String [] args)
	{

		/* implicit conversion/widening datatype casting*/
		byte a=100;
		short b= a;

		/* Explicit conversion/narrowing datatype casting*/
		long c=250;
		short d = (short) c;
		
        /* implicit conversion/widening datatype casting*/
		System.out.println(b);
		System.out.println(((Object)b).getClass().getSimpleName());// to know type of data 

        /* Explicit conversion/narrowing datatype casting*/
		System.out.println(d);
		System.out.println(((Object)d).getClass().getSimpleName());// to know type of data 

	}
}