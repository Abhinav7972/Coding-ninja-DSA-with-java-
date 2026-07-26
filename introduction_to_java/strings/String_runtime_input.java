import java.util.Scanner;

public class String_runtime_input {
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); 
    
    //nextline
    //String str = sc.nextLine(); // print whole input after space until you press enter 

    //next
    String str = sc.next(); //print only input till space
    System.out.print("str :" +str);
    String str2 = sc.next();
    System.out.print("str2 :" +str2);
    String str3 = sc.nextLine();
    System.out.print("str 3 :" + str3);
 }
}
