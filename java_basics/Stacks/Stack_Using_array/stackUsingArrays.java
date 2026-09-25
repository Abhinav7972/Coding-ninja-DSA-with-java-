package java_basics.Stacks.Stack_Using_array;

public class stackUsingArrays {

    private int [] data; 
    private  int topindex;

    public  stackUsingArrays()
    {
        data = new int[10];
        topindex = -1;
    }

     public  stackUsingArrays(int size)
    {
        data = new int[size];
        topindex = -1;
    }

    public  int Size()
    {
       return  topindex +1;
    }

    public boolean isEmpty()
    {
     return  topindex == -1;
    }

    public  void push(int element) throws stackFullException
    {
       if(topindex==data.length-1) {
         //throw new stackFullException();
         doubleCapicity();
       }

       data[++topindex] = element;
    }

    private  void doubleCapicity()
    {
      System.out.println("Double Capicity");

      int temp [] =data;
      data = new int[2 * temp.length];

      for(int i =0;i<temp.length;i++)
      {
         data[i] = temp[i];
      }
    }

    public  int top() throws stackEmptyException
    {
       if (topindex ==-1) {
          throw new stackEmptyException();
       }

       return data[topindex];
    }

    public  int pop() throws stackEmptyException
    {
      if (topindex==-1) {
         throw  new stackEmptyException();
      }

      int temp = data[topindex];
      topindex--;
      return  temp;
    }


}
