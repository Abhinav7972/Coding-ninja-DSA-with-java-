import java.util.Scanner;

public class String_reverse_word_brute_force {

   public static String reverseString(String str,int start,int end)
   {
    String revstr = "";
    for(int i=end;i>=start;i--)
    {
       revstr = revstr +  str.charAt(i);
    }
    return revstr;
   } 

   public static void reverseWord(String str)
   {
    String finalString = "";
    String revword = "";
    int start =0;
    for(int i=0;i<str.length();i++)
    {
        if(str.charAt(i)==' ' || i==str.length()-1)
        {
            int end = (i==str.length()-1)?i:i-1; 

            revword = reverseString(str, start, end); 

            finalString+= revword+" ";

            start = i+1;
        }
    } 

    System.out.println(finalString);
   }

    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     String str = sc.nextLine(); 

     reverseWord(str);

     sc.close();
    }
}
