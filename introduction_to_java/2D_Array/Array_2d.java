//package introduction_to_java.2D_Array;

public class Array_2d {

    public static void main(String[] args) {
        //1d array 
        int a[]= new int[10];
        System.out.println(a); //memmory address of single dimension array


        //2d array initilization  
        int A [] [] = new int[10][10];  //specify rows and columns 
        System.out.println(A); //memory address of double dimension array hold address of master array
        System.out.println(A[0]); //row address 
        System.out.println(A[0][0]); //element in row and col

        // int [][]B = new int[5][5];
        // int []C[] = new int[2][2];
        // int [] D,E,F []; //declaring multiple single dimension and 2d array in one line
        // E= new int[5]; //intializing E which is single dimension
        // F = new int[5][5]; //initilizing F which is double dimension array 






    }
}
