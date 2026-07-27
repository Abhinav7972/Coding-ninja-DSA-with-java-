import java.util.Scanner;

public class String_reverse_word {


    public static String reverse(String str)
    {
    String revStr = ""; 

    for(int i=0;i<str.length();i++)
    {
        revStr = str.charAt(i) + revStr;
    }
   
    return revStr;
    }

    public static void reverseWord(String str)
    {

    String arr[] = str.split(" "); 
    String finalString = "";
    String reverseWord = "";

    for(int i =0;i<arr.length;i++)
    {
      String currentWord = arr[i]; 

       reverseWord = reverse(currentWord);


       finalString += reverseWord + " ";
    }

     System.out.println(finalString.trim());
    }

    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter string :");
     String str = sc.nextLine();

     reverseWord(str);
     sc.close();
    }
    
}
