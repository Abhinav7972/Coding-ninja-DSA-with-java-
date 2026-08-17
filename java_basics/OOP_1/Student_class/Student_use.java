
public class Student_use {

public static void main(String[] args) {
Student  s1 = new  Student(); 
Student s2 = new  Student();
s1.name = "abhinav";
s1.roll = "121";
s2.roll = "101";

s2.name = "test";
System.out.println(s1);
System.out.println(s2);
System.out.println(s1.name + " "+s1.roll);
System.out.println(s2.name + " " + s2.roll);

}
}
