public class Array_memory {
    public static void main(String[] args) {
        int A [] = {1,2,3,4,5};
        float f[] = new float[5];
        int B [] =A; 
        System.out.println(A); //memory address of integer array A 
        System.out.println(B); //memory address of integer array B 

        //memory address is diffrent for diffrent type of array
        System.out.println(f); //memory address of float array f

        B[2]=5; 

        //B and A  array point at same memory location 
        //if B[2] is changed it effect array A also 
        for(int i:A)
        {
            System.out.print(i); 
        }

        System.out.println();

        for(int i : B)
        {
            System.out.print(i);
        }



    }
}
