
public class Car extends Vehicle {
int numdoor;
int maxpeed;

public void carPrint()
{
    System.out.println("car color is " + getColor() + " maxpeed is " + maxpeed);
}

 public void print()
    {
        System.out.println("car color is " + getColor() + " maxpeed is " + maxpeed);
    }
 
 public void printMaxspeed()
 {
    System.out.println(" car Maxspeed is " + maxpeed +  "  vehicle class maxspeed is :  " + super.maxpeed);
 }
 
}
