import java.util.Scanner;
class ArrayOddNum 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter a size of the array: ");
		int size = sc.nextInt();
		int [] a= new int[size];
		for(int i=0;i<=a.length-1;i++)
		{
			System.out.println("enter element in "+ i+" index : ");
			a[i]=sc.nextInt();
		}
		System.out.println("odd numbers in even index : ");
		for(int i=1;i<=a.length-1;i++)
		{
			/*
			we can also write this logic
			for(int i=0;i<=a.length-1;i++)
			if(i!=0 && i%2==0 && a[i]%2!=0)
			*/
			if(i%2==0)
			{
				if(a[i]%2!=0)
				{
					System.out.println("index : "+i+" element : "  +a[i]);
				}
			}
		}

	}
}
