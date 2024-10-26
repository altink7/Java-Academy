package at.altin.strukturierteprogrammierung.class12_stack_queue.mini_test_linked_list;

import java.util.Scanner;

class ListNode {
    int data;
    ListNode next;
}

class LinkedList {
    ListNode head;
}

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Create a new (empty) linked list here
        LinkedList list = new LinkedList();

        while(true){
            int value = sc.nextInt();

            //if value is smaller then 0 stop the loop
            //if value is 0 or bigger add the value to the front of the list
            if(value < 0)
                break;

            addFront(list, value);
        }

        //print the list with the given function
        print(list);
    }

    public static void addFront(LinkedList l, int v) {
        ListNode newNode = new ListNode();
        newNode.data = v;
        newNode.next = l.head;

        l.head = newNode;
    }

    public static void print(LinkedList l) {
        for(ListNode cur = l.head; cur != null; cur = cur.next) {
            System.out.printf("%d ", cur.data);
        }
        System.out.println();
    }
}
