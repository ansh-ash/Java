/*Question 5
Define a class to overload the function print as follows:  
void print()     to print the following format  
     1     1     1     1   
     2     2     2     2 
     3     3     3     3 
     4     4     4     4 
     5     5     5     5 
void print(int n)   To check whether the number is a lead number. A 
lead number is the one whose sum of even digits are 
equal to sum of odd digits. 
     e.g. 3669 odd digits sum = 3 + 9 = 12 
       even digits sum = 6 + 6 = 12 
     3669 is a lead number.**/

import java.util.*;

public class Question5 {
    void print() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 4; j++) {
                System.out.print(i + "     ");
            }
            System.out.println();
        }
    }

    void print(int n) {
        int osum = 0;
        int esum = 0;
        int digit;
        do {
            digit = n % 10;
            if (digit % 2 == 0) esum = esum + digit;
            else osum = osum + digit;
            n = n / 10;
        } while (n != 0);
        if (esum == osum) System.out.println("It is a lead number");
        else System.out.println("It is not a lead number");
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Question5 ob = new Question5();
        ob.print();
        System.out.println();
        System.out.println("Enter number to check if it is a lead number");
        int n = in.nextInt();
        ob.print(n);
    }
}
