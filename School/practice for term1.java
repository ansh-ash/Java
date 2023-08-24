import java.util.*;
class pg87_prog3
{
    public static void main(String args[])
    {
        double a;
        double p;
        double s;
        double d;
        s = 25;
        a = s*s;
        p = 4*s;
        d = Math.sqrt(2)*s;
        System.out.println("Perimeter = "+p);
        System.out.println("Area = "+a);
        System.out.println("Diagonal = "+d);
    }
}

class pg110_prog2
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        double basic;
        String name;
        System.out.println("Enter the name of the employee");
        name = in.nextLine();
        System.out.println("Enter the basic salary");
        basic = in.nextDouble();
        double da = 30.0/100.0*basic;
        double hra = 12.5/100.0*basic;
        double pf = 10.0/100.0*basic;
        double gross = basic + da + hra;
        double netpay = gross - pf;
        System.out.println("Employees name :"+name);
        System.out.println("Gross salary :"+gross);
        System.out.println("Net salary :"+netpay);
    }
}

class pg99_prog4
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = in.nextInt();
        int h,t,u,d;
        h = num/100;
        d = num/10;
        t = d%10;
        u = num%10;
        System.out.println("The digit are: ");
        System.out.println(h);
        System.out.println(t);
        System.out.println(u);
    }
}

class ternary_operator_1
{
    public static void main (String args[])
    {
        Scanner in = new Scanner(System.in);
        double a,b,c,max;
        System.out.println("Enter three numbers to find the highest between ");
        a = in.nextDouble();
        b = in.nextDouble();
        c = in.nextDouble();
        max = (a>b)?((a>c)?a:c):((b>c)?b:c);
        System.out.println(max);

    }
}

class ternary_operator2
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int a,b,c,k;
        System.out.println("Enter");
        a=in.nextInt();
        b=in.nextInt();
        c=in.nextInt();
        k = ((a+b)>c)?15:30;
        System.out.println(k);
        
    }
} 

class simple_pendulum
{
    public static void main(String args[])
    {
        Scanner in  = new Scanner(System.in);
        double l;  //using l to input length
        double g;  //using g to input gravity
        double pi = 22.0/7.0;  //using pi to assign value of pi to it
        double t;  //using t to calculate and print the time
        System.out.println("Enter the length");
        l = in.nextDouble();
        System.out.println("Enter the gravity");
        g = in.nextDouble();
        t = 2*pi*Math.sqrt(l/g);
        System.out.println("Time period of the Simple Pendulum = "+t);
    }
}

    class timeconvert
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the time in seconds");
        long secs = in.nextLong();
        long hrs = secs / 3600;
        secs = secs%3600;
        long mins  =secs/60;
        secs = secs%60;
        System.out.println(hrs+" Hours "+mins+" Minutes "+secs+" Seconds ");

    }    
}

class compound_interest_inputinjava_unsolved_q5
{
    public static void main(String[] args)
     {
        Scanner in = new Scanner(System.in);
        double sum1;  //to take input of sum
        System.out.println("Enter the sum");
        sum1 = in.nextDouble();
        double rate;
        rate = 5;  //to store value of rate
        double time = 1;  //to store value to time
        double interest1;
        System.out.println("Sum taken as"+sum1);
        System.out.println("Rate is "+rate);
        interest1 = (sum1*rate*time)/100.0;
        double sum2;
         sum2 = sum1 + interest1;
         double interest2;
         interest2 = (sum2*rate*time)/100.0;
         double sum3 = sum2 + interest2;
         double interest3 = (sum3*rate*time)/100.0;
         System.out.println("The interest for the 1st year = "+interest1);
         System.out.println("The interest for the 2nd year = "+interest2);
         System.out.println("The interest for the 3rd year = "+interest3);
     }
}