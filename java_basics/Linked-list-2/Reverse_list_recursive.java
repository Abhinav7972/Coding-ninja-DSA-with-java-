public class Reverse_list_recursive {
 
    public  static void print(Node<Integer> head)
    {
    
      if (head==null) {
        return ;
      }

      System.out.print(head.data + " ");

      print(head.next);

    }

    public  static Node CreatelinkedList()
    {
      Node <Integer> n1 = new Node<Integer>(10);
      Node <Integer> n2 = new Node<Integer>(20);
      Node <Integer> n3 = new Node<Integer>(30);
      
      n1.next = n2;
      n2.next = n3;

      return  n1;

      
    }
  
   public  static  Node reverse(Node head)
   {
     if (head==null || head.next==null) {
        return  head;
     }

   Node smallHead = reverse(head.next);
   Node  <Integer> tail  = smallHead;
   
   while (tail.next!=null) {
    tail = tail.next;
   }

   tail.next = head;
   head.next = null;
   return  smallHead;
   }


    public static void main(String[] args) {
        Node <Integer> head = CreatelinkedList();
        print(head);
        System.out.println();
        head = reverse(head);
        print(head);
    }
}
