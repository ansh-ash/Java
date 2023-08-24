import java.util.*;
//this program calculates the area widely used polygons(triangles and quadrilaterals)
class area_calculator
{
    public static void main(String args[])
{
    Scanner in = new Scanner(System.in);
    int choice;
    double area;
    double base;
    double height;
    double side;
    double a;
    double b;
    double c;
    double s;
    System.out.println("1 - Area of right angle triangle");
    System.out.println("2 - Area of equilateral triangle");
    System.out.println("3 - Area of isosceles triangle");
    System.out.println("4 - Area of scalene triangle");
    System.out.println("5 - Area of parallelogram");
    System.out.println("--------------------------------------------");
    System.out.println("Select your choice");
    choice = in.nextInt();
    System.out.println("--------------------------------------------");
    switch(choice)
    {
        //1.Right angle triangle
        case 1:
        System.out.println("You chose area of right angle triangle");
        System.out.println("Enter the base of the triangle in cm");
        base = in.nextDouble();
        System.out.println("Enter the height of the triangle in cm");
        height = in.nextDouble();
        area = (1.0/2.0)*base*height;
        System.out.println("The area of the right angle triangle is "+area+"cm2");
        break;
        //2.Equilateral triangle
        case 2:
        System.out.println("You chose area of equilateral triangle");
        System.out.println("Enter the side of the equilateral triangle in cm");
        side = in.nextDouble();
        area = (Math.sqrt(3)/4.0)*(side*side);
        System.out.println("The area of the equilateral triangle is "+area+"cm2");
        break;
        //3.Isosceles triangle
        case 3:
        System.out.println("You chose area of isosceles triangle");
        System.out.println("Enter side'a' in cm");
        a = in.nextDouble();
        System.out.println("Enter side'b' in cm");
        b = in.nextDouble();
        area = ((1.0/4.0)*b)*(Math.sqrt((4*a*a)-(b*b)));
        System.out.println("The area of the isosceles triangle is "+area+"cm2");
        break;
        //4.Scalene triangle
        case 4:
        System.out.println("You chose area of scalene triangle");
        System.out.println("Enter the three sides of the scalene triangle in cm");
        a = in.nextDouble();
        b = in.nextDouble();
        c = in.nextDouble();
        s = (a+b+c)/2.0;
        area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println("The area of the scalene triangle is "+area+"cm2");
        break;
        //5.Parallelogram
        case 5:
        System.out.println("You chose area of parallelogram");
        System.out.println("Enter the height of the parallelogram in cm");
        height = in.nextDouble();
        System.out.println("Enter the base of the parallelogram in cm");
        base = in.nextDouble();
        area = height*base;
        System.out.println("The area of the parallelogram is "+area+"cm2");
        break;
        default:
        System.out.println("Invalid Input");
    }    
}
}       