public class Array_second_large {
  public static void main(String[] args) {
   int a[] = {1,2,10,20,5,6,8,15,50,55};
   
   int max1 = a[0];
   int max2 = a[0]; 

   for(int i=1;i<a.length;i++)
   {
     if(a[i]>max1)
     {
        max2 =max1;
        max1 = a[i];
     }
     else if(a[i]>max2 && a[i]!=max1)
     {
        max2 = a[i];
     }
   }
 
   System.out.println("Total numbers are :");
   for(int i:a)
   {
     System.out.print(i+ " ");
   }

   System.out.println();

   System.out.println("Largest number :"+max1);
   System.out.println("Second largest number :"+max2);

  }

}
