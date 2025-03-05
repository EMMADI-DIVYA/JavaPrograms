/*
enter no.of rows: 5
5 5 5 5 5
4 4 4 4
3 3 3
2 2
1
*/
import java.util.Scanner;
class NumRowNUmber
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter no.of rows: ");
		int rows =sc.nextInt();
		for(int r=rows;r>=1;r--)
		{
			for(int c=1;c<=r;c++)
			{
				System.out.print(r+" ");
			}
			System.out.println();
		}
	}
}
