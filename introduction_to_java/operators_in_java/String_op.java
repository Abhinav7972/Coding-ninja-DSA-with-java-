public class String_op {
public static void main(String[] args) {
    String firstName = "alex";
    String lastName = "jhon";

    String fullName = firstName + " "+lastName;
    int age = 10;

   char ch1 = 'a';
   char ch2 = 'b';
   char nch = (char) (ch1 + 1);

   System.out.println(ch1 + ch2);
   System.out.println(nch);


    System.out.println(fullName+" is "+age+"  years old");
}
}
