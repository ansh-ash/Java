/**
 * Question 8
 * Define a class to accept values in integer array of size 10. Find sum of one digit number and sum of two digit numbers entered. Display them separately.
 * Example: Input: a[ ] = {2, 12, 4, 9, 18, 25, 3, 32, 20, 1}
 * Output: Sum of one digit numbers : 2 + 4 + 9 + 3 + 1 = 19
 * Sum of two digit numbers : 12 + 18 + 25 + 32 + 20 = 107
 */

import java.util.*;

public final class Question8 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int oneSum = 0, twoSum = 0, d = 0;
        int arr[] = new int[10];
        System.out.println("Enter 10 numbers");
        int l = arr.length;

        for (int i = 0; i < l; i++) {
            arr[i] = in.nextInt();
        }

        for (int i = 0; i < l; i++) {
            if (arr[i] >= 0 && arr[i] < 10)
                oneSum += arr[i];
            else if (arr[i] >= 10 && arr[i] < 100)
                twoSum += arr[i];
        }

        System.out.println("Sum of 1 digit numbers = " + oneSum);
        System.out.println("Sum of 2 digit numbers = " + twoSum);

    }
}
