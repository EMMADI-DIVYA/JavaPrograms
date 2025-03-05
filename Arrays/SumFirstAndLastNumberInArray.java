package Com;


public class SumFirstAndLastNumberInArray {
	public static void main(String[] args)
	{
		int [] a= {1,2,3,4,8};
		int sum=a[0] + a[a.length-1];
		System.out.println("sum of first and last number in an array: "+ sum);
	}

}
