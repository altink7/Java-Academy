package at.altin.strukturierteprogrammierung.class11_linked_list;

public class LinkedListDemo {

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        LinkedList list2 = new LinkedList();

        addBack(list, 12);
        addFront(list, 5);
        addFront(list, 17);
        addBack(list, -4);
        insert(list, 13, 2);
        setValue(list, -10, 3);
        insert(list, 13, 1);
        addBack(list, 13);


        addBack(list2, 4);
        addBack(list2, 100);
        addBack(list2, 98);

        print(list);
        print(list2);

        //int size = count(list);

        System.out.printf("List size: %d\n", list.size);

        System.out.printf("Value at position 3: %d\n", getValue(list, 3));
        System.out.printf("Value at position 0: %d\n", getValue(list, 0));

        System.out.printf("First Position of value 13: %d\n", find(list, 13));
        System.out.printf("All Positions of value 13: ");
        print(findAll(list, 13));

        print(list);
        remove(list, find(list, 5));
        print(list);


        //remove(list, 2);
        //print(list);
        //remove(list, 1);
        //print(list);
        //remove(list, 0);
        //print(list);
        //remove(list, 1);
        //print(list);
        //remove(list, 0);
        //print(list);
    }

    private static int find(LinkedList list, int value) {
        ListNode current = list.head;
        for(int i=0; i < list.size; i++){
            if(current.data == value){
                return i;
            }
            current = current.next;
        }

        return -1;
    }

    private static LinkedList findAll(LinkedList list, int value) {
        LinkedList found = new LinkedList();
        ListNode current = list.head;
        for(int i=0; i < list.size; i++){
            if(current.data == value){
                addBack(found, i);
            }
            current = current.next;
        }

        return found;
    }

    private static void setValue(LinkedList list, int value, int pos) {
        ListNode node = getNode(list, pos);
        node.data = value;
    }

    private static void remove(LinkedList list, int pos) {
        ListNode before = getNode(list, pos-1);
        if(pos == 0){
            list.head = list.head.next;
        }
        else {
            before.next = getNode(list, pos+1);
        }

        if(pos == list.size-1) {
            list.tail = before;
        }
        list.size--;
        //before.next = before.next.next;
    }

    private static ListNode getNode(LinkedList list, int pos) {
        if(pos < 0 || pos >= list.size)
            return null;

        ListNode current = list.head;
        for(int i = 0; i < pos; i++){
            current = current.next;
        }

        return current;
    }

    private static int getValue(LinkedList list, int pos) {
        //ListNode current = list.head;
        //for(int i = 0; i < pos; i++){
        //    current = current.next;
        //}
        return getNode(list, pos).data;
    }

    private static void insert(LinkedList list, int value, int pos) {
        if(pos == 0) {
            addFront(list, value);
            return;
        }
        if(pos == list.size-1) {
            addBack(list, value);
            return;
        }

        ListNode current = list.head;
        for(int i = 0; i < pos - 1; i++){
            current = current.next;
        }

        ListNode newNode = new ListNode();
        newNode.data = value;
        newNode.next = current.next;
        current.next = newNode;

        list.size++;
    }

    private static int count(LinkedList list) {
        ListNode current = list.head;
        int cnt = 0;
        while(current != null) {
            cnt++;
            current = current.next;
        }

        return cnt;
    }

    private static void print(LinkedList list) {
        ListNode current = list.head;
        while(current != null) {
            System.out.printf("%3d ", current.data);
            current = current.next;
        }
        System.out.println();
    }

    private static void addFront(LinkedList list, int value) {
        ListNode newNode = new ListNode();
        newNode.data = value;
        newNode.next = list.head;
        list.size++;

        if(list.head == null)
            list.tail = newNode;


        list.head = newNode;
    }

    private static void addBack(LinkedList list, int value) {
        ListNode newNode = new ListNode();
        newNode.data = value;
        list.size++;

        if(list.head == null){
            list.head = newNode;
            list.tail = newNode;
        }
        else {
            list.tail.next = newNode;
            list.tail = newNode;
        }
    }
}
