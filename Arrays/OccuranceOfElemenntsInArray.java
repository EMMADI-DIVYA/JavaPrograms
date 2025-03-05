package Com;

public class OccuranceOfElemenntsInArray {
	public static void main(String[] args)
	{
		
	int a []= {1,2,3,1,2,4,5};
	for(int i=0 ;i<=a.length-1;i++)
	{
		int count=0;
		
		 boolean alreadyCounted = false;
         for (int k = 0; k < i; k++) {
             if (a[i] == a[k]) {
                 alreadyCounted = true;
                 break;
             }
         }
         if (alreadyCounted) {
             continue;
         }

		for(int j=0;j<=a.length-1;j++)
		{
			if(a[i]==a[j])
			   count++;
		}
		
		
		System.out.println(a[i]+" is Repeated "+count+" Times");
	}

}
}
