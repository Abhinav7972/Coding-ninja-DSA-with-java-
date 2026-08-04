public class merge_sorted_array {
public static int[] sort(int a[], int b[])
{
int len1 = a.length;
int len2 = b.length;

int mergearr [] = new int[len1 + len2]; 
int k=0;
int j =0;
int i =0;

while (i<len1 && j<len2) {

    if(a[i]<b[j])
    {
        mergearr[k++] = a[i];  
        //k++;
        i++;
    }
    else 
    {
        mergearr[k++] = b[j];
        //k++;
        j++;
    }
} 


while(i < len1)
{
     mergearr[k++] = a[i++]; 
    //i++; 
    //k++;
}


while (j< len2) {
  mergearr[k++] = b[j++];
  //j++;
  //k++;
}

return mergearr;

}

 public static void main(String[] args) {
    int a[] = {1,2,3,4};
    int b[] = {5,6,7,8};

   int mergearr[] =sort(a, b);

   for(int i:mergearr)
   {
    System.out.print(i + " ");
   }


 }
}
