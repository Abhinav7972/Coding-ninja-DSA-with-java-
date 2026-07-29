//package introduction_to_java.2D_Array;

public class Array_2d_traverse {

public static void main(String[] args) {


int A[][] = new int[3][4];
// System.out.println(A);//master array address
// System.out.println(A[0]);//address of one d array row inside master array
// System.out.println(A[1]);//address of one d array row inside master array
// System.out.println(A[2]);//address of one d array row inside master array

for(int i=0;i<3;i++)
{
    for(int j=0;j<4;j++)
    {
        System.out.print(A[i][j] + " ");
    }

    System.out.println();
}

System.out.println();

int B[][] = {{1,2,3},{4,5,6},{7,8,9}};

//printing element of 2d array in various rows and col position
// System.out.println(B[0][0]);
// System.out.println(B[0][1]);
// System.out.println(B[0][2]);
// System.out.println(B[1][0]);
// System.out.println(B[1][1]);
// System.out.println(B[1][2]);
// System.out.println(B[2][0]);
// System.out.println(B[2][1]);
// System.out.println(B[2][2]);
// System.out.println(B[2][3]);

//printing 2d array in loop
for(int i=0;i<3;i++) //outer loop for row
{
   for(int j=0;j<3;j++)//inner loop for col
   {
    System.out.print(B[i][j] + " ");
   }

   System.out.println(); //extra line after each row 
}












}
}
