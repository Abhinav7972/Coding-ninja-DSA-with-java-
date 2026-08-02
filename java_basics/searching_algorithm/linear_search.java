import java.util.Scanner;

public class linear_search {

  public static int Search(int arr[],int n)
  {
  
    for(int i=0;i<arr.length;i++)
    {
        if(arr[i]==n)
        {
            return i;
        }
    }


    return -1;
  }

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int arr[] = {1,2,3,4};
    int num =sc.nextInt(); 

    System.out.println(Search(arr, num));
    }
}
