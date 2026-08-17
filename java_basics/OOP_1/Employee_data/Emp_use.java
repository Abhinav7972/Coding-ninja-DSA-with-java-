//package java_basics.OOP_1.Employee_data;

public class Emp_use {
public static void main(String[] args) {
   Emp e1 = new Emp("abhinav", 1234);
   Emp e2 = new Emp("brad", 4531);
   Emp e3 = new Emp("los angelas");
   e1.print();
   e2.print();

   System.out.println(e3.city);

}
}
