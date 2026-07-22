public class Array_method_ret {

 public static int [] incr(int a[])
 {
  for(int i=0;i<a.length;i++)
  {
    a[i] = a[i] +1;
  }
    
  return a;
 }
 public static void main(String[] args) {
    int a[] = {1,2,3,4};
    int b[] = {10,20,30,40};
    incr(a); 
    incr(b);

    for(int i:a)
    {
        System.out.print(i + " ");
    }

    System.out.println();

    for(int i:b)
    {
        System.out.print(i + " ");
    }
 }
}
