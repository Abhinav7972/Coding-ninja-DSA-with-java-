public class Pyramid_pattern {
 public static void main(String[] args) {
   for(int i=1;i<=3;i++)
   {
    //ith row
    for(int s=1;s<=3-i;s++)
    {
      System.out.print(" ");

      //print spaces
    }

    for(int j =1;j<=(2*i)-1;j++)
    {
      //System.out.print("*");
      //print star

      //System.out.print(i);
      //printing rows 

      System.out.print(j);
      //print cols

    }

    System.out.println();
   }
 }
}
