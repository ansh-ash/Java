/*Question 7
  Define a class to accept values into an array of double data type of size 20. Accept a double 
  value from user and search in the array using linear search method. If value is found 
  display message “Found” with its position where it is present in the array. Otherwise 
  display message “not found”.**/

import java.util.*;

public class Question7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a[] = new double[20];
        System.out.println("Enter 20 double data type values:-");
        for (int i = 0; i < a.length; i++)
            a[i] = in.nextDouble();
        int pos=-1;
        double n;
        System.out.println("Enter number to be found:-");
        n = in.nextDouble();
        for(int j = 0; j<a.length; j++)
        {
            if(a[j]==n)
                pos=j;
        }
        if(pos==-1)
            System.out.println("Not found");
        else
            System.out.println("Found at "+(pos+1)+"th position and "+(pos)+" index");
    }
}