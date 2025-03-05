/*


enter no.of rows:
7
          *
       *  *  *
    *  *  *  *  *
 *  *  *  *  *  *  *
    *  *  *  *  *
       *  *  *
          *


		  */





import java.util.Scanner;
class  DiamondPyramidPattern
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter no.of rows: ");
		int rows=sc.nextInt();
		int spaceCount=rows/2;
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
			if(r<((rows/2)+1))
			{
				spaceCount--;
				starCount+=2;
			}
			else
			{
                spaceCount++;
				starCount-=2;
			}
			System.out.println();
		}
	}

		
}

