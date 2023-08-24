import java.util.Scanner;
import Package1.Alphanum;
public class Alphabet_num
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Alphabet in 'X' format");
        char ch = in.next().charAt(0);
        Alphanum ob = new Alphanum();
        ob.letternum(ch);
    }
}