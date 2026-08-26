
public class Vehicle {
    String maxpeed;
    private String color;
     
    public void setColor(String color)
    {
     this.color = color;
    }

    public String getColor()
    {
        return color;
    }

    public void print()
    {
        System.out.println("Vehicle color is " + color + " maxpeed is " + maxpeed);
    }
}
