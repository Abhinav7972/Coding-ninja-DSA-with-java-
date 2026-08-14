public class Array_intersection {


public static void sort(int arr[])
{

if(arr.length<=1)
{
return; 
}    
 
int length = arr.length;
int mid = length/2;
int arr1 [] = new int[mid];
int arr2 [] = new int[length-mid];


for(int i=0;i<mid;i++)
{
    arr1[i] = arr[i];
}

for(int i=mid;i<length;i++)
{
  arr2[i-mid] = arr[i];
}

sort(arr1);
sort(arr2);

int i =0;int j=0;int k=0;

while (i<arr1.length && j<arr2.length) {
if(arr1[i]<arr2[j])
{
arr[k] = arr1[i];
k++;
i++;
} 
else 
{
arr[k] = arr2[j];
k++;
j++;
}

}


while (i<arr1.length) {
arr[k] = arr1[i];
k++;
i++;
}

while (j<arr2.length) {
arr[k] = arr2[j];
k++;
j++;
}

}

public static void findIntersect(int arr[], int arr2[])
{


sort(arr);

for(int i=0,j=0;i<arr.length && j<arr2.length;)
{
if(arr[i]==arr2[j])
{
  System.out.print(arr2[j] + " ");
  i++;
  j++;
}
else if(arr[i]<arr2[j])
{
    i++;
}
else 
{
    j++;
}
}


}


 public static void main(String[] args) {
  int arr1[] = {1,10,4,5,2,6};
  int arr2[] = {2,5,10,4,6,9};

  System.out.println("given Arrays");
  for(int i:arr1)
  {
    System.out.print(i + " ");
  }
  
  System.out.println();

  for(int j:arr2)
  {
    System.out.print(j + " ");
  }

  

  System.out.println();
  
  System.out.println("Intersections :");
  findIntersect(arr1, arr2); 
  


 }
}
