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


public static String replacePI(String str)
{
  if(str.length()<=1)
  {
    return str;
  }

  if(str.charAt(0)=='p' && str.charAt(1)=='i')
  {
    String smallSTR = replacePI(str.substring(2));

    return "3.14" + smallSTR;
  } 

  else 
  {
    String smallSTR = replacePI(str.substring(1));
    
    return str.charAt(0) + smallSTR;
  }
}


public static void main(String[] args) {
System.out.println(replace("axbycx", 'x', 'y'));
System.out.println(replacePI("apibpi"));
}
}
