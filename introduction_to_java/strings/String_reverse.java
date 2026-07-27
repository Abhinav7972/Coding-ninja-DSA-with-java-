import java.util.Scanner;

public class String_reverse {

public static void reverseString(String str)
{
 String revString = "";

//  for(int i=str.length()-1;i>=0;i--)
//  {
//    revString = revString + str.charAt(i);
//  }

 for(int i=0;i<str.length();i++)
 {
   revString = str.charAt(i) + revString;
 }

 System.out.println("String reverse are :" +revString);
}

public static void main(String[] args) {
Scanner sc = new Scanner(System.in); 

System.out.println("Enter string :");
String str = sc.nextLine(); 
sc.close();
reverseString(str);

}
}
