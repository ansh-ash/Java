import java.util.Scanner;

class Eshop {
   String name;
   double price;
   double amt;

   void accept() {
      Scanner in = new Scanner(System.in);
      System.out.print("Enter name of item: ");
      this.name = in.nextLine();
      System.out.print("Enter price of item: ");
      this.price = in.nextDouble();
   }

   void calculate() {
      if (this.price >= 1000.0 && this.price <= 25000.0) {
         this.amt = this.price - this.price * 5.0 / 100.0;
      } else if (this.price >= 25001.0 && this.price <= 57000.0) {
         this.amt = this.price - this.price * 7.5 / 100.0;
      } else if (this.price >= 57001.0 && this.price <= 100000.0) {
         this.amt = this.price - this.price * 10.0 / 100.0;
      } else if (this.price > 100000.0) {
         this.amt = this.price = this.price * 15.0 / 100.0;
      }

   }

   void display() {
      System.out.println("Name of item: " + this.name);
      System.out.println("Net amount to be paid: " + this.amt);
   }

   public static void main(String[] args) {
      Eshop ob = new Eshop();
      ob.accept();
      ob.calculate();
      ob.display();
   }
}
