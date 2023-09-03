import java.util.Scanner;

class odd_even {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int num;
        System.out.println("Enter the number");
        num = in.nextInt();
        if (num % 2 == 0)
            System.out.println("The number is even");
        else
            System.out.println("The number is odd");

    }
}

class leapyear_1 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int year;
        System.out.println("Enter the year");
        year = in.nextInt();
        if (year % 4 == 0)
            System.out.println("This year is a leap year");
        else
            System.out.println("This year is not a leap year");
    }
}

class voting {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int age;
        System.out.println("Enter your age");
        age = in.nextInt();
        String vote;
        vote = (age >= 18) ? "Eligible" : "Not eligible";
        System.out.println(vote);
    }
}

class calculator // asks user to input two numbers and what operation to perform
{
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        double num1;
        double num2;
        System.out.println("Enter two numbers");
        num1 = in.nextDouble();
        num2 = in.nextDouble();
        int operator;
        System.out.println("Enter +, -, *, / as per your convenience");
        operator = in.next().charAt(0);
        switch (operator) {
            case '+':
                System.out.println("Sum of the numbers are");
                System.out.println(num1 + num2);
                break;
            case '-':
                System.out.println("Difference of numbers are");
                System.out.println(num1 - num2);
                break;
            case '*':
                System.out.println("Multiplication of numbers are");
                System.out.println(num1 * num2);
                break;
            case '/':
                System.out.println("Quotient of numbers are");
                System.out.println(num1 / num2);
                break;
            default:
                System.out.println("Invalid input");

        }
    }

    // the below program takes input of a letter and check if it is a vowel or
    // not(can be capital or small)
    class vowels {
        public static void main(String args[]) {
            Scanner in = new Scanner(System.in);
            System.out.println("Enter the letter");
            char letter;
            letter = in.next().charAt(0);
            switch (letter) {
                case 'a':
                    System.out.println("a is a vowel");
                    break;
                case 'A':
                    System.out.println("A is a vowel");
                    break;
                case 'e':
                    System.out.println("e is a vowel");
                    break;
                case 'E':
                    System.out.println("E is a vowel");
                    break;
                case 'i':
                    System.out.println("i is a vowel");
                    break;
                case 'I':
                    System.out.println("I is a vowel");
                    break;
                case 'o':
                    System.out.println("o is a vowel");
                    break;
                case 'O':
                    System.out.println("O is a vowel");
                    break;
                case 'u':
                    System.out.println("u is a vowel");
                    break;
                case 'U':
                    System.out.println("U is a vowel");
                    break;
                default:
                    System.out.println("It is a constant");
            }
        }
    }

    class passing_division {
        public static void main(String args[]) {
            Scanner in = new Scanner(System.in);
            double ss;
            double sci;
            double hindi;
            double comp;
            double maths;
            System.out.println("Enter your marks from Social Studies");
            ss = in.nextDouble();
            System.out.println("Enter your marks from Science");
            sci = in.nextDouble();
            System.out.println("Enter your marks from Maths");
            maths = in.nextDouble();
            System.out.println("Enter your marks from Computer");
            comp = in.nextDouble();
            System.out.println("Enter your marks from Hindi");
            hindi = in.nextDouble();
            double sumpercent;
            sumpercent = ss + sci + hindi + comp + maths;
            double percent;
            percent = (sumpercent / (80.0 * 5.0)) * 100.0;
            System.out.println("You have attained " + percent + "%");
            String result;
            result = (percent >= 33) ? "You have passed" : "You have failed";
            System.out.println(result);
        }
    }

    class seconds_calculator {
        public static void main(String args[]) {
            Scanner in = new Scanner(System.in);
            int inpsecs;
            System.out.println("Enter the seconds");
            inpsecs = in.nextInt();
            // since we know that 1 day = 86400 seconds; 1 hour = 3600 secs; 1 minute = 60
            // secs;
            int day;
            int hour;
            int mins;
            int a; // creating a variable to help while calculating the minutes
            int secs;
            day = inpsecs / 86400;
            hour = inpsecs / 3600;
            a = inpsecs / 60;
            mins = a % 60;
            secs = inpsecs % 60;
            System.out.print(day + " day(s) ");
            System.out.print(hour + " hour(s) ");
            System.out.print(mins + " minute(s) ");
            System.out.print(secs + " second(s) ");
        }
    }

    class loops_prog1 {
        public static void main(String args[]) {
            int a;
            for (a = 1; a <= 10; a++) {
                System.out.println("Happy New Year");
            }
        }
    }

    class loops_prog2 {
        public static void main(String args[]) {
            int a;
            for (a = 1; a <= 10; a++) {
                System.out.println("Natural numbers from 1 to 10 are " + a);
            }
        }
    }

    class loops_prog3 {
        public static void main(String args[]) {
            Scanner in = new Scanner(System.in);

        }
    }

    // this program calculates the area widely used polygons(triangles and
    // quadrilaterals)
    class area_calculator {
        public static void main(String args[]) {
            Scanner in = new Scanner(System.in);
            int choice;
            double area;
            double length;
            double breadth;
            double base;
            double height;
            double side;
            double a;
            double b;
            double c;
            double s;
            double d1;
            double d2;
            double pi = 22.0 / 7.0;
            double r;
            System.out.println("1 - Area of right angle triangle");
            System.out.println("2 - Area of equilateral triangle");
            System.out.println("3 - Area of isosceles triangle");
            System.out.println("4 - Area of scalene triangle");
            System.out.println("5 - Area of parallelogram");
            System.out.println("6 - Area of rhombus");
            System.out.println("7 - Area of rectangle");
            System.out.println("8 - Area of square");
            System.out.println("9 - Area of trapezium");
            System.out.println("10 - Area of circle");

            System.out.println("--------------------------------------------");
            System.out.println("Select your choice");
            choice = in.nextInt();
            System.out.println("--------------------------------------------");
            switch (choice) {
                // 1.Right angle triangle
                case 1:
                    System.out.println("You chose area of right angle triangle");
                    System.out.println("Enter the base of the triangle in cm");
                    base = in.nextDouble();
                    System.out.println("Enter the height of the triangle in cm");
                    height = in.nextDouble();
                    area = (1.0 / 2.0) * base * height;
                    System.out.println("The area of the right angle triangle is " + area + "cm2");
                    break;
                // 2.Equilateral triangle
                case 2:
                    System.out.println("You chose area of equilateral triangle");
                    System.out.println("Enter the side of the equilateral triangle in cm");
                    side = in.nextDouble();
                    area = (Math.sqrt(3) / 4.0) * (side * side);
                    System.out.println("The area of the equilateral triangle is " + area + "cm2");
                    break;
                // 3.Isosceles triangle
                case 3:
                    System.out.println("You chose area of isosceles triangle");
                    System.out.println("Enter side'a' in cm");
                    a = in.nextDouble();
                    System.out.println("Enter side'b' in cm");
                    b = in.nextDouble();
                    area = ((1.0 / 4.0) * b) * (Math.sqrt((4 * a * a) - (b * b)));
                    System.out.println("The area of the isosceles triangle is " + area + "cm2");
                    break;
                // 4.Scalene triangle
                case 4:
                    System.out.println("You chose area of scalene triangle");
                    System.out.println("Enter the three sides of the scalene triangle in cm");
                    a = in.nextDouble();
                    b = in.nextDouble();
                    c = in.nextDouble();
                    s = (a + b + c) / 2.0;
                    area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
                    System.out.println("The area of the scalene triangle is " + area + "cm2");
                    break;
                // 5.Parallelogram
                case 5:
                    System.out.println("You chose area of parallelogram");
                    System.out.println("Enter the height of the parallelogram in cm");
                    height = in.nextDouble();
                    System.out.println("Enter the base of the parallelogram in cm");
                    base = in.nextDouble();
                    area = height * base;
                    System.out.println("The area of the parallelogram is " + area + "cm2");
                    break;
                // 6.Rhombus
                case 6:
                    System.out.println("You chose area of rhombus");
                    System.out.println("Enter the first diagonal in cm");
                    d1 = in.nextDouble();
                    System.out.println("Enter the second diagonal in cm");
                    d2 = in.nextDouble();
                    area = ((1.0 / 2.0) * d1 * d2);
                    System.out.println("The area of the rhombus is " + area + "cm2");
                    break;
                case 7:
                    System.out.println("You chose area of rectangle");
                    System.out.println("Enter the length of the rectangle");
                    length = in.nextDouble();
                    System.out.println("Enter the breadth of the rectangle");
                    breadth = in.nextDouble();
                    area = length * breadth;
                    System.out.println("The area of the rectangle" + area + "cm2");
                    break;
                case 8:
                    System.out.println("You chose the area of square");
                    System.out.println("Enter the side of the square in cm");
                    side = in.nextDouble();
                    area = Math.pow(side, 2);
                    System.out.println("The area of the square is " + area + "cm2");
                    break;
                case 9:
                    System.out.println("You chose area of trapezium ");
                    System.out.println("Enter side 1 in cm");
                    a = in.nextDouble();
                    System.out.println("Enter side 2 in cm");
                    b = in.nextDouble();
                    System.out.println("Enter the height in cm");
                    height = in.nextDouble();
                    area = (1.0 / 2.0) * (a + b) * height;
                    System.out.println("The area of the trapezium is " + area + "cm2");
                    break;
                case 10:
                    System.out.println("You chose area of circle");
                    System.out.println("Enter the radius of the circle in cm");
                    r = in.nextDouble();
                    area = pi * (r * r);
                    System.out.println("The area of the circle is " + area + "");
                    break;
                default:
                    System.out.println("Invalid Input");
            }
        }
    }

    /**
     * Unsolved Java Programming - Q.1 - Write a program to input three angles of a
     * triangle and check whether a triangle is possible or not. If possible then
     * check whether it is an acute-angled triangle, right-angled or an
     * obtuse-angled triangle otherwise, display 'Triangle not possible'.
     * Sample Input: Enter three angles: 40, 50, 90
     * Sample Output: Right=angled Triangle
     */

    class angles_of_triangle {
        public static void main(String args[]) {
            Scanner in = new Scanner(System.in);
            double a;
            double b;
            double c;
            System.out.println("Enter the three angles of a triangle");
            a = in.nextDouble();
            b = in.nextDouble();
            c = in.nextDouble();
            if (a + b + c == 180) {
                if (a < 90 && b < 90 && c < 90) {
                    System.out.println("It is an Acute Triangle");
                } else if (a == 90 || b == 90 || c == 90) {
                    System.out.println("It is a Right Angle Triangle");
                } else if (a + b > 90 || b + c > 90 || a + c > 90) {
                    System.out.println("It is an Obtuse Triangle");
                }
            } else {
                System.out.println("Triangle not possible");
            }
        }
    }

    /**
     * Unsolved Java Programming - Q.3 - Write a program to input three numbers and
     * check whether they are equal or not. If they are unequal numbers then display
     * the greatest among them otherwise, display the message 'All the numbers are
     * equal'.
     * Sample Input: 34, 87, 61
     * Sample Output: Greatest number: 87
     * Sample Input: 81, 81, 81
     * Sample Output: All the numbers are equal.
     */

    class chp7_unsolved_q3 {
        public static void main(String args[]) {
            Scanner in = new Scanner(System.in);
            int a;
            int b;
            int c;
            System.out.println("Enter three numbers");
            a = in.nextInt();
            b = in.nextInt();
            c = in.nextInt();
            if (a != b && b != c && a != c) {
                if (a > b && a > c) {
                    System.out.println("Greatest number: " + a);
                } else if (b > c && b > a) {
                    System.out.println("Greatest number: " + b);
                } else if (c > a && c > b) {
                    System.out.println("Greatest Number: " + c);
                }

            } else {
                System.out.println("All the numbers are equal");
            }
        }
    }

    /**
     * Unsolved Java Programming - Q.3 - Write a program to input year and check
     * whether it is:
     * (a) a Leap year (b) a Century Leap year (c) a Century year but not a Leap
     * year
     * Sample Input: 2000
     * Sample Output: It is a Century Leap Year.
     */
    class leapyear {
        public static void main(String args[]) {
            Scanner in = new Scanner(System.in);
            int year;
            System.out.println("Enter the year");
            year = in.nextInt();
            if (year % 4 == 0 && year % 400 == 0) {
                if (year % 4 == 0) {
                    System.out.println("It is a leap year");
                } else if (year % 400 == 0) {
                    System.out.println("It is a century leap year");
                }

            } else {
                System.out.println("None");
            }
        }
    }

    class oddnumbers_1to100 {
        public static void main(String args[]) {
            Scanner in = new Scanner(System.in);
            int i = 1;
            while (i <= 100) {
                if (i % 2 != 0) {
                    System.out.println(i);
                }
                i++;

            }
        }
    }

    class evennumbers_1to100 {
        public static void main(String args[]) {
            Scanner in = new Scanner(System.in);
            int i = 1;
            while (i <= 100) {
                if (i % 2 == 0) {
                    System.out.println(i);
                }
                i++;

            }
        }
    }

    class standardangles {
        public static void main(String args[]) {
            Scanner in = new Scanner(System.in);
            int ch, angle;
            double a, o, h, sin0, sin30, sin45, sin60, sin90, cos0, cos30, cos45, cos60, cos90, tan0, tan30, tan45,
                    tan60,
                    cosec30, cosec45, cosec60, cosec90, cot30, cot45, cot60, cot90, sec0, sec30, sec45, sec60;
            String tan90, cot0, sec90, cosec0;
            System.out.println("Enter 1,2,3,4,5,6 for sin, cos, tan, cosec, sec, cot respectively");
            ch = in.nextInt();
            switch (ch) {
                case 1:
                    System.out.println("Enter '0' '30' '45 '60 '90' as per your convinince");
                    angle = in.nextInt();
                    switch (angle) {
                        case 0:
                            System.out.println("Enter opposite");
                            o = in.nextDouble();
                            System.out.println("Enter hypotenuse");
                            h = in.nextDouble();
                            sin0 = 0 * (o / h);
                            System.out.println("The value for sin0 is " + sin0);
                            break;
                        case 30:
                            System.out.println("Enter opposite");
                            o = in.nextDouble();
                            System.out.println("Enter hypotenuse");
                            h = in.nextDouble();
                            sin30 = (1 / 2) * (o / h);
                            System.out.println("The value for sin30 is " + sin30);
                            break;
                        case 45:
                            System.out.println("Enter opposite");
                            o = in.nextDouble();
                            System.out.println("Enter hypotenuse");
                            h = in.nextDouble();
                            sin45 = (1 / Math.sqrt(2)) * (o / h);
                            System.out.println("The value for sin45 is " + sin45);
                            break;
                        case 60:
                            System.out.println("Enter opposite");
                            o = in.nextDouble();
                            System.out.println("Enter hypotenuse");
                            h = in.nextDouble();
                            sin60 = ((Math.sqrt(3)) / 2) * (o / h);
                            System.out.println("The value for sin60 is " + sin60);
                            break;
                        case 90:
                            System.out.println("Enter opposite");
                            o = in.nextDouble();
                            System.out.println("Enter hypotenuse");
                            h = in.nextDouble();
                            sin90 = 1 * (o / h);
                            System.out.println("The value for sin90 is " + sin90);
                            break;
                        default:
                            System.out.println("Invalid Input");
                    }
                case 2:
                    System.out.println("Enter '0' '30' '45 '60 '90' as per your convinince");
                    angle = in.nextInt();
                    switch (angle) {
                        case 0:
                            System.out.println("Enter adjacent");
                            a = in.nextDouble();
                            System.out.println("Enter hypotenuse");
                            h = in.nextDouble();
                            cos0 = 1 * (a / h);
                            System.out.println("The value for cos0 is " + cos0);
                            break;
                        case 30:
                            System.out.println("Enter adjacent");
                            a = in.nextDouble();
                            System.out.println("Enter hypotenuse");
                            h = in.nextDouble();
                            cos30 = ((Math.sqrt(3)) / 2) * (a / h);
                            System.out.println("The value for cos30 is " + cos30);
                            break;
                        case 45:
                            System.out.println("Enter adjacent");
                            a = in.nextDouble();
                            System.out.println("Enter hypotenuse");
                            h = in.nextDouble();
                            cos45 = (1 / Math.sqrt(2)) * (a / h);
                            System.out.println("The value for cos45 is " + cos45);
                            break;
                        case 60:
                            System.out.println("Enter adjacent");
                            a = in.nextDouble();
                            System.out.println("Enter hypotenuse");
                            h = in.nextDouble();
                            cos60 = (1 / 2) * (a / h);
                            System.out.println("The value for cos60 is " + cos60);
                            break;
                        case 90:
                            System.out.println("Enter adjacent");
                            a = in.nextDouble();
                            System.out.println("Enter hypotenuse");
                            h = in.nextDouble();
                            cos90 = 0 * (a / h);
                            System.out.println("The value for cos90 is " + cos90);
                            break;
                        default:
                            System.out.println("Invalid Input");
                    }
                case 3:
                    System.out.println("Enter '0' '30' '45 '60 '90' as per your convinince");
                    angle = in.nextInt();
                    switch (angle) {
                        case 0:
                            System.out.println("Enter adjacent");
                            a = in.nextDouble();
                            System.out.println("Enter opposite");
                            o = in.nextDouble();
                            tan0 = 0 * (o / a);
                            System.out.println("The value for tan0 is " + tan0);
                            break;
                        case 30:
                            System.out.println("Enter adjacent");
                            a = in.nextDouble();
                            System.out.println("Enter opposite");
                            o = in.nextDouble();
                            tan30 = (1 / (Math.sqrt(3))) * (o / a);
                            System.out.println("The value for tan30 is " + tan30);
                            break;
                        case 45:
                            System.out.println("Enter adjacent");
                            a = in.nextDouble();
                            System.out.println("Enter opposite");
                            o = in.nextDouble();
                            tan45 = 1 * (o / a);
                            System.out.println("The value for tan45 is " + tan45);
                            break;
                        case 60:
                            System.out.println("Enter adjacent");
                            a = in.nextDouble();
                            System.out.println("Enter opposite");
                            o = in.nextDouble();
                            tan60 = Math.sqrt(3) * (o / a);
                            System.out.println("The value for tan60 is " + tan60);
                            break;
                        case 90:
                            System.out.println("Enter adjacent");
                            a = in.nextDouble();
                            System.out.println("Enter hypotenuse");
                            h = in.nextDouble();
                            tan90 = "not defined(infinity)";
                            System.out.println("The value for tan90 is " + tan90);
                            break;

                        default:
                            System.out.println("Invalid Input");
                    }
                case 4:
                    System.out.println("Enter '0' '30' '45 '60 '90' as per your convinince");
                    angle = in.nextInt();
                    switch (angle) {
                        case 0:
                            System.out.println("Enter value for hypotenuse");
                            h = in.nextDouble();
                            System.out.println("Enter value for opposite side");
                            o = in.nextDouble();
                            cosec0 = "not defined(infinity)";
                            System.out.println("The value for cosec0 is " + cosec0);
                            break;
                        case 30:
                            System.out.println("Enter value for hypotenuse");
                            h = in.nextDouble();
                            System.out.println("Enter value for opposite side");
                            o = in.nextDouble();
                            cosec30 = 2 * (h / o);
                            System.out.println("The value for cosec30 is " + cosec30);
                            break;
                        case 45:
                            System.out.println("Enter value for hypotenuse");
                            h = in.nextDouble();
                            System.out.println("Enter value for opposite side");
                            o = in.nextDouble();
                            cosec45 = Math.sqrt(2) * (h / o);
                            System.out.println("The value for cosec45 is " + cosec45);
                            break;
                        case 60:
                            System.out.println("Enter value for hypotenuse");
                            h = in.nextDouble();
                            System.out.println("Enter value for opposite side");
                            o = in.nextDouble();
                            cosec60 = ((2) / (Math.sqrt(3))) * (h / o);
                            System.out.println("The value for cosec60 is " + cosec60);
                            break;
                        case 90:
                            System.out.println("Enter value for hypotenuse");
                            h = in.nextDouble();
                            System.out.println("Enter value for opposite side");
                            o = in.nextDouble();
                            cosec90 = 1 * (h / o);
                            System.out.println("The value for cosec90 is " + cosec90);
                            break;
                        default:
                            System.out.println("Invalid Input");
                    }
                case 5:
                    System.out.println("Chose between '0', '30', '45', '60', '90' as per your convinience");
                    angle = in.nextInt();
                    switch (angle) {
                        case 0:
                            System.out.println("Enter the value for hypotenuse");
                            h = in.nextDouble();
                            System.out.println("Enter the value for adjacent side");
                            a = in.nextDouble();
                            sec0 = 1 * (h / a);
                            System.out.println("The value for sec0 is " + sec0);
                            break;
                        case 30:
                            System.out.println("Enter the value for hypotenuse");
                            h = in.nextDouble();
                            System.out.println("Enter the value for adjacent side");
                            a = in.nextDouble();
                            sec30 = ((2) / (Math.sqrt(3))) * (h / a);
                            System.out.println("The value for sec30 is " + sec30);
                            break;
                        case 45:
                            System.out.println("Enter the value for hypotenuse");
                            h = in.nextDouble();
                            System.out.println("Enter the value for adjacent side");
                            a = in.nextDouble();
                            sec45 = (Math.sqrt(2)) * (h / a);
                            System.out.println("The value for sec45 is " + sec45);
                            break;
                        case 60:
                            System.out.println("Enter the value for hypotenuse");
                            h = in.nextDouble();
                            System.out.println("Enter the value for adjacent side");
                            a = in.nextDouble();
                            sec60 = 2 * (h / a);
                            System.out.println("The value for sec60 is " + sec60);
                            break;
                        case 90:
                            System.out.println("Enter the value for hypotenuse");
                            h = in.nextDouble();
                            System.out.println("Enter the value for adjacent side");
                            a = in.nextDouble();
                            sec90 = "not defined(infinity)";
                            System.out.println("The value for sec90 is " + sec90);
                            break;
                        default:
                            System.out.println("Invalid Input");
                    }
                case 6:
                    System.out.println("Chose between '0', '30', '45', '60', '90' as per your convinience");
                    angle = in.nextInt();
                    switch (angle) {
                        case 0:
                            System.out.println("Enter value for adjacent side");
                            a = in.nextDouble();
                            System.out.println("Enter value for opposite side");
                            o = in.nextDouble();
                            cot0 = "not defined(infinity)";
                            System.out.println("The value for cot0 is " + cot0);
                            break;
                        case 30:
                            System.out.println("Enter value for adjacent side");
                            a = in.nextDouble();
                            System.out.println("Enter value for opposite side");
                            o = in.nextDouble();
                            cot30 = (Math.sqrt(3)) * (a / o);
                            System.out.println("The value for cot30 is " + cot30);
                            break;
                        case 45:
                            System.out.println("Enter value for adjacent side");
                            a = in.nextDouble();
                            System.out.println("Enter value for opposite side");
                            o = in.nextDouble();
                            cot45 = 1 * (a / o);
                            System.out.println("The value for cot45 is " + cot45);
                            break;
                        case 60:
                            System.out.println("Enter value for adjacent side");
                            a = in.nextDouble();
                            System.out.println("Enter value for opposite side");
                            o = in.nextDouble();
                            cot60 = ((1) / (Math.sqrt(3))) * (a / o);
                            System.out.println("The value for cot60 is " + cot60);
                            break;
                        case 90:
                            System.out.println("Enter value for adjacent side");
                            a = in.nextDouble();
                            System.out.println("Enter value for opposite side");
                            o = in.nextDouble();
                            cot90 = 0 * (a / o);
                            System.out.println("The value for cot90 is " + cot90);
                            break;
                        default:
                            System.out.println("Invalid Input");
                    }
            }
        }
    }

    class Integers {
        public static void main(String args[]) {
            Scanner in = new Scanner(System.in);
            int pSum = 0, pCount = 0, nSum = 0, nCount = 0;
            System.out.println("Enter 50 numbers");

            for (int i = 1; i <= 50; i++) {
                int n = in.nextInt();
                if (n >= 0) {
                    pSum += n;
                    pCount++;
                } else {
                    nSum += n;
                    nCount++;
                }
            }

            System.out.println("Positive Count = " + pCount);
            System.out.println("Positive Sum = " + pSum);
            System.out.println("Negative Count = " + nCount);
            System.out.println("Negative Sum = " + nSum);
        }
    }

    class tables {
        public static void main(String args[]) {
            Scanner in = new Scanner(System.in);
            int num;
            int product;
            int i;
            System.out.println("Enter a number");
            num = in.nextInt();
            System.out.println("Tables of " + num);
            for (i = 1; i <= 30; i++) {
                product = i * num;
                System.out.println(+num + " x " + i + " = " + product);
            }
        }
    }

    class Calculator {
        public static double add(double num1, double num2) {
            double sum;
            sum = num1 + num2;
            return sum;
        }

        public static double subtract(double num1, double num2) {
            double diff;
            diff = num1 - num2;
            return diff;
        }

        public static double multiply(double num1, double num2) {
            double multi;
            multi = num1 * num2;
            return multi;
        }

        public static double divide(double num1, double num2) {
            double div;
            div = num1 / num2;
            return div;
        }

        public static void main(String args[]) {
            Scanner in = new Scanner(System.in);
            System.out.println("Enter the first number");
            double num1 = in.nextDouble();
            System.out.println("Enter the second number");
            double num2 = in.nextDouble();
            System.out.println("Enter 1,2,3,4 for addition, subtraction, multiplication and division respectively");
            int choice = in.nextInt();
            double a, b, c, d;
            switch (choice) {
                case 1:
                    a = Calculator.add(num1, num2);
                    System.out.println(a);
                    break;
                case 2:
                    b = Calculator.subtract(num1, num2);
                    System.out.println(b);
                    break;
                case 3:
                    c = Calculator.multiply(num1, num2);
                    System.out.println(c);
                    break;
                case 4:
                    d = Calculator.divide(num1, num2);
                    System.out.println(d);
                    break;

            }
        }
    }

    class pattern {
        public static void main(String args[]) {
            for (int i = 1; i <= 5; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.println(j);
                }
            }
            System.out.println();
        }
    }

    class digit_extraction {
        public static void main(String args[]) {
            Scanner in = new Scanner(System.in);
            int num;
            int dig;
            System.out.println("Enter number");
            num = in.nextInt();
            do {
                dig = num % 10;
                System.out.println(dig);
                num = num / 10;
            } while (num > 0);
        }
    }

    class disarium {
        public static void main(String args[]) {
            Scanner in = new Scanner(System.in);
            int count = 0, digit, num, store, sum = 0;
            int pow;
            System.out.println("Enter number");
            num = in.nextInt();
            store = num;

            do // this do while counts the digits
            {
                num = num / 10;
                count++;
            } while (num > 0);
            num = store;
            do {
                digit = num % 10;
                pow = (int) Math.pow(digit, count);
                sum = sum + pow;
                count--;
                num = num / 10;
            } while (num > 0);

            if (store == sum)
                System.out.println("It is a Disarium number");
            else
                System.out.println("It is not a Dissarium number");
        }
    }

    // this program creates a solid rectangle as per the amount of rows and columns
    // the user wants
    class solid_rectangle {
        public static void main(String args[]) {
            Scanner in = new Scanner(System.in);
            int rows, columns;
            System.out.println("Enter number of rows");
            rows = in.nextInt();
            System.out.println("Enter number of columns");
            columns = in.nextInt();
            for (int i = 1; i <= rows; i++) {
                for (int j = 1; j <= columns; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }

        }
    }

    // this program creates a right angled triangle with the amount of rows the user
    // wants
    class right_angle_triangle {
        public static void main(String args[]) {
            Scanner in = new Scanner(System.in);
            int rows;
            System.out.println("Enter number of rows");
            rows = in.nextInt();
            for (int i = 1; i <= rows; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }

    // this program creates an inverted right angled triangle with the amount of
    // rows the user wants
    class inverted_right_angle_triangle {

        public static void main(String args[]) {
            Scanner in = new Scanner(System.in);
            int rows;
            System.out.println("Enter number of rows");
            rows = in.nextInt();
            for (int i = rows; i >= 1; i--) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(" * ");
                }
                System.out.println();
            }
        }
    }

    class niven_harshad {
        public static void main(String args[]) {
            Scanner in = new Scanner(System.in);
            int num, digit, sum = 0, num1;
            System.out.println("Enter number");
            num = in.nextInt();
            num1 = num;
            do {
                digit = num % 10;
                num = num / 10;
                sum = sum + digit;
            } while (num > 0);

            if (num1 % sum == 0) {
                System.out.println("It is a Niven/Harshad Number");
            } else {
                System.out.println("It is not a Niven/Harshad Number");
            }
        }
    }

    class celcius_farenheit {
        public static void main(String args[]) {
            Scanner in = new Scanner(System.in);
            int ch;
            double f, c;
            System.out.println("What would you like to input");
            System.out.println("1-Celsius");
            System.out.println("2-Farenheit");
            System.out.println("------------------------------------------------------------");
            System.out.println("Type the number with your choice");
            ch = in.nextInt();
            switch (ch) {
                case 1:
                    System.out.println("You chose Celsius -----> Farenheit");
                    System.out.println("Enter degree in celsius");
                    c = in.nextDouble();
                    f = (c) * (9.0 / 5.0) + (32.0);
                    System.out.println(c + "°c in farenheit is " + f + "°f");
                    break;
                case 2:
                    System.out.println("You chose Farenheit -----> Celsius");
                    System.out.println("Enter degree in farenheit");
                    f = in.nextDouble();
                    c = ((f) - (32.0)) * (5.0 / 9.0);
                    System.out.println(f + "°f in celsius is " + c + "°c");
                    break;
            }
        }
    }

    /*
     * 1AAAAA
     * 22BBBB
     * 333CCC
     * 4444DD
     * 55555E
     */
    class toughpattern {
        public static void main(String args[]) {
            int a, b, c, d, p, k;
            p = 65;
            k = 5;
            System.out.println("The pattern:");
            for (a = 1; a <= 5; a++) {
                for (b = 1; b <= a; b++)
                    System.out.print(a + " ");
                for (c = k; c > 1; c--) {
                    System.out.print((char) p + " ");
                }
                k = k - 1;
                p = p + 1;
                System.out.println();
            }
        }
    }

    class factorial {
        public static void main(String args[]) {
            Scanner in = new Scanner(System.in);
            int n, prod = 1;
            System.out.println("Enter number");
            n = in.nextInt();
            for (int i = 1; i <= n; i++) {
                prod = prod * i;
            }
            System.out.println("Factorial of " + n + " = " + prod);
        }
    }

    class model_question {
        public static void main(String args[]) {
            Scanner in = new Scanner(System.in);
            for (int i = 5; i > 0; i--) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(i + " ");
                }
                System.out.println();
            }
        }
    }

    class random {
        public static void main(String args[]) {
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 2; j++) {
                    int number = (int) (Math.random() * 10);
                    System.out.println(number);
                }
            }
        }
    }

    class pattern_choice {
        public static void main(String args[]) {
            Scanner in = new Scanner(System.in);
            System.out.println("Enter :");
            System.out.println("1 - Solid rectangle");
            System.out.println("2 - Right angle triangle");
            System.out.println("3 - Inverted Right angle triangle");
            int choice = in.nextInt();
            int rows, columns, j, i;
            switch (choice) {
                case 1:
                    System.out.println("Enter number of rows");
                    rows = in.nextInt();
                    System.out.println("Enter number of columns");
                    columns = in.nextInt();
                    for (i = 1; i <= rows; i++) {
                        for (j = 1; j <= columns; j++) {
                            System.out.print(" * ");
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    System.out.println("Enter number of rows");
                    rows = in.nextInt();
                    for (i = 1; i <= rows; i++) {
                        for (j = 1; j <= i; j++) {
                            System.out.print(" * ");
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    System.out.println("Enter number of rows");
                    rows = in.nextInt();
                    for (i = rows; i >= 1; i--) {
                        for (j = 1; j <= i; j++) {
                            System.out.print(" * ");
                        }
                        System.out.println();
                    }
                    break;
                default:
                    System.out.println("Invalid input");

            }
        }
    }

    class oddeven_methods {
        private static String oddeven(int num) {
            String ans;
            if (num % 2 == 0) {
                ans = "Even number";
            } else {
                ans = "Odd number";
            }
            return ans;
        }

        public static void main(String args[]) {
            Scanner in = new Scanner(System.in);
            String ans;
            int num;
            System.out.println("Enter number");
            num = in.nextInt();
            ans = oddeven_methods.oddeven(num);
            System.out.println(ans);

        }
    }

    class AlternateLetters {
        public static void main(String args[]) {
            for (char ch = 'A'; ch <= 'Z'; ch = (char) (ch + 2)) {
                System.out.println(ch);
            }
        }
    }

    /**
     * Define a class called with the following specifications:
     * Class name: Eshop
     * Member variables:
     * String name: name of the item purchased
     * double price: Price of the item purchased
     * Member methods:
     * void accept(): Accept the name and the price of the item using the methods of
     * Scanner
     * class.
     * void calculate(): To calculate the net amount to be paid by a customer, based
     * on the
     * following criteria:
     * Price Discount
     * 1000 – 25000 5.0%
     * 25001 – 57000 7.5 %
     * 57001 – 100000 10.0%
     * More than 100000 15.0 %
     * void display(): To display the name of the item and the net amount to be
     * paid.
     * Write the main method to create an object and call the above methods.
     **/

    class Eshop {
        String name;
        double price, amt;

        void accept() {
            Scanner in = new Scanner(System.in);
            System.out.print("Enter name of item: ");
            name = in.nextLine();
            System.out.print("Enter price of item: ");
            price = in.nextDouble();
        }

        void calculate() {
            if (price >= 1000 && price <= 25000)
                amt = price - ((price) * 5.0 / 100.0);
            else if (price >= 25001 && price <= 57000)
                amt = price - ((price) * 7.5 / 100.0);
            else if (price >= 57001 && price <= 100000)
                amt = price - ((price) * 10.0 / 100.0);
            else if (price > 100000)
                amt = price = ((price) * 15.0 / 100.0);
        }

        void display() {
            System.out.println("Name of item: " + name);
            System.out.println("Net amount to be paid: " + amt);
        }

        public static void main(String args[]) {
            Eshop obj = new Eshop();
            obj.accept();
            obj.calculate();
            obj.display();
        }
    }

    class Mobike {
        int days, charge;
        long phno, bno;
        String name;

        void input() {
            Scanner in = new Scanner(System.in);
            System.out.print("Enter Customer Name: ");
            name = in.nextLine();
            System.out.print("Enter Customer Phone Number: ");
            phno = in.nextLong();
            System.out.print("Enter Bike Number: ");
            bno = in.nextLong();
            System.out.print("Enter Number of Days: ");
            days = in.nextInt();
        }

        void compute() {
            if (days <= 5)
                charge = days * 500;
            else if (days <= 10)
                charge = (5 * 500) + ((days - 5) * 400);
            else
                charge = (5 * 500) + (5 * 400) + ((days - 10) * 200);
        }

        void display() {
            System.out.println("Bike No.\tPhone No.\tDays\tCharge");
            System.out.println(bno + "\t" + phno + "\t" + days + "\t" + charge);
        }

        public static void main(String args[]) {
            Mobike obj = new Mobike();
            obj.input();
            obj.compute();
            obj.display();
        }
    }

    class Pattern1 {
        public static void main(String args[]) {
            for (int i = 49; i <= 57; i++) {
                for (int j = 49; j <= i; j++) {
                    if (i % 2 == 0)
                        System.out.print((char) (j + 16));
                    else if (i % 3 == 0)
                        System.out.print((char) (j + 48));
                    else
                        System.out.print((char) j);
                }
                System.out.println();
            }
        }
    }

    class Pattern2 {
        public static void main(String args[]) {
            for (int i = 86; i <= 90; i++) {
                for (int j = 90; j >= i; j--) {
                    System.out.print((char) j);
                }
                System.out.println();
            }
        }
    }

    class Primee {
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
}

class odds_even {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int num, octr = 0;
        int ectr = 0;
        for (int i = 1; i <= 20; i++) {
            System.out.println("Enter Number");
            num = in.nextInt();
            if (num % 2 == 0)
                octr++;
            else
                ectr++;
            continue;
        }
        System.out.println("No of odd numbers: " + octr);
        System.out.println("No of even numbers: " + ectr);
    }
}

// Okay, so im gonna try to make a program that will identify how many lettes
// are vowels and consonant

class isvowel {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter word");
        String string = in.nextLine();
        char ch;
        int vctr = 0;
        int cctr = 0;
        int bctr = 0;
        int spctr = 0;

        for (int a = 0; a < string.length(); a++) {
            ch = string.charAt(a);
            ch = Character.toLowerCase(ch);

            if (Character.isLetter(ch)) {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                    vctr++;
                if (Character.isWhitespace(ch))
                    bctr++;
                else
                    cctr++;
            } else if (Character.isWhitespace(ch))
                bctr++;
            else
                spctr++;
        }
        System.out.println("Number of vowels in your input = " + vctr);
        System.out.println("Number of consonant in your input = " + cctr);
        System.out.println("Number of special character in your input = " + spctr);
        System.out.println("Number of blank spaced in your input = " + bctr);

    }
}

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

class Student {
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

    public static void main(String args[]) {

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

class question3_2023 {
    void print() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 4; j++)
                System.out.print(i + " ");
            System.out.println();
        }
    }

    void print(int n) {
        int osum = 0;
        int esum = 0;
        int digit;
        do {
            digit = n % 10;
            n = n / 10;
            if (digit % 2 == 0)
                esum += digit;
            else
                osum += digit;
        } while (n > 0);
        if (osum == esum)
            System.out.println("Is a Lead Number");
        else
            System.out.println("Is not a lead number");

    }

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        question3_2023 obj = new question3_2023();
        obj.print();
        System.out.print("Enter number : ");
        int number = in.nextInt();
        obj.print(number);
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

class Java {
    int one(int a, int b) {
        int c = a + b;
        return c;
    }

    double one(double d, double e) {
        double f = d * e;
        return f;
    }

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        Java obj = new Java();
        System.out.println("Enter the value of y, z, p, and q");
        int y = in.nextInt();
        int z = in.nextInt();
        double p = in.nextDouble();
        double q = in.nextDouble();
        int c = obj.one(y, z);
        double f = obj.one(p, q);
    }
}

class DuckNumber {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = in.nextInt();
        int digit, ctr = 0;
        int ans = 0;
        {
            do {
                digit = num % 10;
                num = num / 10;
                ctr++;
                if (digit == 0)
                    ans = 1;
            } while (num > 0);
            if (ctr == 3) {
                if (ans == 1)
                    System.out.println("Is a duck number");
                else
                    System.out.println("Is not a duck number");
            } else
                System.out.println("Invalid");
        }
    }
}

