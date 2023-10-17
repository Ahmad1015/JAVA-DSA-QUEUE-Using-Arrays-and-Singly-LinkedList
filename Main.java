public class Main{
    public static void main(String[] args){
       /*  ArrayQueue qq = new ArrayQueue(3);
        qq.add(1);
        qq.add(2);
        qq.add(3);
        System.out.println(qq.isEmpty());
        System.out.println(qq.peek());
        qq.remove();
        System.out.println(qq.isEmpty());
        System.out.println(qq.peek());
        qq.remove();
        System.out.println(qq.isEmpty());
        System.out.println(qq.peek());
        qq.remove();
        System.out.println(qq.isEmpty());
        System.out.println(qq.peek());
        */

        /*Testing Linked List Queue Now */
        List abc = new ArrayQueue(3);
        abc.add(1);
        abc.add(2);
        abc.add(3);
        System.out.println(abc.isEmpty());
        System.out.println(abc.peek());
        abc.remove();
        System.out.println(abc.isEmpty());
        System.out.println(abc.peek());
        abc.remove();
        System.out.println(abc.isEmpty());
        System.out.println(abc.peek());
        abc.remove();
        System.out.println(abc.isEmpty());
        System.out.println(abc.peek());

    }
}

abstract class List{
    abstract public boolean add(int element);
    abstract public int remove();
    abstract boolean isEmpty();
    boolean isFull(){return false;};
    abstract int peek();
}

class ArrayQueue extends List{
    int front=0,rear=0;
    int[] arr;
    ArrayQueue(int size){
        arr = new int[size];
        
    }

    public boolean add(int element){
       if(isFull()){
        return false;
       }
        else{
            arr[rear] = element;
            rear++;
            return true;
        }
    }

    public int remove(){
        if(isEmpty())
            return -1;
        else{
            int temp = arr[front];
            arr[front] = 0;                           // Setting the default value
            front++;
            return temp;
        }
    }

    public int peek(){
         if(isEmpty())
            return -1;
        else{
            return arr[front];
        }
    }

    public boolean isFull(){
         if(rear == arr.length){
            System.out.println("Queue is Full - Cannot Add");
            return true;
        }
        else
            return false;
    }
    
    public boolean isEmpty(){
        if(front == rear)
            return true;
        else
            return false;
    }
}
class Node{
    int value;
    Node next;
    Node(){
        value = 0;
        next=null;
    }
    Node(int element){
        value = element;
        next = null;
    }

}
class LinkedListQueue extends List{
    Node front;
    int size;
    Node rear;
    LinkedListQueue(){
        front = null;
        rear = null;
    }
    LinkedListQueue(int Size){
        front = null;
        size = Size;
    }

    public boolean add(int element){
        Node curr = new Node(element);
        if(front == null){
            front = curr;
            rear = curr;
            size++;
        }
        else{
            rear.next = curr;
            size++;
            rear = rear.next;
        }
        return true;
    }

    public int remove(){
        if(front == rear){
            int temp = front.value;
            front = rear = null;
            size--;
            return temp;
        }
        else if(front != null && rear != null){
            int temp = front.value;
            front = front.next;
            size--;
            return temp;
        }
        else{
            return -1;          // Empty Linked List Queue
        }
    }

    public boolean isEmpty(){
        return (size == 0);
    }
    public int peek(){
        if(isEmpty()){
            return -1;
        }
        else
            return front.value;
    }
}