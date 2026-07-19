public class isosceles_triangle {
 public static void main(String[] args) {
   for(int i=1;i<=5;i++)
   {
    for(int s=1;s<=5-i;s++)
    {
      System.out.print(" ");
    }
    int num=1;
    for(int j=1;j<=i;j++)
    {
        System.out.print(num);
        num++;
    }

    num=i-1;
    for(int k=1;k<=i-1;k++)
    {
        System.out.print(num);
        num--;
    }

    System.out.println();
   }
 }   
}
