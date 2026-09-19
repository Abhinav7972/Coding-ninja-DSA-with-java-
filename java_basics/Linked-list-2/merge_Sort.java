import java.util.Scanner;

public class merge_Sort {

public  static  Node takeInput()
{
Scanner sc = new Scanner(System.in);
int data = sc.nextInt(); 
Node <Integer> head = null,tail=null;

while (data!=-1) {
 Node <Integer> curr = new Node<Integer>(data); 
 if (head==null) {
    head = curr;
    tail = curr;
 }
 else 
 {
    tail.next = curr;
    tail = curr;
 }
data = sc.nextInt();

}

return  head;
}    


public  static  void print(Node <Integer> head)
{

if(head==null) {
return ;
}

System.out.print(head.data + " ");
print(head.next);
}


public  static Node merge(Node <Integer> l1, Node <Integer> l2)
{
  if (l1 == null) {
    return  l2;
  }

  if (l2 == null) {
    return  l1;
  }

  if(l1.data < l2.data) {
    l1.next = merge(l1.next,l2);
    return  l1;
  }
  else
  {
    l2.next = merge(l1, l2.next);
    return  l2;
  }

  
}

public  static  Node mergeNode(Node head)
{
if (head==null || head.next==null) {
    return  head;
}

Node <Integer> slow = head;
Node <Integer> fast = head.next; 

while (fast!=null && fast.next!=null) {
    slow = slow.next;
    fast = fast.next.next;
}


Node <Integer> mid = slow.next;
slow.next = null;

Node<Integer> leftSorted = mergeNode(head);
Node<Integer> rightSorted = mergeNode(mid);


Node <Integer> merged = merge(leftSorted, rightSorted);

return  merged;
}

  public static void main(String[] args) {
    Node <Integer> List = takeInput();
    print(List);
    System.out.println();
    Node <Integer> sorted = mergeNode(List);
    print(sorted);
  }
}
