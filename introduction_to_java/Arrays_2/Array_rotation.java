public class Array_rotation {
  

  public static  int [] rotate(int a[], int x, int dir)
  {

    int b [] = new int[a.length];

    if(dir==1)
    {
  for(int i=0;i<a.length;i++)
  {
     b[(i+x)%a.length] = a[i];
  }
}
else if(dir==0)
{
 for(int i=0;i<a.length;i++)
  {
     b[(i-x +a.length)%a.length] = a[i];
  }
}
 return  b;
  }

    public static void main(String[] args) {
        int a [] = {1,2,3,4,5}; 

        for(int i:a)
        {
            System.out.print(i);
        }

        System.out.println();

       a = rotate(a, 1,0);

        for(int i :a)
        {
            System.out.print(i);
        }
    }
}
