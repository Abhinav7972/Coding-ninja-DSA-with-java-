//package java_basics.OOP_1.Dynamic_array;

public class Dynamic_array_use {

    public static void main(String[] args) {
     Dynamic_array d = new Dynamic_array();

      for(int i=0;i<20;i++)
      {
        d.add(100+i);
      } 

      for(int i=0;i<10;i++)
      {
        System.out.print(d.getItem(i) + " ");
      }
       System.out.println();

       d.setItem(2, 50);

       for(int i=0;i<10;i++)
      {
        System.out.print(d.getItem(i) + " ");
      }
       System.out.println();

      System.out.println(d.getSize());
      
      System.out.println(d.removeLast());
      System.out.println(d.removeLast()); 

      while (!d.isEmpty()) {
        System.out.println(d.removeLast());
        System.out.println("Size = " + d.getSize());
        
      }

    }
}
