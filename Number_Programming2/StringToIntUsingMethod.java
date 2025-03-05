//valueOf() method prsent in string class which is used to convert int to string
class StringToIntUsingMethod
{
	public static void converStrtoInt(int n)
	{
		String s=String.valueOf(n);
		System.out.println("this is String "+s);
	}

	public static void main(String[] args) 
	{
		int num=123;
		System.out.println("this is number "+num);

		converStrtoInt(num);

	}
}
