import java.util.Scanner;

class Eshop {
   String name;
   double price;
   double amt;

   void accept() {
      Scanner in = new Scanner(System.in);
      System.out.print("Enter name of item: ");
      name = in.nextLine();
      System.out.print("Enter price of item: ");
      price = in.nextDouble();
   }

   void calculate() {
      if (price >= 1000.0 && price <= 25000.0) {
         amt = price - price * 5.0 / 100.0;
      } else if (price >= 25001.0 && price <= 57000.0) {
         amt = price - price * 7.5 / 100.0;
      } else if (price >= 57001.0 && price <= 100000.0) {
         amt = price - price * 10.0 / 100.0;
      } else if (price > 100000.0) {
         amt = price = price * 15.0 / 100.0;
      }

   }

   void display() {
      System.out.println("Name of item: " + name);
      System.out.println("Net amount to be paid: " + amt);
   }

   public static void main(String[] args) {
      Eshop ob = new Eshop();
      ob.accept();
      ob.calculate();
      ob.display();
   }
}
