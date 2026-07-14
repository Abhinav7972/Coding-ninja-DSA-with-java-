import java.util.Scanner;

public class Conditionals {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter number ");
    int num = sc.nextInt();

    boolean Evencondition = num%2==0;

    if(Evencondition)
    {
        System.out.println("number is even");
    }
    else
    {
        System.out.println("number is odd");
    }

    sc.close();
}
}
