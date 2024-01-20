import java.util.Scanner;

public class question8 {
    void display() {
        System.out.println("1st method:- ");
        for (int i = 1; i < 6; i++) {
            for (int j = 1; j <= i; j++)
                System.out.print(j);
            System.out.println();
        }
        System.out.println();
    }

    void display(int n) {
        System.out.println(n);
        // extracting digits
        System.out.println("Square roots:-");
        do {
            int digit = n % 10;
            System.out.println(Math.sqrt(digit));
            n = n / 10;
        } while (n > 0);

    }

    public static void main(String args[]) {
        question8 ob = new question8();
        Scanner in = new Scanner(System.in);
        ob.display();
        System.out.println("2nd method:- ");
        System.out.println("Enter number");
        int n = in.nextInt();
        ob.display(n);
    }

}
