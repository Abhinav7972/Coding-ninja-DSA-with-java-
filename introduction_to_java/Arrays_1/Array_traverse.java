//package introduction_to_java.Arrays_1;

public class Array_traverse {



public static void main(String[] args) {
    int arr[] = {1,2,3,4,5,6,7,8}; //declaring array with values

for(int i=0;i<5;i++) //looping through fix element regardles of array element
{
    System.out.print(arr[i] + " ");//printing array index element based on i
}

System.out.println();

for(int i=0;i<=arr.length-1;i++) //looping through all array element based on length
{
    System.out.print(arr[i] + " ");
}



}

}
