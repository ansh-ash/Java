import java.util.Scanner;
public class Mobike
{
    int days,charge;
    long phno,bno;
    String name;
    void input()
    {
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
    public void compute()
    {
        if (days <= 5)
            charge = days * 500;
        else if (days <= 10)
            charge = (5 * 500) + ((days - 5) * 400);
        else
            charge = (5 * 500) + (5 * 400) + ((days - 10) * 200);
    }

    public void display()
    {
        System.out.println("Bike No.\tPhone No.\tDays\tCharge");
        System.out.println(bno + "\t" + phno + "\t" + days + "\t" + charge);
    }

    public static void main(String args[])
    {
        Mobike obj = new Mobike();
        obj.input();
        obj.compute();
        obj.display();
    }
}