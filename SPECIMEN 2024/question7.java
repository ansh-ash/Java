import java.util.*;

//program to find out if a number is a duck number or not
public class question7 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number");
        int num = in.nextInt();
        int digit;
        int numc = num;
        int digitc;
        boolean ans = false;
        int ctr = 0;
        int num1 = num;
        // to check number of digits entered...should be 3 according to question
        do {
            digitc = numc % 10;
            numc = numc / 10;
            ctr++;
        } while (numc != 0);

        if (ctr == 3) {
            // to check if number is duck number
            do {
                digit = num % 10;
                if (digit == 0)
                    ans = true;
                num = num / 10;
            } while (num != 0);
            if (ans == true)
            System.out.println(num1 + " is a Duck Number");
            else
            System.out.println(num1+" is not a Duck Number");
        } else
            System.out.println("Invalid");
    }
}
