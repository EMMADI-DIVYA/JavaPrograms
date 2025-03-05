package javaprogramstudyhour;

public class sumOfDuplicate {
	

	
	    public static void main(String args[]) {
	        int a[] = {3, 7, 9, 2, 11, 3, 7, 9, 9}; 
	        int sumOfDuplicates = 0;

	        for (int i = 0; i < a.length; i++) {
	            boolean alreadyCounted = false;

	            for (int k = 0; k < i; k++) {
	                if (a[i] == a[k]) {
	                    alreadyCounted = true;
	                    break;
	                }
	            }

	            if (alreadyCounted) 
	            	continue;

	            for (int j = i + 1; j < a.length; j++) {
	                if (a[i] == a[j]) {
	                    sumOfDuplicates += a[i];
	                    break; // Add once and move to the next element
	                }
	            }
	        }

	        System.out.println("Sum of duplicate numbers in the array: " + sumOfDuplicates);
	    }
	


}
