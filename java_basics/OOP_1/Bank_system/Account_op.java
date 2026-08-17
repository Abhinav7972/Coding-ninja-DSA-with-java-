//package java_basics.OOP_1.Bank_system;

public class Account_op {

 public static void main(String[] args) {
   Account ac1 = new Account(); 

   ac1.setDetails(12,"abhinav"); 
   int ac1No = ac1.getAcc_no();
   String ac1Name = ac1.getName();
   System.out.println(ac1No +" " +ac1Name);
 }
}
