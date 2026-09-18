import java.util.Scanner;

public class merge_Sorted_List {
   
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

public  static  Node<Integer> mergeSortedLL (Node <Integer> T1, Node <Integer> T2)
{
Node <Integer> head,tail;

if (T1 == null) {
    return  T2;
}

if (T2 == null) {
    return  T1;
}


if (T1.data<T2.data) {
      head = tail = T1;
      T1 = T1.next;
    }
    else
    {
        head = tail = T2;
        T2 = T2.next;
    }

while (T1!=null && T2!=null) {
    if (T1.data<T2.data) {
     tail.next = T1;
     tail = T1;
     T1 = T1.next;
    }
    else
    {
     tail.next = T2;
     tail = T2;
     T2 = T2.next;
    }
}


if (T1 !=null) {
    tail.next = T1;
}

if (T2 !=null) {
    tail.next = T2;
}

return  head;

}


    public static void main(String[] args) {
        Node <Integer> T1 = takeInput();
        Node <Integer> T2 = takeInput();

        print(T1);
        System.out.println();
        print(T2);

        System.out.println();
        Node <Integer> sortedLL = mergeSortedLL(T1, T2);
        print(sortedLL);

    }
}
