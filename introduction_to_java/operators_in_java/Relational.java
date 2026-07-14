public class Relational {
 public static void main(String[] args) {
    int a = 10;
    int b =20;
    
    //equality and relational operator 
    // System.out.println(a==b);
    // System.out.println(a!=b);
    // System.out.println(a>b);
    // System.out.println(a<b);
    // System.out.println(a>=b);
    // System.out.println(a<=b);
    
    //logical operator 
    int c = 10;
    int d = 5;
    int e = 20;
    
    boolean isCGreatest = (c>d) && (c>e);
    boolean isDGreatest = (d>e) && (d>c);
    boolean isEGreatest = (e>c) && (e>d);

    boolean isDNotGreatest = (d<e) || (d<c);
    System.out.println(isCGreatest);
    System.out.println(isDGreatest);
    System.out.println(isEGreatest);
    System.out.println(isDNotGreatest);
 }
}
