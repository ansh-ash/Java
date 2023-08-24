import java.util.Scanner;
/*Question 1
Design a class with the following specifications:  
Class name:   Student 
Member variables:  name – name of student 
    age – age of student 
    mks –marks obtained 
    stream – stream allocated 
    (Declare the variables using appropriate data types) 
Member methods:  
void accept()  –  Accept name, age and marks using methods of Scanner class. 
void allocation() –  Allocate the stream as per following criteria: 
     mks stream 
     > = 300 Science and Computer 
     > = 200 and < 300 Commerce and Computer 
     > = 75 and 200 Arts and Animation 
     < 75 Try Again 
void print()  –  Display student name, age, mks and stream allocated. 
Call all the above methods in main method using an object.**/

public class Student
{
    public static void main(String args[])
    {
        Student ob = new Student();
        ob.accept();
        ob.allocation();
        ob.print();
    }
    int age,mks;
    String stream,name;
    void accept() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter name: ");
        name = in.nextLine();
        System.out.print("Enter age: ");
        age = in.nextInt();
        System.out.print("Enter Marks: ");
        mks = in.nextInt();
    }
    void allocation()
    {
        if(mks>=300)
        stream = "Science and Computer";
        else if(mks>=200 && mks<300)
        stream = "Commerce and Computer";
        else if(mks>=75 && mks<200)
        stream = "Arts and Animation";
        else if(mks<75)
        stream = "Try Again";
        else
        System.out.println("Wrong input");
    }
    void print()
    {
        System.out.println("Name : "+name);
        System.out.println("Age : "+age);
        System.out.println("Marks : "+mks);
        System.out.println("Stream Alloted : "+stream);
    }
}