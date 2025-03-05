/* triangle paterrns-4(triangle patterns are there)*/
/* triangle 1 pattern */
/* 


 Enter no.of rows : 5
 *
 *  *
 *  *  *
 *  *  *  *
 *  *  *  *  *  
 
 
 
 
 */



                  
import java.util.Scanner;
class Triangle1Pattern 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter no.of rows : ");
		int rows=sc.nextInt();
		int starCount=1;
		for(int r=1;r<=rows;r++)
		{
			for(int c=1;c<=starCount;c++) // for(int c=1;c<=r;c++)
			{
				System.out.print(" * ");
			}
			System.out.println();
			starCount++;
		}
		
	}
}
