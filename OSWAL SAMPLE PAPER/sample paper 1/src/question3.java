import java.util.*;

class BoxOffice {
    String title;
    float revenue;
    String star;

    void accept() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the title for the movie:-");
        title = in.nextLine();
        System.out.println("Enter the revenue earned");
        revenue = in.nextFloat();
    }

    void compute() {
        if (revenue < 100000)
            star = "*";
        else if (revenue > 100000 && revenue < 500000)
            star = "**";
        else if (revenue > 500000 && revenue <= 1500000)
            star = "***";
        else if (revenue > 1500000)
            star = "****";
    }

    void display() {
        System.out.println("Title of the Movie" + "\t" + "Revenue Earned" + "\t" + "Star Awarded");
        System.out.println(title + "\t" + revenue + "\t" + star);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BoxOffice ob = new BoxOffice();
        ob.accept();
        ob.compute();
        ob.display();
    }
}
