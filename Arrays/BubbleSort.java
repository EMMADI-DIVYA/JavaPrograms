package Com;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] a = {8, 1, 3, 2, 5, 6};

        for (int i = 0; i < a.length - 1; i++) {  // Outer loop runs n-1 times
            for (int j = 0; j < a.length - 1-i; j++) {  // Inner loop runs n-1-i times
                if (a[j] > a[j + 1]) {  // Swap if the left element is greater
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(a));  // Correctly prints sorted array
    }
}

