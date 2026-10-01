public class queue {
    public static void main(String[] args) {
     queue_using_LL <Integer> numqueue = new queue_using_LL<>();
     
     int arr [] = {10,20,30,40};

     for(int el : arr)
     {
       numqueue.enqueue(el);
     }
    
     System.out.println();

     for(int el : arr)
     {
       System.out.println(numqueue.dequeue());
     }


    }
}
