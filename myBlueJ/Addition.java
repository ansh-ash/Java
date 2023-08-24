import java.util.*;
import Package1.Sum;
public class Addition
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        double sum,x,y;
        System.out.println("Enter numbers");
        x = in.nextDouble();
        y = in.nextDouble();
        Sum ob = new Sum();
        ob.add(x,y);
    }
}