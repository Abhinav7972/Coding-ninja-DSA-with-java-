public class String_memory {
 public static void main(String[] args) {
    String s1 = "Apple"; //here string store in string pool in heap  
    String s2 = "apple"; 
    String s3 = "Apple"; //if string are same it dont create new memory space it just point to matching memory location

    System.out.println(System.identityHashCode(s1)); //use to print memory address of object
    System.out.println(System.identityHashCode(s3));
    System.out.println(s1==s3); //same type of string point same memory address in string pool 

    System.out.println();
    System.out.println(System.identityHashCode(s1));
    System.out.println(System.identityHashCode(s2));
    System.out.println(s1==s2);

   
    System.out.println();
    String str1 = new String("apple"); //here new memory address given to every string 
    String str2 = new String("apple");
    String str3 = new String("apple");
   
    System.out.println(System.identityHashCode(str1));
    System.out.println(System.identityHashCode(str2));

    System.out.println(str1==str2); 

    System.out.println();

    System.out.println(System.identityHashCode(str1));
    System.out.println(System.identityHashCode(str3));
    System.out.println(str1==str3); 
    

 }
}
