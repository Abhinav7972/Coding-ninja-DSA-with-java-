public class Generic_print {
   
     public static<T> void printArray(T [] arr)
     {
       for(int i =0; i<arr.length;i++)
       {
        System.out.print(arr[i] + " ");
       }
     }

     

    public static void main(String[] args) {
        Integer arr[] = new Integer[5];
       
         for(int i =0;i<arr.length;i++)
         {
            arr[i] = i+1;
         }

         printArray(arr);
    }
}