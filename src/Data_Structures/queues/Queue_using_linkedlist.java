package Data_Structures.queues;

import java.util.Queue;

public class Queue_using_linkedlist {
    Node first = null;
    Node last = null;
    int length = 0;

    public String peek() {
        if (this.length > 0) {
            return this.first.value;
        } else {
            return null;
        }
    }

    public void enqueue(String value) {
        Node newNode = new Node(value);
        if (this.length == 0) {
            this.first = newNode;
        } else {
            this.last.next = newNode;
        }
        this.last = newNode;
        this.length++;
    }

    public void dequeue() {
        if (this.length > 0) {
            this.first = this.first.next;

            if (this.length == 1) {
                this.last = null;
            }
            this.length--;
        }
    }

    public boolean isEmpty() {
        return this.length == 0;
    }

    public static void main(String[] args) {
        Queue_using_linkedlist myQueue = new Queue_using_linkedlist();
        System.out.println(myQueue.isEmpty());
        System.out.println(myQueue.peek());
        myQueue.enqueue("Apple");
        myQueue.enqueue("Ball");
        myQueue.enqueue("Cat");
        myQueue.dequeue();
        System.out.println(myQueue.peek());
    }
}
