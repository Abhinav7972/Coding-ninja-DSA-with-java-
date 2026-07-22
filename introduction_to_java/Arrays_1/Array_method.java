public class Array_method {
  
    public static void incr(int a[])
    {
        for(int i=0;i<a.length;i++)
        {
         a[i] = a[i] + 1;
        }

        for(int i:a)
        {
            System.out.print(i);
        }
    }


    public static void main(String[] args) {
        int a[] = {1,2,3,4}; //memory address of a is copied to method arr 
                                 

        incr(a); //when we execute this method it work on  array int a[] also because memory address is same
         
        System.out.println();

        for(int i:a)
        {
            System.out.print(i);
        }
    }
}
