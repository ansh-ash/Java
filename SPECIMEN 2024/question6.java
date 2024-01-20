import java.util.*;

public class question6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a[][] = new int[3][3];
        System.out.println("Enter the numbers for a 3x3 array");
        // inputting
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++)
                a[i][j] = in.nextInt();
        }
        System.out.println();

        // printing array
        System.out.println("Array:- ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++)
                System.out.print(a[i][j] + "  ");
            System.out.println();
        }

        // calculating sum
        int osum = 0;
        int esum = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (a[i][j] % 2 == 0)
                    esum = esum + a[i][j];
                else
                    osum = osum + a[i][j];
            }
        }
        if (esum == osum)
            System.out.println("It is a special array");
        else
            System.out.println("It is not a special array");

    }
}
