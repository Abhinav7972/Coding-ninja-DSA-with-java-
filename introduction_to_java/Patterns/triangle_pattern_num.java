public class triangle_pattern_num {
public static void main(String[] args) {
    for(int i=1;i<=5;i++)
    {
      for(int j=1;j<=i;j++)
      {
        System.out.print(j);
      }
      System.out.println();
    }

    System.out.println();

    int p=1;
    for(int i=1;i<=4;i++)
    {
      for(int j=1;j<=i;j++)
      {
        System.out.print(p);
        p=p+1;
      }
      System.out.println();
    }


     System.out.println();

    for(int i=1;i<=4;i++)
    {
      int q=i;
      for(int j=1;j<=i;j++)
      {
        System.out.print(q);
        q=q+1;
      }
      System.out.println();
    }


}
}
