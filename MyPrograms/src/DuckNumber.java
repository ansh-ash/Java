import java.util.Scanner;
public class DuckNumber {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = in.nextInt();
        int digit, ctr = 0;
        int ans=0;
        {
            do {
                digit = num % 10;
                num = num / 10;
                ctr++;
                if(digit==0)
                    ans = 1;
            }
            while (num > 0);
            if (ctr == 3)
            {
                if(ans==1)
                    System.out.println("Is a duck number");
                else
                    System.out.println("Is not a duck number");
            }
            else
                System.out.println("Invalid");
        }
    }
}