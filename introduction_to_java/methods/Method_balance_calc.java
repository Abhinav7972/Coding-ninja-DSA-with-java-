public class Method_balance_calc {
 public static void main(String[] args) {
  printDetails("Abhinav", "AC1234", 100000, 10000, 0);
  System.out.println();
  printDetails("A2", "AB2346", 200000, 40000, 10000);

 }

 public static void printDetails(String name,String acc,double cur_bal,double debit, double credit)
 {
   System.out.println("Name :"+name);
   System.out.println("Account number :"+acc);
   System.out.println(calculateBalance(cur_bal, debit, credit));
 }

public static double calculateBalance(double current_bal,double debit,double credit)
{
 return current_bal+credit-debit;
}
}
