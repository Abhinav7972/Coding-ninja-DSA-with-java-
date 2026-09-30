package java_advanced.Queue.queue_using_array;

public class queue_Using_array {

private  int [] data;
private  int front;
private  int rear; 
private  int size;

public  queue_Using_array()
{
    data = new int[5];
    front = -1;
    rear = -1;
}


public  queue_Using_array(int capicity)
{
    data = new int[capicity];
    front = -1;
    rear = -1;
} 

public  boolean isEmpty()
{
    return  size == 0;
}


public int size()
{
    return size;
}

public  int front()
{
 if (isEmpty()) {
    return  -1;
 }

 return  data[front];
}


public  void enQueue(int element)
{ 
     if (size == data.length) {
         //throw new IllegalStateException("Queue is full");
         doubleCapicity();
     }

   if (isEmpty()) {
     front = 0;
     rear = 0;
     } else {
         rear = (rear + 1) % data.length;
   }
     data[rear] = element;
     size++;
   
}

public  int deQueue()
{

if (isEmpty()) {
    return  -1;
}    

int temp = data[front];
size--;

if (isEmpty()) {
   front =-1;
   rear = -1; 
} else {
    front = (front + 1) % data.length;
}
return  temp;


} 


private void doubleCapicity()
{
    int temp [] = data;
    data = new int [2*temp.length];
    int index = 0; 


    for(int i=front;i<temp.length;i++)
    {
      data[index++] = temp[i];
    }

    for(int i=0;i<front-1;i++)
    {
        data[index++] = temp[i];
    }

    front = 0;
    rear = temp.length;
}

}
