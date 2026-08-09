public class recursion_merge_sort {

public static  void sort(int arr [])
{
int length = arr.length; 

if(length==0||length==1)
{ 
return;
} 
int mid = length/2;
int s1 [] = new int[mid];
int s2 [] = new int[length-mid];

for(int i=0;i<mid;i++)
{
  s1[i] =arr[i]; 
} 

for(int i=mid;i<length;i++)
{
    s2[i-mid] =arr[i];
}

sort(s1);
sort(s2);

int i=0; int j=0; int k=0;

while (i<s1.length && j<s2.length) {
if(s1[i]< s2[j])
{
    arr[k++] = s1[i++];
}
else 
{
arr[k++] = s2[j++];
}

} 


while (i<s1.length) {
    arr[k++] = s1[i++];
}

while (j<s2.length) {
 arr[k++] = s2[j++];
}




}



public static void main(String[] args) {
int arr [] = {1,3,2,4,5,6}; 

sort(arr);

for(int i: arr)
{
    System.out.print(i+ " ");
}

}

}
