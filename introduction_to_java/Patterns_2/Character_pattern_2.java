//package introduction_to_java.Patterns_2;

public class Character_pattern_2 {
 public static void main(String[] args) {
    for(int i=1;i<=5;i++)
    {
        char p = (char) ('A'+ i-1);
        for(int j=1;j<=5;j++)
        {
          
            System.out.print(p);
            p++;
        }
        System.out.println();
    }
 }
}
