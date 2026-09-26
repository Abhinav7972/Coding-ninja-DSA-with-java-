
package java_basics.Stacks.Stack_Using_linked_list;

public class Node<T> {
    T data;
    Node<T> next;

    Node(T data)
    {
        this.data = data;
        next = null;
    }
}
