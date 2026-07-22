public class Array_largest_number {
 public static void main(String[] args) {
    int arr [] = {12,40,123,200,60,100,201};
     
    int max=Integer.MIN_VALUE;

  
     for(int i:arr)
     {
        System.out.print(i + " ");
     }
  
    System.out.println();
    
    for(int i=1;i<arr.length;i++)
    {
      if(arr[i]>max)
      {
        max=arr[i];
      }
     
    }

    System.out.println("Max number is :"+max);
 }
}
