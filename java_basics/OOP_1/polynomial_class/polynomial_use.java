import java.util.Scanner;

public class polynomial_use {

    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
     Polynomial p1 = new Polynomial();
     Polynomial p2 = new Polynomial(); 
     
     p1.setCoefficient(2, 3);
     p1.setCoefficient(1, 5);

    p2.setCoefficient(2, 10);
    p2.setCoefficient(1, 5);
    
    
    p1.print();
    p2.print();

    int Case =sc.nextInt();
    boolean isValid = false;
    switch (Case) {
      case 1: p1.add(p2); isValid=true;  
        break;

      case 2: p1.multiply(p2); isValid= true;
       break;

       case 3:p1.sub(p2);
       break;

      default: System.out.println("Enter valid case :");
        break;
    }
     
  if(isValid)
  {
    p1.print();
  }

    }
}
