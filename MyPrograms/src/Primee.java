import java.util.Scanner;

public class Primee {
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter any integer:");
        int i = in.nextInt();

        if (i <= 1) {
            System.out.println("Please enter a positive integer greater than 1.");
            return;
        }

        if (isPrime(i)) {
            System.out.println("It is a prime number");
        } else {
            System.out.println("It is a composite number");

            int smallerPrime = i - 1;
            int largerPrime = i + 1;

            while (true) {
                if (isPrime(smallerPrime)) {
                    System.out.println(smallerPrime + " is the nearest prime number");
                    break;
                }
                if (isPrime(largerPrime)) {
                    System.out.println(largerPrime + " is the nearest prime number");
                    break;
                }
                smallerPrime--;
                largerPrime++;
            }
        }
    }
}
