/*Question 4
Define a class to accept 10 characters from a user. Using bubble sort technique arrange 
them in ascending order. Display the sorted array and original array.**/
import java.util.*;

public class Question4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char a[] = new char[10];
        System.out.println("Enter 10 characters:- ");
        //inputting characters
        for (int i = 0; i < a.length; i++)
            a[i] = in.next().charAt(0);
        //bubble sort
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    char z = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = z;
                }
            }
        }
        System.out.println("Sorted array:- ");
        for(int i = 0; i < a.length; i++)
            System.out.print(a[i]+", ");
    }
}