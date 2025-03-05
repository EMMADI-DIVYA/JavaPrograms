package javaprogramstudyhour;

public class LargestPrimeNumberInArr {
	public static void main(String args[]) {
        int a[] = {3, 7, 9, 2, 11};
        int longestPrime = -1; 

        for (int i = 0; i < a.length; i++) {
            boolean isPrime = true;

            if (a[i] < 2) {
                isPrime = false;
            } else {
                for (int j = 2; j * j <= a[i]; j++) { 
                    if (a[i] % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }

            if (isPrime && a[i] > longestPrime) {
                longestPrime = a[i];
            }
        }

        if (longestPrime != -1) {
            System.out.println("Largest prime number in the array: " + longestPrime);
        } else {
            System.out.println("No prime numbers found in the array.");
        }
    }

}
