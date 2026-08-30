public class Vehicle_gen implements Print_interface {
int maxSpeed;
String company;

Vehicle_gen(int maxSpeed,String company)
{
  this.maxSpeed = maxSpeed;
  this.company = company;
}

public void print()
{
 System.out.println(maxSpeed + " " + company );
}


}
