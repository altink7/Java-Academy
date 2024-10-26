package at.altin.strukturierteprogrammierung.self_study_m_trees.stack_queue.postfix;

import java.util.Scanner;

class Node {
    int data;
    Node next;
}

class Stack {
    Node head;
}

public class Postfix {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack s = new Stack();

        String[] arr = sc.nextLine().split(" ");

        for (String el : arr) {
            processInput(s, el);
        }
    }

    private static void processInput(Stack s, String el) {
        int tmp;
        switch (el){
            case "+":
                tmp = pop(s);
                push(s, pop(s) + tmp);
                break;
            case "-":
                tmp = pop(s);
                push(s, pop(s) - tmp);
                break;
            case "*":
                tmp = pop(s);
                push(s, pop(s) * tmp);
                break;
            case "/":
                tmp = pop(s);
                push(s, pop(s) / tmp);
                break;
            case "%":
                tmp = pop(s);
                push(s, pop(s) % tmp);
                break;
            case "=":
                System.out.print(pop(s));
                break;
            default:
                push(s, Integer.parseInt(el));
        }
    }

    //Alternative Lösung mit if/else/else if
    private static void processInput2(Stack s, String el) {
        int tmp;
        if(el.equals("+")) {
            tmp = pop(s);
            push(s, pop(s) + tmp);
        }
        else if(el.equals("-")) {
            tmp = pop(s);
            push(s, pop(s) - tmp);
        }
        else if(el.equals("*")) {
            tmp = pop(s);
            push(s, pop(s) * tmp);
        }
        else if(el.equals("/")) {
            tmp = pop(s);
            push(s, pop(s) / tmp);
        }
        else if(el.equals("%")) {
            tmp = pop(s);
            push(s, pop(s) % tmp);
        }
        else if(el.equals("=")) {
            System.out.print(pop(s));
        }
        else {
            push(s, Integer.parseInt(el));
        }
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
