package at.altin.strukturierteprogrammierung.review_class14.sort_person_list;

public class LinkedListDemo {

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        //Person p = create("Alt", "in");
        addBack(list, create("Altin", "Kelmendi"));
        addFront(list, create("Julia", "Jakoubek"));
        addFront(list, create("Konrad", "Konlechner"));
        addBack(list, create("Matyus", "Hierzer"));
        addBack(list, create("Daniel", "Wolfgang"));

        print(list);

        bubble(list, 0);

        print(list);

        bubble(list, 1);

        print(list);



    }

    public static Person create(String firstname, String lastname){
        Person p = new Person();
        p.firstname = firstname;
        p.lastname = lastname;
        return p;
    }

    public static void bubble(LinkedList list, int sortMethod) {
        boolean swapped;
        int i=0;
        do {
            swapped = false;
            for (int j = 1; j < list.size - i; j++){
                //if (list[j - 1] > list[j]) {
                ListNode first = getNode(list, j - 1);
                ListNode second = getNode(list, j);

                int cmp = 0;
                if(sortMethod == 0)
                    cmp = first.data.firstname.compareTo(second.data.firstname);
                else if(sortMethod == 1)
                    cmp = first.data.lastname.compareTo(second.data.lastname);

                if (cmp > 0) {
                    //swap(list, j - 1, j);
                    Person tmp = first.data;
                    first.data = second.data;
                    second.data = tmp;
                    swapped = true;
                }
            }
            i++;
        } while (swapped);
    }

    /*public static void swap(LinkedList list, int i, int j) {
        ListNode first = getNode(list, i);
        ListNode second = getNode(list, j);

        int tmp = first.data;
        first.data = second.data;
        second.data = tmp;
    }*/

    private static ListNode getNode(LinkedList list, int pos) {
        if(pos < 0 || pos >= list.size)
            return null;

        ListNode current = list.head;
        for(int i = 0; i < pos; i++){
            current = current.next;
        }

        return current;
    }

    private static void print(LinkedList list) {
        ListNode current = list.head;
        while(current != null) {
            System.out.printf("%s, %s\n", current.data.firstname, current.data.lastname);
            current = current.next;
        }
        System.out.println();
        System.out.println();
    }

    private static void addFront(LinkedList list, Person value) {
        ListNode newNode = new ListNode();
        newNode.data = value;
        newNode.next = list.head;
        list.size++;

        if(list.head == null)
            list.tail = newNode;


        list.head = newNode;
    }

    private static void addBack(LinkedList list, Person value) {
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
