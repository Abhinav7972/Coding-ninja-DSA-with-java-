//package introduction_to_java.Patterns_2;
public class Character_pattern {
public static void main(String[] args) {
for(int i =1; i<=5;i++)
{
    for(int j=1;j<=5;j++)
    {
        char jthChar = (char) ('A'+j-1);
        System.out.print(jthChar);
    }

    System.out.println();
}
}
}
