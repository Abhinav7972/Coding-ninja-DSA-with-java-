import java.util.Scanner;

public class List_recursive {
  
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


public static  Node insertNode(Node head , int value, int pos)
{

if(pos ==0)
{
Node <Integer> newNode = new Node<Integer>(value);
newNode.next = head;
return  newNode;
} 


if (head==null) {
  return  head;
}

head.next = insertNode(head.next, value, pos-1);

return  head;

}

  public static void main(String[] args) {
    Node <Integer> Head = takeInput();
    print(Head); 
    Head = insertNode(Head, 13, 0);
    System.out.println();
    print(Head);
  }
}
