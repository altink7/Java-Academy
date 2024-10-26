package at.altin.strukturierteprogrammierung.self_study_m_trees.stack_queue.array_walker;

import java.util.Scanner;

class Node {
    int data;
    Node next;
}

class Stack {
    Node head;
}

public class ArrayWalker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[][] myWalker = new char[10][10];
        Stack undo = new Stack();
        Stack redo = new Stack();
        // setting all values of the array myWalker to '.'
        for(int row = 0; row < 10; row++){
            for(int col = 0; col < 10; col++){
                myWalker[row][col] = '.';
            }
        }

        int row = 0;
        int col = 0;
        char nextChar = 'A';
        myWalker[row][col] = nextChar++;

        print(myWalker);

        while(true) {

            System.out.printf("Enter direction command: ");
            int command = sc.nextInt();
            System.out.println();

            int newRow = row;
            int newCol = col;
            boolean isUndo = false;
            boolean isRedo = false;

            if (command == 7) {  //undo
                isUndo = true;
                command = 10 - pop(undo);
                if(!isValidDirection(command)) {
                    System.out.println("Nothing to undo!");
                    continue;
                }
            } else if (command == 9) {  //redo
                isRedo = true;
                command = 10 - pop(redo);
                if(!isValidDirection(command)) {                     //if no commands are
                    command = pop(undo);
                    if (!isValidDirection(command)) {
                        System.out.println("Nothing to redo!");
                        continue;
                    }
                    push(undo, command);
                }
            }

            if (command == 8) {         // north
                newRow -= 1;
            } else if (command == 2) {  // south
                newRow += 1;
            } else if (command == 4) {  // west
                newCol -= 1;
            } else if (command == 6) {  // east
                newCol += 1;
            } else if(command == 5) {
                break;
            } else {
                continue;
            }

            if(!isUndo && (newRow < 0 || newRow > 9 || newCol < 0 || newCol > 9 || myWalker[newRow][newCol] != '.')){
                System.out.println("You cannot go there!");
                continue;
            }

            if (isUndo) {
                push(redo, command);
                myWalker[row][col] = '.';
                if(nextChar == 'A')
                    nextChar = 'Z';
                else
                    nextChar--;
            }

            row = newRow;
            col = newCol;

            if(!isUndo) {
                push(undo, command);
                if(!isRedo)
                    redo = new Stack();
                myWalker[row][col] = nextChar;
                if(nextChar == 'Z')
                    nextChar = 'A';
                else
                    nextChar++;
            }

            print(myWalker);
        }

        sc.close();
    }

    private static boolean isValidDirection(int command) {
        return command == 2 || command == 4 || command == 6 || command == 8;
    }

    private static void print(char[][] myWalker) {
        for(int row = 0; row < 10; row++){                   // setting all values of the array myWalker to '.'
            for(int col = 0; col < 10; col++){
                System.out.print(myWalker[row][col]);
            }
            System.out.println();
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

