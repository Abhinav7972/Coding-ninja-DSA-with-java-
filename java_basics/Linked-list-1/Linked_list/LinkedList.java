//package java_basics.Linked-list-1.Linked_list;

import java.util.Scanner;

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

public  static   Node<Integer>Takeinput()
{

Scanner sc = new Scanner(System.in);
int data = sc.nextInt();

Node<Integer>head = null,tail= null;
while (data!=-1) {
Node<Integer> currNode = new Node<Integer>(data);
if (head==null) {
    head = currNode;
    tail = currNode;
}
else
{
//Node<Integer>tail = head;
// while (tail.next!=null) {
//     tail=tail.next;
// }
tail.next = currNode;
tail = currNode;
}

data = sc.nextInt();
}

return  head;
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

public static  void increaMent(Node<Integer> head)
{
  head.data++;
}

public  static  int length(Node<Integer> head)
{
int count =0;
Node<Integer> temp = head;

while (temp!=null) {
    temp = temp.next;
    count++;
}
return  count;
}


public static  Node insertNode(Node head, int data,int pos)
{
  Node newNode = new Node<Integer>(data);
   
  if(pos==0)
  {
    newNode.next =head;
    head = newNode;
    return  newNode;
  }

  int count =0;
  Node current = head;


  while (current!=null && count < pos-1) {
    current = current.next;
    count = count+1;
  }

  if(current==null)
  {
    return  head;
  }

  newNode.next = current.next;
  current.next = newNode;
    return  head;
}

public  static  Node deletNode(Node head, int pos)
{

if(pos ==0 && head!=null)
{
  return  head.next;
}


Node prevNode = head;

for(int i=0;i<pos-1 && prevNode!=null;i++)
{
prevNode = prevNode.next;
}

if(prevNode==null ||prevNode.next==null)
{
  return  head;
}

prevNode.next = prevNode.next.next;
return  head;
}
    
    public static void main(String[] args) {
     //Node<Integer> Head = createLinkedlist(); 
     Node<Integer> Head = Takeinput(); 

      //print(Head);
      //System.out.println();
      //print(Head.next);
      //System.out.println();
      //print(Head.next.next);
     //System.out.println(Head);
      //increaMent(Head);
      //print(Head);
      //System.out.println();
      //System.out.println(length(Head));

      //print(Head);
      //Head = insertNode(Head,100,10);
      //System.out.println();
      print(Head);
      System.out.println();
      Head = deletNode(Head, 0);
      print(Head);

    }

}
