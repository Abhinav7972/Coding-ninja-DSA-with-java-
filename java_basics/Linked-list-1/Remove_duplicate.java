//package java_basics.Linked-list-1;

import java.util.ArrayList;
import java.util.Arrays;

public class Remove_duplicate {
     
    public  static ArrayList<Integer> duplicate(int arr[])
    {
        Arrays.sort(arr);
      ArrayList<Integer>Result = new ArrayList<>();
        Result.add(arr[0]);
      for(int i=1;i<arr.length;i++)
      {
         if(arr[i]!=arr[i-1])
         {
           Result.add(arr[i]);
         }
      } 

      return  Result;
    }
 
    public static void main(String[] args) {
      int arr [] = {10,10,20,30,40,50,10};
      ArrayList<Integer> Result = duplicate(arr); 

      for(int i=0;i<Result.size();i++)
      {
        System.out.print(Result.get(i) + " ");
      }
    }
}
