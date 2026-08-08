public class recursion_2 {

public static String replace(String s,char a,char b)
{
 if(s.length()==0)
 {
    return s;
 }

 String smallOp =  replace(s.substring(1), a, b); 

 if(s.charAt(0)==a)
 {
   return b + smallOp;
 }
 else 
 {
    return s.charAt(0) + smallOp;
 }

}


public static void main(String[] args) {
System.out.println(replace("axbycx", 'x', 'y'));
}
}
