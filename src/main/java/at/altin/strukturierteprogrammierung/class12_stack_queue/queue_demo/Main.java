package at.altin.strukturierteprogrammierung.class12_stack_queue.queue_demo;

class Node {
    int data;
    Node next;
}

class Queue {
    Node head, tail;
}

public class Main {
    public static void main(String[] args) {
        Queue s = new Queue();
        enqueue(s,5);
        enqueue(s,9);
        enqueue(s,8);
        System.out.println(dequeue(s) + dequeue(s));
        enqueue(s,4);
        enqueue(s,6);
        System.out.println(dequeue(s)+ dequeue(s));
        enqueue(s,7);
        System.out.println(dequeue(s)+ dequeue(s));

    }

    public static void enqueue(Queue s, int value) {
        Node n = new Node();
        n.data = value;

        if(s.head == null) {
            s.head = n;
            s.tail = n;
        }
        else {
            s.tail.next = n;
            s.tail = n;
        }
    }

    public static int dequeue(Queue s){
        if(s.head == null)
            return Integer.MIN_VALUE;

        int v = s.head.data;
        s.head = s.head.next;

        if(s.head == null)
            s.tail = null;

        return v;
    }
}
