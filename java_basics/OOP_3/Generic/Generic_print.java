public class Generic_print {
   
     public static<T> void printArray(T [] arr)
     {
       for(int i =0; i<arr.length;i++)
       {
        System.out.print(arr[i] + " ");
       }
     }

     
     public static<T extends Print_interface> void printObject(T [] arr)
     {
      for(int i=0;i<arr.length;i++)
      {
        arr[i].print();
      }
     }

    public static void main(String[] args) {
        Integer arr[] = new Integer[5];
       
         for(int i =0;i<arr.length;i++)
         {
            arr[i] = i+1;
         }

         printArray(arr);

          System.out.println();

         Vehicle_gen v1 [] = new Vehicle_gen[5];
             
         for(int i=0;i<v1.length;i++)
         {
            v1[i] = new Vehicle_gen(10*i,"comp");
         }
          printObject(v1);

         
          System.out.println();
        Student_gen s1 [] = new Student_gen[5];

        for(int i=0;i<s1.length;i++)
        {
            s1[i] = new Student_gen(10*i);
        } 

        printObject(s1);
    }
}