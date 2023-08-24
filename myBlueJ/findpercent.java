import java.util.Scanner;
import Package1.Percentage;

public class findpercent 
{
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number : ");
        double x = in.nextDouble();
        System.out.print("Enter number of which you want to find out the percentage in " + x + " : ");
        double y = in.nextDouble();
        Percentage ob = new Percentage();
        ob.percent(x, y);
    }
}
