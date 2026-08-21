
public class fraction_use {


 public static void main(String[] args) {
   fraction f1 = new fraction(4, 6);
   fraction f2 = new fraction(10, 8);
   fraction f3 = new fraction(2, 4);
   fraction f4 = new fraction(3, 2);
   //f1.setNumerator(5);
   //f1.setDenominator(2);
   //f1.print();
   //f1.increament();
   f1.print();
   f1.add(f2);
   f1.print();

   
   fraction f8 = fraction.add(f3, f4);
   f8.print();
 }
}
