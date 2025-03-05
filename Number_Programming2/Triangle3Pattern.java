/* triangle paterrns-4(triangle patterns are there)*/
/* triangle 3 pattern */


/*  Enter no.of rows : 5
             *
          *  *  *
       *  *  *  *  *
    *  *  *  *  *  *  *
 *  *  *  *  *  *  *  *  *       */


import java.util.Scanner;
class Triangle3Pattern 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter no.of rows : ");
		int rows=sc.nextInt();
		int spaceCount=rows-1;
		int starCount=1;
		
		for(int r=1;r<=rows;r++)
		{
			for(int c=1;c<=spaceCount;c++)
			{
				System.out.print("   ");
			}
			for(int c=1;c<=starCount;c++) 
			{
				System.out.print(" * ");
			
			}
			System.out.println();
			spaceCount--;
			starCount+=2;
		}
		
	}
}