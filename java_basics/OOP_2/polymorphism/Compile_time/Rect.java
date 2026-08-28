//package java_basics.OOP_2.polymorphism;

public class Rect extends Shape {
int length;
int breadth;

Rect()
{
    System.out.println("Default constructor of rectangle :");
}

Rect(int l,int b)
{
length =l;
breadth = b;
}

public void info()
{
System.out.println("Area  is :" + length*breadth);
}

public void info(String type)
{
System.out.println("Area of  " + type + " is " + length*breadth);
}

}
