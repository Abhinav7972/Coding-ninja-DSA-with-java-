public class Implicit {
   
   public static void main(String[] args) {
     short year = 2026;
    byte age = 30;
    

    int birthyear = year - age; //byte to integer

    System.out.println(birthyear);
   }

}
