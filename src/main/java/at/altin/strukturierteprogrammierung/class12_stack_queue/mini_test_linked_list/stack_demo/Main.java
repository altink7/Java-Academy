package at.altin.strukturierteprogrammierung.class12_stack_queue.mini_test_linked_list.stack_demo;

class Node {
    int data;
    Node next;
}

class Stack {
    Node head;
}

public class Main {
    public static void main(String[] args) {
        Stack s = new Stack();
        push(s,5);
        push(s,9);
        push(s,8);
        push(s,pop(s)+pop(s));
        push(s,4);
        push(s,6);
        push(s,pop(s)*pop(s));
        push(s,pop(s)*pop(s));
        push(s,7);
        push(s,pop(s)+pop(s));
        push(s,pop(s)*pop(s));

        System.out.print(pop(s));

    }

    public static void push(Stack s, int value) {
        Node n = new Node();
        n.data = value;
        n.next = s.head;

        s.head = n;
    }

    public static int pop(Stack s){
        if(s.head == null)
            return Integer.MIN_VALUE;

        int v = s.head.data;
        s.head = s.head.next;
        return v;
    }
}
