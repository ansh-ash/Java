import java.util.*;

public class question5 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter string:-");
        String str = in.nextLine();
        str = str.toUpperCase();
        System.out.println("String in uppercase:- " + str);
        int ctr = 0;
        char c;
        for (int i = 0; i < str.length(); i++) {
            c = str.charAt(i);
            if(c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
            ctr++;
        }
        System.out.println("Number of vowels:- "+ctr);
    }
}
