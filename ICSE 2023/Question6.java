/*Question 6
Define a class to accept a String and print the number of digits, alphabets and special 
characters in the string. 
Example: S = “KAPILDEV@83” 
Output: Number of digits – 2 
  Number of Alphabets – 8  
  Number of Special characters – 1 **/

import java.util.*;

public class Question6 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter a string");
    String s = in.nextLine();
    int dcount = 0;
    int acount = 0;
    int scount = 0;
    char c;
    for (int i = 0; i < s.length(); i++) {
      c = s.charAt(i);
      if (Character.isDigit(c) == true)
        dcount++;
      else if (Character.isLetter(c) == true)
        acount++;
      else if (Character.isLetter(c) == false && Character.isDigit(c) == false)
        scount++;
    }
    System.out.println("Number of digits - "+dcount);
    System.out.println("Number of Alpabets - "+acount);
    System.out.println("Number of Special characters - "+scount);
  }
}