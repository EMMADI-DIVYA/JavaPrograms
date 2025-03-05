/*


enter no.of rows: 9
 *
 *  *
 *  *  *
 *  *  *  *
 *  *  *  *  *
 *  *  *  *
 *  *  *
 *  *
 *


 */





import java.util.Scanner;
class PatternRightSidePyramid 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
        System.out.print("enter no.of rows: ");
		int rows=sc.nextInt();
		int starCount=1;
		for(int r=1;r<=rows;r++)
		{
			for(int c=1;c<=starCount;c++)
			{
				System.out.print(" * ");

			}
			if(r<(rows/2)+1)
			{
				starCount++;
			}
			else
			{
				starCount--;
			}
			System.out.println();
		}
		
	}
}
