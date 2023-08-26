import java.util.Scanner;

/**
 * Question 1
 * Design a class with the following specifications:
 * Class name: Student
 * Member variables: name – name of student
 * age – age of student
 * mks –marks obtained
 * stream – stream allocated
 * (Declare the variables using appropriate data types)
 * Member methods:
 * void accept() – Accept name, age and marks using methods of Scanner class.
 * void allocation() – Allocate the stream as per following criteria:
 * mks stream
 * > = 300 Science and Computer
 * > = 200 and < 300 Commerce and Computer
 * > = 75 and 200 Arts and Animation
 * < 75 Try Again
 * void print() – Display student name, age, mks and stream allocated.
 * Call all the above methods in main method using an object.
 **/

public class Student {
    int age, mks;
    String stream, name;

    void accept() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter name: ");
        name = in.nextLine();
        System.out.print("Enter age: ");
        age = in.nextInt();
        System.out.print("Enter Marks: ");
        mks = in.nextInt();
    }

    void allocation() {
        if (mks >= 300)
            stream = "Science and Computer";
        else if (mks >= 200 && mks < 300)
            stream = "Commerce and Computer";
        else if (mks >= 75 && mks < 200)
            stream = "Arts and Animation";
        else if (mks < 75)
            stream = "Try Again";
        else
            System.out.println("Wrong input");
    }

    void print() {
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("Marks : " + mks);
        System.out.println("Stream Alloted : " + stream);
    }
public static void main(String args[])
    {

        {
            Student ob = new Student();
            ob.accept();
            ob.allocation();
            ob.print();
        }
    }
}

/**
 * Question 2
 * Define a class to accept 10 characters from a user. Using bubble sort
 * technique arrange
 * them in ascending order. Display the sorted array and original array.
 **/

/*
 * Question 3
 * Define a class to overload the function print as follows:
 * void print() to print the following format
 * 1 1 1 1
 * 2 2 2 2
 * 3 3 3 3
 * 4 4 4 4
 * 5 5 5 5
 * void print(int n) To check whether the number is a lead number. A
 * lead number is the one whose sum of even digits are
 * equal to sum of odd digits.
 * e.g. 3669 odd digits sum = 3 + 9 = 12
 * even digits sum = 6 + 6 = 12
 * 3669 is a lead number.
 **/

public class PrintOverload {
    public void print() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 4; j++) {
                System.out.print(i + "     ");
            }
            System.out.println();
        }
    }
}

/**
 * Question 4
 * Define a class to accept a String and print the number of digits, alphabets
 * and special
 * characters in the string.
 * Example: S = “KAPILDEV@83”
 * Output: Number of digits – 2
 * Number of Alphabets – 8
 * Number of Special characters – 1
 **/

/**
 * Question 5
 * Define a class to accept values into an array of double data type of size 20.
 * Accept a double
 * value from user and search in the array using linear search method. If value
 * is found
 * display message “Found” with its position where it is present in the array.
 * Otherwise
 * display message “not found”.
 **/

/**
 * Question 6
 * Define a class to accept values in integer array of size 10. Find sum of one
 * digit number
 * and sum of two digit numbers entered. Display them separately.
 * Example: Input: a[ ] = {2, 12, 4, 9, 18, 25, 3, 32, 20, 1}
 * Output: Sum of one digit numbers : 2 + 4 + 9 + 3 + 1 = 19
 * Sum of two digit numbers : 12 + 18 + 25 + 32 + 20 = 107
 **/