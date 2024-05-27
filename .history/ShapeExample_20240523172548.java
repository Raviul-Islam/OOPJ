import java.util.*;
interface Shape
{
void input();
void area();
}
class Circle implements Shape
{
int r = 0;
double pi = 3.14, ar = 0;
@Override
public void input()
{ Scanner sc=new Scanner(System.in);
System.out.print("Enter Radius=");
r = sc.nextInt();
sc.close();
}
@Override
public void area()
{
ar = pi * r * r;
System.out.println("Area of circle:"+ar);
}
}
class Rectangle extends Circle
{
int l = 0, b = 0;
double ar;
public void input()
{
super.input();
Scanner sc=new Scanner(System.in);
System.out.print("Enter length=");
l = sc.nextInt();
//Scanner sc=new Scanner(System.in);
System.out.print("Enter breadth=");
b = sc.nextInt();

//l = 6;
//b = 4;
}
public void area()
{
super.area();
ar = l * b;
System.out.println("Area of rectangle:"+ar);
}
}
public class ShapeExample {
    public static void main(String[] args) {
        Rectangle obj = new Rectangle();
        obj.input();
        obj.area();
    }
}