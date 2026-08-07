public class recursion_palindrome {

 public static boolean isPalindrome(String str)
 {
   if(str.length()==0|| str.length()==1)
   {
    return true;
   }
  
   if(str.charAt(0)!=str.charAt(str.length()-1))
   {
     return false;
   } 

   return isPalindrome(str.substring(1,str.length()-1));

 }



    public static void main(String[] args) {
        String str = "Abc"; 
        String str2 = "AbA";
        boolean result =  isPalindrome(str);
        boolean result2 = isPalindrome(str2);
        System.out.println(result);
        System.out.println(result2);
    }
}
