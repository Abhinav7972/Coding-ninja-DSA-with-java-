public class String_create_2 {
  public static void main(String[] args) {
    //way to create a string 

    //assigning literal
    String s1 = "Apple"; //it stored in pool
    System.out.println(s1);

    //using new keyword 
    //1.Passing string literals 
    String str =  new String("hello"); //it stored in heap 
    System.out.println(str);

    //2. Passing character array 
    char ch [] = {'g','r','a','p','e','s'};
    String str2 = new String(ch);
    System.out.println(str2);

    //3.passing byte array 
    byte b[] = {97,98,99,100,101};
    String str3 = new String(b); 
    System.out.println(str3);

  }
}
