import java.util.*;
public class Bank
{
    String name;
    int choice;
    double amt, depamt, withamt;
    long accno, mobno;
    Bank()
    {
        name = "";
        amt = 10000;
        depamt = 0.0;
        withamt = 0.0;
        accno = 0;
        choice = 0;
        mobno = 0;
    }
    void input()
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter name: ");
        name = in.nextLine();
        System.out.print("Enter Mobile Number: ");
        mobno = in.nextLong();
        System.out.print("Enter Account Number: ");
        accno = in.nextLong();
        System.out.println("Balance: "+amt);
        System.out.println("");
        System.out.println("");
        System.out.print("Press 1 to withdraw or Press 2 to deposit : ");
        choice = in.nextInt();
    }
    void calculate()
    {
        Scanner in = new Scanner(System.in);
        if(choice==1)
        {
            if(amt>0)
            {   
                System.out.print("Enter amount to withdraw: ");
                depamt = in.nextDouble();
                amt = amt - depamt;
            }
            if(amt<0)
            {
                System.out.println("Not Enough Balance");
                amt = 10000;
            }
        }
        else if(choice==2)
        {
            System.out.print("Enter amount to deposit: ");
            withamt = in.nextDouble();
            amt = withamt+amt;
        }
        else
        {
            System.out.println("Wrong choice");
        }
    }
    void display()
    {
        System.out.println("");
        System.out.println("");
        System.out.println("Name : "+name);
        System.out.println("Enter Mobile Number: "+mobno);
        System.out.println("Account Number: "+accno);
        System.out.println("Balance :"+amt);
    }
    public static void main(String args[])
    {
        Bank ob = new Bank();
        ob.input();
        ob.calculate();
        ob.display();
    }
}