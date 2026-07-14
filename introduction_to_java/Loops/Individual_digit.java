import java.util.Scanner;

public class Individual_digit {
public static void main(String[] args) {
Scanner s = new Scanner(System.in);
int n = s.nextInt();
int rn = 0;
while (n!=0) {
    int ln = n%10;
    rn = rn * 10 + ln;
    n=n/10;
}

System.out.println(rn);

s.close();
}
}
