
public class Vehicle {
    String maxpeed = "30 km/h";
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
