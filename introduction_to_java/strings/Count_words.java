import java.util.Scanner;

public class Count_words {

    public static void countWord(String str)
    {
        int count =0;
        for(int i=0;i<str.length();i++)
        {
          if(str.charAt(i)==' ')
          {
            count ++;
          }
        }
        count ++;

        System.out.println("Total words in string :" + count);
    }

    public static  void countWordSplit(String str1)
    {
    
      String s[] = str1.split(" ");
      System.out.println(s.length);

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine(); 
        
        //countWord(s1);
        countWordSplit(s1);
        
    }
}
