public class LinkedList {

    private Node head;
    private int count;

    public LinkedList(int x) {
        head = new Node(x);
        count = 1;
    }

    public void print() {
        Node current = head;
        while (current != null) {
            System.out.print(current.getData() + " ");
            current = current.getNext();
        }
        System.out.println();
    }

    public void append(int x) {
        if (head == null) {
            head = new Node(x);
            ++count;
            return;
        }
        Node current = head;
        while (current.getNext() != null) {
            current = current.getNext();
        }
        current.setNext(new Node(x));
        ++count;
    }

    public void sum(int index) throws IllegalArgumentException {
        if (index <= 0) { System.out.println(0); }
        if (index > count) { throw new IllegalArgumentException(); }
        Node current = head;
        while (index-- > 1) {
            current = current.getNext();
        }
        try {
            System.out.println(current.sum());
        } catch (MyException me) {
            System.out.println("Error! A node with a negative value was encountered.");
        }
    }
}