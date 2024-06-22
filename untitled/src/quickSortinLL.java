class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    void addNode(int data) {
        if (head == null) {
            head = new Node(data);
            return;
        }
        Node curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        Node newNode = new Node(data);
        curr.next = newNode;
    }

    void printList(Node n) {
        while (n != null) {
            System.out.print(n.data + " ");
            n = n.next;
        }
    }

    Node partition(Node low, Node high) {
        int pivot = high.data;
        Node i = low, j = low;
        while (j != high) {
            if (j.data <= pivot) {
                // swap values at i and j
                int temp = i.data;
                i.data = j.data;
                j.data = temp;
                i = i.next;
            }
            j = j.next;
        }
        // swap values at i and high (or pivot)
        int temp = i.data;
        i.data = high.data;
        high.data = temp;
        return i;
    }

    void quickSort(Node low, Node high) {
        if (low != null && high != null && low != high && low != high.next) {
            Node pivot = partition(low, high);
            quickSort(low, pivot);
            quickSort(pivot.next, high);
        }
    }

    Node lastNode(Node node) {
        while (node.next != null) {
            node = node.next;
        }
        return node;
    }

    void quickSort() {
        Node last = lastNode(head);
        quickSort(head, last);
    }
}

public class quickSortinLL {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addNode(3);
        list.addNode(4);
        list.addNode(2);
        list.addNode(1);
        list.addNode(5);

        System.out.println("Linked List before sorting:");
        list.printList(list.head);

        list.quickSort();

        System.out.println("\nLinked List after sorting:");
        list.printList(list.head);
    }
}