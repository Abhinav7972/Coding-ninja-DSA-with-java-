package java_basics.Stacks;

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
         throw new stackFullException();
       }

       data[++topindex] = element;
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
