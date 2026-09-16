public class Reverse_list_recursive {
 

    static class DoubleNode<T>
    {
     Node<T> head;
     Node<T> tail;

     DoubleNode(Node<T> head, Node<T> tail)
     {
      this.head = head;
      this.tail = tail;
     }
    }
    
    public  static void print(Node<Integer> head)
    {
    
      if (head==null) {
        return ;
      }

      System.out.print(head.data + " ");

      print(head.next);

    }

    public static Node<Integer> CreatelinkedList()
    {
      Node <Integer> n1 = new Node<Integer>(10);
      Node <Integer> n2 = new Node<Integer>(20);
      Node <Integer> n3 = new Node<Integer>(30);
      
      n1.next = n2;
      n2.next = n3;

      return  n1;

      
    }
  
   public static <T> Node<T> reverse(Node<T> head)
   {
     if (head==null || head.next==null) {
        return  head;
     }

   Node<T> smallHead = reverse(head.next);
   Node<T> tail = smallHead;
   
   while (tail.next!=null) {
    tail = tail.next;
   }

   tail.next = head;
   head.next = null;
   return  smallHead;
   }

   public static <T> DoubleNode<T> reverseBetter(Node<T> head)
   {

    if (head == null) {
      return new DoubleNode<T>(null, null);
    }

    if (head.next == null) {
      return new DoubleNode<T>(head, head);
    }

    DoubleNode<T> smallAns = reverseBetter(head.next);
    smallAns.tail.next = head;
    head.next = null;
    return new DoubleNode<T>(smallAns.head, head);
   }


    public static void main(String[] args) {
        Node <Integer> head = CreatelinkedList();
        
        print(head);
        System.out.println();
        //head = reverse(head);
        DoubleNode<Integer> answer = reverseBetter(head);
        print(answer.head);
    }
}
