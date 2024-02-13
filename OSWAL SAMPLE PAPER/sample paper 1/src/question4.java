import java.util.*;

public class question4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a[] = new int[20];
        System.out.println("Enter 20 integer values:-");
        for (int i = 0; i < a.length; i++)
            a[i] = in.nextInt();
        //b[] for ascending first 10 digits
        int b[] = new int[10];
        for (int i = 0; i < 10; i++)
            b[i] = a[i];
        //c[] for descending last 10 digits
        int c[] = new int[10];
        int x = 10;
        for (int i = 0; i < 10; i++) {
            c[i] = a[i];
            x++;
        }

        // arranging first 10 in ascending
        for (int i = 0; i < b.length - 1; i++) {
            for (int j = 0; j < b.length - i - 1; j++) {
                if (b[j] > b[j + 1]) {
                    int z = b[j];
                    b[j] = b[j + 1];
                    b[j + 1] = z;
                }
            }
        }
        System.out.println();
        System.out.println("First 10 numbers in ascending order :-");
        for (int i = 0; i < b.length; i++)
            System.out.print(b[i] + ", ");

        //last 10 in descending order
        for (int i = 0; i < c.length - 1; i++) {
            for (int j = 0; j < c.length - i - 1; j++) {
                if (c[j + 1] > c[j]) {
                    int y = c[j];
                    c[j] = c[j + 1];
                    c[j + 1] = y;
                }
            }
        }

        System.out.println();
        System.out.println("Last 10 numbers in decsending order :-");
        for (int i = 0; i < c.length; i++)
            System.out.print(c[i] + ", ");
    }
}
