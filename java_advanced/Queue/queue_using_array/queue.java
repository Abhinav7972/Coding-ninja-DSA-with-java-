package java_advanced.Queue.queue_using_array;

public class queue {

    public static void main(String[] args) {
       queue_Using_array queue = new queue_Using_array(3);
       int arr [] = {10,20,30};

       for(int el : arr)
       {
          queue.enQueue(el);
       }
       
       System.out.println(queue.front());
       
        System.out.println();
        
       for(int el : arr)
       {
          System.out.print(queue.deQueue() + " ");
       }
    }
}
