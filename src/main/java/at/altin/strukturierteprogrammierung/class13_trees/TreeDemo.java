package at.altin.strukturierteprogrammierung.class13_trees;

import java.util.Scanner;

class BSTNode{
    int data;
    BSTNode left, right;
}

class QueueNode {
    BSTNode data;
    QueueNode next;
}
class Queue {
    QueueNode head, tail;
}

public class TreeDemo {

    static boolean printInfo = true;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BSTNode bst = null;

        String[] values = sc.nextLine().split(",");

        for (String value : values){
            int v = Integer.parseInt(value);
            bst = insert(bst, v);
        }

        System.out.println("\nLevel first:");
        levelOrder(bst);
        System.out.println("\nPreorder first:");
        preorder(bst);
        System.out.println("\nInorder first:");
        inorder(bst);
        System.out.println("\nPostorder first:");
        postorder(bst);
        System.out.printf("\nHeight: %d", height(bst));
        System.out.printf("\nCount: %d", count(bst));
        System.out.printf("\ncountNotLeaves: %d", countNotLeaves(bst));
        System.out.printf("\nSumme: %d", sum(bst));
        System.out.printf("\nMin: %d", min(bst));
    }

    private static BSTNode insert(BSTNode bst, int data) {
        if (bst == null) {
            BSTNode newNode = new BSTNode(); // create the new node
            newNode.data = data;
            if(printInfo) System.out.printf("%2d\n", data);
            return newNode;
        }
        if(printInfo) System.out.printf("%2d -> ", bst.data);
        if (data < bst.data)
            bst.left = insert(bst.left, data); // insert left
        else if (data > bst.data)
            bst.right = insert(bst.right, data); // insert right
        else
            System.out.println("Already in tree. ignored.");
        return bst;
    }

    public static BSTNode searchBST(BSTNode bst, int key) {
        if (bst == null)
            return null;
        if (bst.data == key)
            return bst;
        if (key < bst.data)
            return searchBST(bst.left, key);
        return searchBST(bst.right, key);
    }

    public static int height(BSTNode bst) {
        if (bst == null)
            return 0;
        return Math.max(height(bst.left), height(bst.right)) + 1;
    }

    public static int count(BSTNode bst) {
        if (bst == null)
            return 0;
        return count(bst.left) + count(bst.right) + 1;
    }

    public static int sum(BSTNode bst) {
        if (bst == null)
            return 0;
        return sum(bst.left) + sum(bst.right) + bst.data;
    }

    public static int min(BSTNode bst) {
        if (bst == null)
            return Integer.MAX_VALUE;
        return Math.min(Math.min(min(bst.left), min(bst.right)), bst.data);
    }

    public static int countNotLeaves(BSTNode bst) {
        if (bst == null || (bst.left == null && bst.right == null))
            return 0;
        return countNotLeaves(bst.left) + countNotLeaves(bst.right) + 1;
    }



    public static void preorder(BSTNode bst) {
        if (bst == null)
            return;
        System.out.printf("%2d ", bst.data);
        preorder(bst.left);
        preorder(bst.right);
    }

    public static void inorder(BSTNode bst) {
        if (bst == null)
            return;
        inorder(bst.left);
        System.out.printf("%2d ", bst.data);
        inorder(bst.right);
    }

    public static void postorder(BSTNode bst) {
        if (bst == null)
            return;
        postorder(bst.left);
        postorder(bst.right);
        System.out.printf("%2d ", bst.data);
    }

    public static void levelOrder(BSTNode bst) {
        Queue q = new Queue();
        enqueue(q, bst); //put root in queue
        //while there are elements in the queue
        while (q.head != null) {
            //remove the first and put children in queue
            BSTNode tmp = dequeue(q);
            if (tmp.left != null)
                enqueue(q, tmp.left);
            if (tmp.right != null)
                enqueue(q, tmp.right);
            //print, aka visit
            System.out.printf("%2d ", tmp.data);
        }
    }

    public static void enqueue(Queue q, BSTNode node) {
        // create node
        QueueNode n = new QueueNode();
        n.data = node;
        if (q.tail == null) {
            q.head = q.tail = n;
            return;
        }
        // append to tail
        q.tail.next = n;
        q.tail = n;
    }

    public static BSTNode dequeue(Queue q) {
        if (q == null || q.head == null)
            return null;
        // unlink former head
        QueueNode tmp = q.head;
        q.head = q.head.next;
        // did we dequeue the last remaining element?
        if (q.head == null)
            q.tail = null;
        return tmp.data;
    }
}
