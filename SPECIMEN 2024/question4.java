import java.util.*;

public class question4 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int a[] = new int[10];
        System.out.println("Enter 10 integer values");
        for (int i = 0; i < 10; i++)
            a[i] = in.nextInt();

        System.out.println("Arrays before selection sort:- ");
        for (int i = 0; i < 10; i++)
            System.out.print(a[i] + ", ");
        // carrying out selection sort;
        int smallest = 0;
        int temp;
        for (int i = 0; i < 9; i++) {
            for (int j = i + 1; j < 10; j++) {
                if (a[j] < a[smallest])
                    smallest = j;
            }
            temp = a[smallest];
            a[smallest] = a[i];
            a[i] = temp;
        }
        System.out.println();
        System.out.println("Array after selection sort:- ");
        for (int i = 0; i < 10; i++)
            System.out.print(a[i] + ", ");
    }
}
