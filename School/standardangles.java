import java.util.*;
public class standardangles
{
public static void main(String args[])
{
Scanner in = new Scanner(System.in);
int ch,angle;
double a, o, h, sin0, sin30, sin45, sin60, sin90, cos0, cos30, cos45, cos60, cos90, tan0, tan30, tan45, tan60,cosec30, cosec45, cosec60, cosec90,cot30, cot45, cot60, cot90, sec0, sec30, sec45, sec60;
String tan90,cot0, sec90, cosec0;
System.out.println("Enter 1,2,3,4,5,6 for sin, cos, tan, cosec, sec, cot respectively");
ch = in.nextInt();
switch(ch)
{
case 1:
System.out.println("Enter '0' '30' '45 '60 '90' as per your convinince");
angle = in.nextInt();
switch(angle)
{
case 0:
System.out.println("Enter opposite");
o = in.nextDouble();
System.out.println("Enter hypotenuse");
h = in.nextDouble();
sin0 = 0*(o/h);
System.out.println("The value for sin0 is "+sin0);
break;
case 30:
System.out.println("Enter opposite");
o = in.nextDouble();
System.out.println("Enter hypotenuse");
h = in.nextDouble();
sin30 = (1/2)*(o/h);
System.out.println("The value for sin30 is "+sin30);
break;
case 45:
System.out.println("Enter opposite");
o = in.nextDouble();
System.out.println("Enter hypotenuse");
h = in.nextDouble();
sin45 = (1/Math.sqrt(2))*(o/h);
System.out.println("The value for sin45 is "+sin45);
break;
case 60:
System.out.println("Enter opposite");
o = in.nextDouble();
System.out.println("Enter hypotenuse");
h = in.nextDouble();
sin60 = ((Math.sqrt(3))/2)*(o/h);
System.out.println("The value for sin60 is "+sin60);
break;
case 90:
System.out.println("Enter opposite");
o = in.nextDouble();
System.out.println("Enter hypotenuse");
h = in.nextDouble();
sin90 = 1*(o/h);
System.out.println("The value for sin90 is "+sin90);
break;
default:
System.out.println("Invalid Input");
}
case 2:
System.out.println("Enter '0' '30' '45 '60 '90' as per your convinince");
angle = in.nextInt();
switch(angle)
{
case 0:
System.out.println("Enter adjacent");
a = in.nextDouble();
System.out.println("Enter hypotenuse");
h = in.nextDouble();
cos0 = 1*(a/h);
System.out.println("The value for cos0 is "+cos0);
break;
case 30:
System.out.println("Enter adjacent");
a = in.nextDouble();
System.out.println("Enter hypotenuse");
h = in.nextDouble();
cos30 = ((Math.sqrt(3))/2)*(a/h);
System.out.println("The value for cos30 is "+cos30);
break;
case 45:
System.out.println("Enter adjacent");
a = in.nextDouble();
System.out.println("Enter hypotenuse");
h = in.nextDouble();
cos45 = (1/Math.sqrt(2))*(a/h);
System.out.println("The value for cos45 is "+cos45);
break;
case 60:
System.out.println("Enter adjacent");
a = in.nextDouble();
System.out.println("Enter hypotenuse");
h = in.nextDouble();
cos60 = (1/2)*(a/h);
System.out.println("The value for cos60 is "+cos60);
break;
case 90:
System.out.println("Enter adjacent");
a = in.nextDouble();
System.out.println("Enter hypotenuse");
h = in.nextDouble();
cos90 = 0*(a/h);
System.out.println("The value for cos90 is "+cos90);
break;
default:
System.out.println("Invalid Input");
}
case 3:
System.out.println("Enter '0' '30' '45 '60 '90' as per your convinince");
angle = in.nextInt();
switch(angle)
{
case 0:
System.out.println("Enter adjacent");
a = in.nextDouble();
System.out.println("Enter opposite");
o = in.nextDouble();
tan0 = 0*(o/a);
System.out.println("The value for tan0 is "+tan0);
break;
case 30:
System.out.println("Enter adjacent");
a = in.nextDouble();
System.out.println("Enter opposite");
o = in.nextDouble();
tan30 = (1/(Math.sqrt(3)))*(o/a);
System.out.println("The value for tan30 is "+tan30);
break;
case 45:
System.out.println("Enter adjacent");
a = in.nextDouble();
System.out.println("Enter opposite");
o = in.nextDouble();
tan45 = 1*(o/a);
System.out.println("The value for tan45 is "+tan45);
break;
case 60:
System.out.println("Enter adjacent");
a = in.nextDouble();
System.out.println("Enter opposite");
o = in.nextDouble();
tan60 = Math.sqrt(3)*(o/a);
System.out.println("The value for tan60 is "+tan60);
break;
case 90:
System.out.println("Enter adjacent");
a = in.nextDouble();
System.out.println("Enter hypotenuse");
h = in.nextDouble();
tan90 = "not defined(infinity)";
System.out.println("The value for tan90 is "+tan90);
break;

default:
System.out.println("Invalid Input");
}
case 4:
System.out.println("Enter '0' '30' '45 '60 '90' as per your convinince");
angle = in.nextInt();
switch(angle)
{
    case 0:
    System.out.println("Enter value for hypotenuse");
    h = in.nextDouble();
    System.out.println("Enter value for opposite side");
    o = in.nextDouble();
    cosec0 = "not defined(infinity)";
    System.out.println("The value for cosec0 is "+cosec0);
    break;
    case 30:
    System.out.println("Enter value for hypotenuse");
h = in.nextDouble();
System.out.println("Enter value for opposite side");
o = in.nextDouble();
cosec30 = 2*(h/o);
System.out.println("The value for cosec30 is "+cosec30);
break;
case 45:
System.out.println("Enter value for hypotenuse");
h = in.nextDouble();
System.out.println("Enter value for opposite side");
o = in.nextDouble();
cosec45 = Math.sqrt(2)*(h/o);
System.out.println("The value for cosec45 is "+cosec45);
break;
case 60:
System.out.println("Enter value for hypotenuse");
h = in.nextDouble();
System.out.println("Enter value for opposite side");
o = in.nextDouble();
cosec60 = ((2)/(Math.sqrt(3)))*(h/o);
System.out.println("The value for cosec60 is "+cosec60);
break;
case 90:
System.out.println("Enter value for hypotenuse");
h = in.nextDouble();
System.out.println("Enter value for opposite side");
o = in.nextDouble();
cosec90 = 1*(h/o);
System.out.println("The value for cosec90 is "+cosec90);
break;
default:
System.out.println("Invalid Input");
}
case 5:
System.out.println("Chose between '0', '30', '45', '60', '90' as per your convinience");
angle = in.nextInt();
switch(angle)
{
    case 0:
    System.out.println("Enter the value for hypotenuse");
    h = in.nextDouble();
    System.out.println("Enter the value for adjacent side");
    a = in.nextDouble();
    sec0 = 1*(h/a);
    System.out.println("The value for sec0 is "+sec0);
    break;
    case 30:
System.out.println("Enter the value for hypotenuse");
h = in.nextDouble();
System.out.println("Enter the value for adjacent side");
a = in.nextDouble();
sec30 = ((2)/(Math.sqrt(3)))*(h/a);
System.out.println("The value for sec30 is "+sec30);
break;
case 45:
System.out.println("Enter the value for hypotenuse");
h = in.nextDouble();
System.out.println("Enter the value for adjacent side");
a = in.nextDouble();
sec45 = (Math.sqrt(2))*(h/a);
System.out.println("The value for sec45 is "+sec45);
break;
case 60:
System.out.println("Enter the value for hypotenuse");
h = in.nextDouble();
System.out.println("Enter the value for adjacent side");
a = in.nextDouble();
sec60 = 2*(h/a);
System.out.println("The value for sec60 is "+sec60);
break;
case 90:
System.out.println("Enter the value for hypotenuse");
h = in.nextDouble();
System.out.println("Enter the value for adjacent side");
a = in.nextDouble();
sec90 = "not defined(infinity)";
System.out.println("The value for sec90 is "+sec90);
break;
default:
System.out.println("Invalid Input");
}
case 6:
System.out.println("Chose between '0', '30', '45', '60', '90' as per your convinience");
angle = in.nextInt();
switch(angle)
{
    case 0:
    System.out.println("Enter value for adjacent side");
    a = in.nextDouble();
    System.out.println("Enter value for opposite side");
    o = in.nextDouble();
    cot0 = "not defined(infinity)";
    System.out.println("The value for cot0 is "+cot0);
    break;
    case 30:
System.out.println("Enter value for adjacent side");
a = in.nextDouble();
System.out.println("Enter value for opposite side");
o = in.nextDouble();
cot30 = (Math.sqrt(3))*(a/o);
System.out.println("The value for cot30 is "+cot30);
break;
case 45:
System.out.println("Enter value for adjacent side");
a = in.nextDouble();
System.out.println("Enter value for opposite side");
o = in.nextDouble();
cot45 = 1*(a/o);
System.out.println("The value for cot45 is "+cot45);
break;
case 60:
System.out.println("Enter value for adjacent side");
a = in.nextDouble();
System.out.println("Enter value for opposite side");
o = in.nextDouble();
cot60 = ((1)/(Math.sqrt(3)))*(a/o);
System.out.println("The value for cot60 is "+cot60);
break;
case 90:
System.out.println("Enter value for adjacent side");
a = in.nextDouble();
System.out.println("Enter value for opposite side");
o = in.nextDouble();
cot90 = 0*(a/o);
System.out.println("The value for cot90 is "+cot90);
break;
default:
System.out.println("Invalid Input");
}
}
}
}