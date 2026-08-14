
public class Array_equilibrium {
public static int arrayEquilibriumIndex(int[] arr){  
		//Your code goes here
		int lsum =0;
		int totalsum =0;
        int length = arr.length; 

      for(int num:arr)
      {
        totalsum+=num;
      }

        int i=0;
		while(i<length)
		{
		  int rsum =  totalsum - lsum - arr[i]; 

          if(lsum==rsum)
          {
            return i;
          }

          lsum+=arr[i];
          i++;

		} 

		return -1;

	}

 public static void main(String[] args) {
  int arr[] = {1,3,5,6,2,7};
  int arr2[] = {1,2,8,2};
  System.out.println(arrayEquilibriumIndex(arr));
  System.out.println(arrayEquilibriumIndex(arr2));

 }
}
