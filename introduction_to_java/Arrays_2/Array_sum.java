public class Array_sum {
public static void main(String[] args) {
  int a[] = {1,2,3,4};
  int b[] = {4,5,6,7};
  int maxlen = Math.max(a.length,b.length);
  int sum [] = new int[maxlen + 1];

  int i = a.length-1; 
  int j = b.length-1;
  int k = sum.length-1;
 
  int carry = 0; 
  int total =0;

  while(i>=0 || j>=0 || carry>0)
  {
    total = carry;

      if(i>=0)
      {
        total+=a[i];
        i--;
      }

      if(j>=0)
      {
        total+=b[j];
        j--;
      }

      sum[k] = total %10;
      carry = total/10;
      k--;
  } 


for(int m=0;m<sum.length;m++)
{
    if(m==0 && sum[m]==0)
    {
        continue;
    }

    System.out.print(sum[m] + " ");
}

}
}
