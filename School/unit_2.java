import java.util.*;
class is_it_a_triangle
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        double a1,a2,a3,sum;
        System.out.println("Enter first side");
        a1 = in.nextDouble();
        System.out.println("Enter second side");
        a2 = in.nextDouble();
        System.out.println("Enter third side");
        a3 = in.nextDouble();
        sum = a1+a2+a3;
        if(sum==180 && a1>0 && a2>0 && a3>0)
        {
            System.out.println("Triangle is possible");
            if(a1==90||a2==90||a3==90)
            {
                System.out.println("It is a Right angle triangle");
            }
            else if(a1<90 && a2<90 && a3<90)
            {
                System.out.println("It is an Acute angle triangle");
            }
            else 
            {
                System.out.println("It is an Obtuse angle triangle");
            }
        }
        else 
        {
    System.out.println("Triangle not possible");
        }
    }
}
class ct
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int days;
        double depamt,amt;
        System.out.println("Enter days");
        days = in.nextInt();
        System.out.println("You entered "+days+" days");
        System.out.println("Enter Deposit amount");
        depamt = in.nextDouble();
        System.out.println("Deposit amount = "+depamt);
        if(days>0)
        {
            if(days<=180)
            {
                amt = (depamt)+((4.5)/(100.0)); 
                System.out.println(amt);

            }
        }



    }
}