import java.util.Scanner;
class pyramidNum 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter no of rows : ");
		int rows=sc.nextInt();
		
		for(int r=1;r<=rows;r++)
		{
			for(int c=;c>=0;c--)
			{
                  System.out.print("  ");
			}
			for(int c=1;c<=r;c++)
			{
                   System.out.print(r+" ");
			}
			
			System.out.println();
		}
		
	}
}
