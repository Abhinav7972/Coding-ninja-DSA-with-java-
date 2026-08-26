

public class Vehicle_use {

 public static void main(String[] args) {
   Vehicle v = new Vehicle(); 
   v.color = "red";
   v.print();

   Car c1 = new Car();

   c1.color = "black";
   c1.maxpeed = "600 km/h";

   c1.print();


   Bicycle b1 = new Bicycle();
   b1.color = "purple";
   b1.maxpeed = "30 km/h";

   b1.print();
 }
}
