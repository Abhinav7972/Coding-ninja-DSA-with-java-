//package java_basics.Linked-list-1;

import java.util.ArrayList;

public class Array_list {


 public static void main(String[] args) {
 ArrayList <Integer> arr1 = new ArrayList<>(); 
 
 arr1.add(5);

 for(int i =1;i<5;i++)
 {
    arr1.add(i*10);
 }

 for(int i=0;i<5;i++)
 {
    System.out.print(arr1.get(i) + " ");
 }

 arr1.add(2,12);

 System.out.println();

 for(int i=0;i<6;i++)
 {
    System.out.print(arr1.get(i) + " ");
 }
System.out.println();
 System.out.println(arr1.size());

 arr1.remove(2);
 System.out.println();
 for(int i=0;i<5;i++)
 {
    System.out.print(arr1.get(i) + " ");
 } 

 arr1.set(1, 50);
 System.out.println();
 for(int i=0;i<arr1.size();i++)
 {
    System.out.print(arr1.get(i) + " ");
 } 

 System.out.println();

 for(int i:arr1)
 {
    System.out.print(i+" ");
 }
 }
}
