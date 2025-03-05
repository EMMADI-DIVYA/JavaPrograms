class ArrayElementsStore 
{
	public static void main(String[] args) 
	{
		// array : create:array declare and intialized
		int [] a= new int[5];
		// store the elements in a array : syntax ==>  array_name[index]=data;
		a[0]=7;
		a[1]=3;
		a[2]=6;
		a[4]=9;
		//display/print the array elements
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);// not intialized any value so compiler will give default value :"0" and 0 is displayed.
		System.out.println(a[4]);

	}
}
