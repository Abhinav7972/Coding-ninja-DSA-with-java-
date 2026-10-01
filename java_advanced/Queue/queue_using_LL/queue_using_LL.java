public class queue_using_LL <T>{
    private  Node <T> front;
    private  Node <T> rear;
    int size;

    public  queue_using_LL()
    {
        front = null;
        rear = null;
        size =0;
    }


   public  int getSize()
   {
     return size;
   } 

   public  boolean isEmpty()
   {
    return (this.front == null);
   }

   public  void enqueue(int element)
   {
    Node<T> newNode =  new Node(element);
    
    if (this.rear == null) {
      this.front = this.rear = newNode;
    }
    else
    {
    this.rear.next = newNode;
    this.rear = newNode;
    }
    size ++;
   }

   public  T dequeue()
   {
     
     if (this.front==null) {
      System.out.println("queue is empty :");

     } 
   
     T removeData = this.front.data;
    
     this.front = this.front.next;
      
     if (this.front == null) {
      this.rear = null; 
     } 

     size --;

     return  removeData;

   }

   public  T front()
   {

    if (this.front==null) {
      System.out.println("No element found ");
    }
     return  this.front.data;
   }




}
