class ArrayNonprimitiveElementsStore 
{
	public static void main(String[] args) 
	{
		String [] clg = new String[4];
		clg[0]="jbit";
		clg[1]="cbit";
		clg[3]="mgit";
		// clg[2] we will get null .if developer is not intialized any value then for string compiler give default value for string i.e, "null"
		System.out.println(clg[0] +" " +clg[1] + " " +clg[2] + " " + clg[3]);
	}
}
