import java.util.Scanner;

public class Shape_use {

public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);

 int num = sc.nextInt();
 Shape s;
 if(num==1)
 {
  s = new Circle();
 }
 else if(num==2)
 {
  s = new  Rect();
 }
 else 
 {
    s = new Shape();
 }
 

 s.Draw();
}
}
