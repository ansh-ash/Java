package Package1;

public class Percentage 
{
    double ans;
    public void percent(double a,double b) {
        ans = (b / a) * 100.0;
        System.out.println("Percentage of " + b + " in " + a + " = " + ans+"%");
    }
}
