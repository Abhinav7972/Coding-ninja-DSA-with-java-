//package java_basics.Linked-list-1.Linked_list;



public class LinkedList {

public  static  Node<Integer>createLinkedlist()
{
 Node<Integer> n1;  
 n1= new Node<>(10); 
 Node<Integer> n2  = new Node<>(20); 
 Node<Integer> n3  = new Node<>(30);
 Node<Integer> n4  = new Node<>(40);
 Node<Integer> n5  = new Node<>(50); 

 n1.next = n2;
// System.out.println(" n1 " + n1 + n1.data + " next " + n1.next);
 n2.next = n3;
 //System.out.println(" n2 " + n2 + n2.data + " next " + n2.next);
 n3.next = n4;
 //System.out.println(" n3 " + n3 + n3.data + " next " + n3.next);
 n4.next = n5;
 //System.out.println(" n4 " + n4 + n4.data + " next " + n4.next);
 return  n1;
}


public  static  void print(Node<Integer> head)
{
// System.out.println(head);
// System.out.println(head.data);
// System.out.println(head.next);
// System.out.println(head.next.data);
// System.out.println(head.next.next.data); 

while (head!=null) {
 System.out.print(head.data + " ");
 head = head.next;
}

}
    
    public static void main(String[] args) {
     Node<Integer> Head = createLinkedlist(); 
      print(Head);
      System.out.println();
      print(Head.next);
      System.out.println();
      print(Head.next.next);
     //System.out.println(Head);

    }

}
