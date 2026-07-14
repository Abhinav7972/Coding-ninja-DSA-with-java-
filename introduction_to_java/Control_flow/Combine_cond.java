import java.util.Scanner;

public class Combine_cond {
    public static void main(String[] args) {
        Scanner s = new  Scanner(System.in);

        int marks = s.nextInt();
        
        
        if(marks>=35 && marks <70)
        {
          System.out.println("passed");
        }
        else if(marks>=70 && marks<80)
        {
            System.out.println("B");
        }
        else if(marks>=80 && marks<90)
        {
            System.out.println("A");
        }
        else if(marks>=90)
        {
          System.out.println("A+");
        }
        else 
        {
            System.out.println("failed");
        }

      s.close();
    }
}