class function_overloading {

    void display() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++)
                System.out.print(j);
            System.out.println();
        }
    }

    void display(int n) {
        int digit;
        double sqrt;
        do {
            digit = n % 10;
            n = n / 10;
            sqrt = Math.sqrt(digit);
            System.out.println(sqrt);
        } while (n > 0);

    }

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        function_overloading obj = new function_overloading();
        obj.display();
        System.out.print("Enter Number: ");
        int number = in.nextInt();
        obj.display(number);

    }
}

class pattern_rect {
    public static void main(String args[]) {
        for (int i = 1; i <= 9; i++) {
            System.out.print(i);
            if (i % 3 == 0) {
                System.out.println();
            }
        }
    }
}

// this program consists of all major patterns for you to choose from
class desired_pattern {

    // 1
    // 22
    // 333
    // 4444
    // 55555
    void pattern1(int rows) {
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++)
                System.out.print(i);
            System.out.println();
        }
    }

    // 1
    // 12
    // 123
    // 1234
    // 12345
    void pattern2(int rows) {
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++)
                System.out.print(j);
            System.out.println();
        }
    }

    // 11111
    // 2222
    // 333
    // 44
    // 5
    void pattern3(int rows) {
        for (int i = 1; i <= rows; i++) {
            for (int j = rows; j >= i; j--)
                System.out.print(i);
            System.out.println();
        }
    }

    // 54321
    // 5432
    // 543
    // 54
    // 5
    void pattern4(int rows) {
        for (int i = 1; i <= rows; i++) {
            for (int j = rows; j >= i; j--)
                System.out.print(j);
            System.out.println();
        }
    }

    // 55555
    // 4444
    // 333
    // 22
    // 1
    void pattern5(int rows) {
        for (int i = rows; i >= 1; i--) {
            for (int j = 1; j <= i; j++)
                System.out.print(i);
            System.out.println();
        }
    }

    // 1 1 1 1 1 1 1 1 1 1
    // 2 2 2 2 2 2 2 2 2 2
    // 3 3 3 3 3 3 3 3 3 3
    // 4 4 4 4 4 4 4 4 4 4
    // 5 5 5 5 5 5 5 5 5 5
    void pattern6(int rows, int columns) {
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= columns; j++)
                System.out.print(" " + i + " ");
            System.out.println();
        }
    }

    // 1 2 3 4 5 6 7 8 9 10
    // 1 2 3 4 5 6 7 8 9 10
    // 1 2 3 4 5 6 7 8 9 10
    // 1 2 3 4 5 6 7 8 9 10
    // 1 2 3 4 5 6 7 8 9 10
    void pattern7(int rows, int columns) {
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= columns; j++)
                System.out.print(" " + j + " ");
            System.out.println();
        }
    }

    // 1
    // 333
    // 55555
    // 7777777
    void pattern8(int rows) {
        for (int i = 0; i <= rows; i++) {
            i++;
            for (int j = 1; j <= i; j++)
                System.out.print(i);
            System.out.println();
        }
    }

    // 1
    // 123
    // 12345
    // 1234567
    void pattern9(int rows) {
        for (int i = 0; i <= rows; i++) {
            i++;
            for (int j = 1; j <= i; j++)
                System.out.print(j);
            System.out.println();
        }
    }

    // A
    // BB
    // CCC
    // DDDD
    // EEEEE
    void pattern10(char r) {
        int rows = (int) r;
        for (int i = 65; i <= rows; i++) {
            for (int j = 65; j <= i; j++)
                System.out.print((char) i);
            System.out.println();
        }
    }

    // A
    // AB
    // ABC
    // ABCD
    // ABCDE
    void pattern11(char r) {
        int rows = (int) r;
        for (int i = 65; i <= rows; i++) {
            for (int j = 65; j <= i; j++)
                System.out.print((char) j);
            System.out.println();
        }
    }

    // a
    // bb
    // ccc
    // dddd
    // eeeee
    void pattern12(char r) {
        int rows = (int) r;
        for (int i = 97; i <= rows; i++) {
            for (int j = 97; j <= i; j++)
                System.out.print((char) i);
            System.out.println();
        }
    }

    // a
    // ab
    // abc
    // abcd
    // abcde
    void pattern13(char r) {
        int rows = (int) r;
        for (int i = 97; i <= rows; i++) {
            for (int j = 97; j <= i; j++)
                System.out.print((char) j);
            System.out.println();
        }
    }

    // 12345
    // 1234
    // 123
    // 12
    // 1
    void pattern14(int rows) {
        for (int i = rows; i >= 1; i--) {
            for (int j = 1; j <= i; j++)
                System.out.print(j);
            System.out.println();
        }
    }

    // 13579
    // 1357
    // 135
    // 13
    // 1
    void pattern15(int rows) {
        for (int i = rows; i >= 1; i--) {
            i--;
            for (int j = 0; j <= i; j++) {
                j++;
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        desired_pattern obj = new desired_pattern();
        int rows;
        int columns;
        char r;

        System.out.println("Select desired type of pattern:-");

        System.out.println("a]");
        System.out.println("1\r\n" + //
                "22\r\n" + //
                "333\r\n" + //
                "4444\r\n" + //
                "55555");

        System.out.println("");

        System.out.println("b]");
        System.out.println("1\r\n" + //
                "12\r\n" + //
                "123\r\n" + //
                "1234\r\n" + //
                "12345");

        System.out.println("");

        System.out.println("c]");
        System.out.println("11111\r\n" + //
                "2222\r\n" + //
                "333\r\n" + //
                "44\r\n" + //
                "5");

        System.out.println("");

        System.out.println("d]");
        System.out.println("54321\r\n" + //
                "5432\r\n" + //
                "543\r\n" + //
                "54\r\n" + //
                "5");

        System.out.println("");

        System.out.println("e]");
        System.out.println("55555\r\n" + //
                "4444\r\n" + //
                "333\r\n" + //
                "22\r\n" + //
                "1");

        System.out.println("");

        System.out.println("f]");
        System.out.println(" 1  1  1  1  1  1  1  1  1  1 \r\n" + //
                " 2  2  2  2  2  2  2  2  2  2 \r\n" + //
                " 3  3  3  3  3  3  3  3  3  3\r\n" + //
                " 4  4  4  4  4  4  4  4  4  4\r\n" + //
                " 5  5  5  5  5  5  5  5  5  5");

        System.out.println("");

        System.out.println("g]");
        System.out.println(" 1  2  3  4  5  6  7  8  9  10 \r\n" + //
                " 1  2  3  4  5  6  7  8  9  10 \r\n" + //
                " 1  2  3  4  5  6  7  8  9  10\r\n" + //
                " 1  2  3  4  5  6  7  8  9  10\r\n" + //
                " 1  2  3  4  5  6  7  8  9  10");

        System.out.println("");

        System.out.println("h]");
        System.out.println("1\r\n" + //
                "333\r\n" + //
                "55555\r\n" + //
                "7777777");

        System.out.println("");

        System.out.println("i]");
        System.out.println("1\r\n" + //
                "123\r\n" + //
                "12345\r\n" + //
                "1234567");

        System.out.println("");

        System.out.println("j]");
        System.out.println("A\r\n" + //
                "BB\r\n" + //
                "CCC\r\n" + //
                "DDDD\r\n" + //
                "EEEEE");

        System.out.println("");

        System.out.println("k]");
        System.out.println("A    \r\n" + //
                "AB   \r\n" + //
                "ABC  \r\n" + //
                "ABCD \r\n" + //
                "ABCDE");

        System.out.println("");

        System.out.println("l]");
        System.out.println("a    \r\n" + //
                "bb   \r\n" + //
                "ccc  \r\n" + //
                "dddd \r\n" + //
                "eeeee");

        System.out.println("");

        System.out.println("m]");
        System.out.println("a    \r\n" + //
                "ab   \r\n" + //
                "abc  \r\n" + //
                "abcd \r\n" + //
                "abcde");

        System.out.println("");

        System.out.println("n]");
        System.out.println("12345\r\n" + //
                "1234\r\n" + //
                "123\r\n" + //
                "12\r\n" + //
                "1");

        System.out.println("");

        System.out.println("o]");
        System.out.println("13579\r\n" + //
                "1357\r\n" + //
                "135\r\n" + //
                "13\r\n" + //
                "1");

        System.out.println("");
        System.out.print("Which pattern(only enter letter):- ");
        char choice = in.next().charAt(0);
        switch (choice) {
            case 'a':
                System.out.print("Enter number: ");
                rows = in.nextInt();
                obj.pattern1(rows);
                break;

            case 'b':
                System.out.print("Enter number: ");
                rows = in.nextInt();
                obj.pattern2(rows);
                break;

            case 'c':
                System.out.print("Enter number: ");
                rows = in.nextInt();
                obj.pattern3(rows);
                break;

            case 'd':
                System.out.print("Enter number: ");
                rows = in.nextInt();
                obj.pattern4(rows);
                break;

            case 'e':
                System.out.print("Enter number: ");
                rows = in.nextInt();
                obj.pattern5(rows);
                break;

            case 'f':
                System.out.print("Enter rows: ");
                rows = in.nextInt();
                System.out.print("Enter columns: ");
                columns = in.nextInt();
                obj.pattern6(rows, columns);
                break;

            case 'g':
                System.out.print("Enter rows: ");
                rows = in.nextInt();
                System.out.print("Enter columns: ");
                columns = in.nextInt();
                obj.pattern7(rows, columns);
                break;

            case 'h':
                System.out.print("Enter number: ");
                rows = in.nextInt();
                obj.pattern8(rows);
                break;

            case 'i':
                System.out.print("Enter number: ");
                rows = in.nextInt();
                obj.pattern9(rows);
                break;

            case 'j':
                System.out.print("Enter letter: ");
                r = in.next().charAt(0);
                obj.pattern10(r);
                break;

            case 'k':
                System.out.print("Enter letter: ");
                r = in.next().charAt(0);
                obj.pattern11(r);
                break;

            case 'l':
                System.out.print("Enter letter: ");
                r = in.next().charAt(0);
                obj.pattern12(r);
                break;

            case 'm':
                System.out.print("Enter letter: ");
                r = in.next().charAt(0);
                obj.pattern13(r);
                break;

            case 'n':
                System.out.print("Enter number: ");
                rows = in.nextInt();
                obj.pattern14(rows);
                break;

            case 'o':
                System.out.print("Enter number: ");
                rows = in.nextInt();
                obj.pattern15(rows);
                break;

            default:
                System.out.println("Invalid Input");
                break;
        }
    }
}