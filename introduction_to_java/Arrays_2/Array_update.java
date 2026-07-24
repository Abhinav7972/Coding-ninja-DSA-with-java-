//package introduction_to_java.Arrays_2;

import java.util.Scanner;

public class Array_update {

public static  void update(int A[], int key,int newKey)
{

for(int i=0;i<A.length;i++)
{

    if(A[i]==key)
    {
        A[i]=newKey; 
        return;
    }

}
    System.out.println("Key not found ");

}


public static int takeInput(String str)
{
Scanner s  = new Scanner(System.in);
System.out.print(str);
int input = s.nextInt(); 
return input;
}


public static void main(String[] args) {
int cap = takeInput("Enter array capicity :");
int key = takeInput("Enter key :");
int newKey = takeInput("Enter new key :"); 

int A [] = new int[cap];

for(int i=0;i<cap;i++)
{
A[i] = takeInput("Enter element :");
}

System.out.println();

System.out.println("Total number of elements :");
for(int i:A)
{
    System.out.print(i + " ");
}

System.out.println();


update(A, key, newKey);

System.out.println("Updated elements :");
for(int i:A)
{
    System.out.print(i + " ");
}

}
}
