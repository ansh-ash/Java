/*Question 3
Define a class to overload the function print as follows:  
void print()     to print the following format  
     1     1     1     1   
     2     2     2     2 
     3     3     3     3 
     4     4     4     4 
     5     5     5     5 
void print(int n)   To check whether the number is a lead number. A 
lead number is the one whose sum of even digits are 
equal to sum of odd digits. 
     e.g. 3669 odd digits sum = 3 + 9 = 12 
       even digits sum = 6 + 6 = 12 
     3669 is a lead number.**/
import java.util.Scanner;
public class PrintOverload 
{
    public void print() 
    {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 4; j++) 
            {
                System.out.print(i + "     ");
            }
            System.out.println();
        }
    }
}