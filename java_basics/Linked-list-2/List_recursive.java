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


  public static void main(String[] args) {
    Node <Integer> Head = takeInput();
    print(Head);
  }
}
