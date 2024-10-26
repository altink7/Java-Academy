package at.altin.strukturierteprogrammierung.review_class14.sort_linked_list;

public class LinkedListDemo {

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        addBack(list, 12);
        addFront(list, 5);
        addFront(list, 17);
        addBack(list, -4);
        insert(list, 13, 2);
        insert(list, 13, 1);
        addBack(list, 13);

        System.out.println("Bubble Sort:");
        //create copy so that original list will not be sorted
        LinkedList copy = copy(list);
        print(copy);
        bubble(copy);
        print(copy);

        System.out.println("Insertion Sort:");
        copy = copy(list);
        print(copy);
        insertion(copy);
        print(copy);

        System.out.println("Selection Sort:");
        copy = copy(list);
        print(copy);
        selection(copy);
        print(copy);

        System.out.println("Merge Sort:");
        copy = copy(list);
        print(copy);
        mergesort(copy);
        print(copy);

        System.out.println("Quick Sort:");
        copy = copy(list);
        print(copy);
        quicksort(copy);
        print(copy);

    }


    /*** Sort algorithms ***/

    public static void bubble(LinkedList list) {
        boolean swapped;
        int i=0;
        do {
            swapped = false;
            for (int j = 1; j < list.size - i; j++){
                //if (list[j - 1] > list[j]) {
                ListNode first = getNode(list, j - 1);
                ListNode second = getNode(list, j);
                //int distance = Integer.compare(first.data, second.data);
                //if (distance > 0)
                if (first.data > second.data) {
                    swap(list, j - 1, j);
                    /* swap implemented in bubble function */
                    // int tmp = first.data;
                    // first.data = second.data;
                    // second.data = tmp;
                    swapped = true;
                }
            }
            i++;
        } while (swapped);
    }

    public static void insertion(LinkedList list) {
        /* i is the first idx of unsorted partition */
        for (int i=1; i<list.size; i++) {
            int j=i;
            /* tmp holds value of next element to insert */
            int tmp=getNode(list, i).data;
            /* find correct position for tmp */
            while (j>0 && tmp < getNode(list, j - 1 ).data) {
                /* on the way there shift right */
                getNode(list, j).data = getNode(list, j - 1).data;
                j--;
            }
            getNode(list, j).data = tmp;
        }
    }

    public static void selection(LinkedList list) {
        int i, j;
        for (i = 0; i < list.size - 1; i++) {
            int min_idx = i;
            /* find idx of minimum of unsorted partition */
            for (j = i + 1; j < list.size; j++) {
                if (getNode(list, j).data < getNode(list, min_idx).data)
                    min_idx = j;
            }
            /* swap minimum to correct position */
            swap(list, i, min_idx);
        }
    }

    public static void swap(LinkedList list, int i, int j) {
        ListNode first = getNode(list, i);
        ListNode second = getNode(list, j);

        int tmp = first.data;
        first.data = second.data;
        second.data = tmp;
    }

    public static void mergesort(LinkedList list) {
        /* create an auxilliar array that is used be the merge function */
        int[] aux = new int[list.size];
        /* starts the mergesort by calling the recursive function mSort */
        mSort(list, 0, list.size - 1, aux);
    }

    public static void mSort(LinkedList list, int left, int right, int[] aux) {
        /* stops the recursion when portion can't be splited further */
        if (right <= left) return;
        /* call mSort recursively with the left and the right split */
        int middle = (right + left) / 2;
        mSort(list, left, middle, aux);
        mSort(list, middle + 1, right, aux);
        /* merge is first executed for the smallest splits */
        merge(list, left, middle, right, aux);
    }

    public static void merge(LinkedList list, int left, int middle, int right, int[] aux) {
        /* fill the helper array with the list between left and right */
        for (int i = left; i <= right; i++)
            aux[i] = getNode(list, i).data;
        /* the l counter starts at the left position and goes till the middle */
        int l = left;
        /* the r counter starts at the position middle+1 and goes till right position*/
        int r = middle+1;
        /* sorts the elements in the list array */
        for (int i = left; i <= right; i++){
            /* if the left element is smaller take it otherwise take */
            /* the right one and increase the respective counter */
            if (r > right || (l <= middle && aux[l] < aux[r]))
                getNode(list, i).data = aux[l++];
            else
                getNode(list, i).data = aux[r++];
        }
    }


    public static void quicksort(LinkedList list) {
        /* starts the quicksort algorithm */
        quicksort(list, 0, list.size-1);
    }

    public static void quicksort(LinkedList list, int left, int right) {
        if (right<=left)
            return;
        /* partition returns the new position of the pivot element */
        int i=partition(list, left, right);
        //print(numbers);
        /* quicksort is then executed again for the left part ... */
        quicksort(list, left, i-1);
        /* ... and for the right part */
        quicksort(list, i+1, right);
    }

    public static int partition(LinkedList list, int left, int right) {
        /* sorting an array of length 1 is trivial */
        if (left == right) return left;
        /* the right element is selected as pivot */
        int pivot = getNode(list, right).data;
        int i = left - 1, j = right; /* search indices from left and right */
        while (true) {
            /* search for the first element bigger then pivot from the left */
            while (getNode(list, ++i).data < pivot)
                ;
            /* search for the first element smaller then pivot from the right */
            while (pivot < getNode(list, --j).data)
                if (j == left) /* stop at left search index */
                    break;
            /* pivot positon is found and the loop is stopped */
            if (i >= j)
                break;
            /* swap the bigger element on the left side with */
            /* the smaller element on the right side */
            swap(list, i, j);
        }
        /* swap the pivot element */
        swap(list, i, right);
        /* return the new position of the pivot element */
        return i;
    }


    /*** LinkedList operations***/

    private static LinkedList copy(LinkedList list) {
        LinkedList copy = new LinkedList();
        for(ListNode cur = list.head; cur != null; cur = cur.next){
            addBack(copy, cur.data);
        }
        return copy;
    }

    private static void setValue(LinkedList list, int value, int pos) {
        ListNode node = getNode(list, pos);
        node.data = value;
    }

    private static ListNode getNode(LinkedList list, int pos) {
        if(pos < 0 || pos >= list.size)
            return null;

        // Alternative
        // int i = 0;
        // for(ListNode cur = list.head; cur != null; cur = cur.next){
        //     if(i == pos){
        //         return cur;
        //     }
        //     i++;
        // }

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
