package javaprogramstudyhour;

/*
public class largestEvenInArr {
	 public static void main(String[] args) {
	        int a[] = {3, 6, 7, 4, 8};

	        int smallestEven = a[0];
	        boolean foundEven = false;

	        for (int i = 0; i < a.length; i++) {
	            if (a[i] % 2 == 0) {
	                if (a[i] < smallestEven) {
	                    smallestEven = a[i];
	                }
	                foundEven = true;
	            }
	        }

	        if (foundEven) {
	            System.out.println("Smallest even element in the array: " + smallestEven);
	        } else {
	            System.out.println("No even numbers in the array.");
	        }
	    }

}

*/

public class largestEvenInArr {
	 public static void main(String[] args) {
	        int a[] = {3, 6, 7, 4, 8,11,13};
             int largestEven=a[0];
             int smallestEven=a[0];
	        for(int i=0;i<=a.length-1;i++)
	        {
	        	if(a[i]%2==0)
	        	{
	        		if(a[i]>largestEven)
	        			largestEven=a[i];
	        		
	        		if(a[i]<smallestEven)
	        		{
	        			smallestEven=a[i];
	        		}
	        	}
	        	
	        	
	        }
	        System.out.println("largest even element is : "+largestEven);
	        System.out.println("smallest even element is : "+smallestEven);
	    }

}
