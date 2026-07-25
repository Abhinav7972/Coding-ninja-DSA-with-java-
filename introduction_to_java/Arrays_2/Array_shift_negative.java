import java.util.Scanner;

public class Array_shift_negative {

public static void swap(int a[],int l,int r)
{
int temp = a[l];
a[l]=a[r];
a[r]=temp;
}


public static void shiftNegative(int a[])
{
int l=0;
int r= a.length-1; 

while (l<r) {
    if(a[l]>0 && a[r]>0)
    {
        r--;
    }
    else if(a[l]>0 && a[r]<0)
    {
        swap(a, l, r);
        l++;
        r--;
    }
    else if(a[l]<0 && a[r]>0)
    {
        l++;
    }
    else 
    {
        l++;
    }
    
}
}

public static int takeInput(String str)
{
System.out.println(str);
Scanner s = new Scanner(System.in);
int input = s.nextInt(); 
return input;
}

public static void main(String[] args) {
int cap = takeInput("Enter the array capicity ");
int a[] = new int[cap];

System.out.println("Enter element into array :");
for(int i=0;i<cap;i++)
{
    a[i] = takeInput("Enter element :");
}

System.out.println();

System.out.println("original elements");
for(int i :a)
{
    System.out.print(i + " ");
}

System.out.println();


System.out.println("Shifting negative value :");

shiftNegative(a);

for(int i :a)
{
    System.out.print(i + " ");
}


}
}
