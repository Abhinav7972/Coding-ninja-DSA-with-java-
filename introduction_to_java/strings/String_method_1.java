public class String_method_1 {
 public static void main(String[] args) {
    String str = "   Alpha man is a goal    ";

    //string method 

    //length 
    System.out.println(str.length());  // finding length of string

    //charAt 
    System.out.println(str.charAt(2)); //finding string char at specific pos 

    //tolowerCase 
    System.out.println(str.toLowerCase()); // convert to lower case 

    //toUppercase 
    System.out.println(str.toUpperCase()); //convert to upper case 

    //trim 
    System.out.println(str.trim()); //remove trailing and leading space

    //substring 
    System.out.println(str.substring(2,10)); // use to extract particular part of string 
    System.out.println(str.substring(9)); //extract substring from start index   

    //replace 
    System.out.println(str.replace('a','k')); //use to replace char in string 

   //indexof 
   System.out.println(str.indexOf('a')); //use to find first index of char in string
   System.out.println(str.indexOf("Alpha")); //use to find first index of substring in string 
   System.out.println(str.indexOf("beta")); //return -1 if dont find substring

   //lastindexof 
   System.out.println(str.lastIndexOf('a')); //use to  find last index of char in string
 
 
   //equals 
   String s1 = "alpha";
   String s2 = "Omega"; 
   System.out.println(s1.equals(s2)); // use to check equality in string return true or false 

   //compare to 
   String s3 = "alpha";
   System.out.println(s1.compareTo(s3)); //return 0 if string is  equal 
   System.out.println(s1.compareTo(s2)); //return positive string is greater deoend on ascii value 

   




 }
}
