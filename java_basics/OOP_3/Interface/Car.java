//package java_basics.OOP_3.Interface;

public class Car extends Vehicle implements Vehicle_interface,Car_interface{
   @Override
   public Boolean Ismotorize() {
       // TODO Auto-generated method stub
       return  true;
   }

   @Override
   public String getCompany() {
       // TODO Auto-generated method stub
       return  "Audi";
   } 

   @Override
   public int numGears() {
       // TODO Auto-generated method stub
       return 6;
   } 


}
