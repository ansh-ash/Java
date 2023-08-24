import java.util.Scanner;
/**
 Define a class called with the following specifications:
 Class name: Eshop
 Member variables:
 String name: name of the item purchased
 double price: Price of the item purchased
 Member methods:
 void accept(): Accept the name and the  price  of the item using the methods of Scanner
 class.
 void calculate(): To calculate the net amount to be paid by a customer, based on the
 following criteria:
 Price                Discount
 1000 – 25000           5.0%
 25001 – 57000         7.5 %
 57001 – 100000        10.0%
 More than 100000      15.0 %
 void display():  To display the  name of the item and the net amount to be paid.
 Write the main method to create an object and call the above methods.
 **/
public class Eshop {
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

    void display()
    {
        System.out.println("Name of item: " + name);
        System.out.println("Net amount to be paid: " + amt);
    }
    public static void main(String args[])
    {
        Eshop ob = new Eshop();
        ob.accept();
        ob.calculate();
        ob.display();
    }
}

