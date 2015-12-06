public class LinkedList {

    private Node head;
    private int count;

    public LinkedList(int x) {
        head = new Node(x);
    }

    public LinkedList(Node n) {
        head = n;
    }

    public void print() {
        Node current = head;
        while (current != null) {
            System.out.print(current.getData() + " ");
            current = current.getNext();
        }
        System.out.println();
    }

    public void insert(int x) {
        if (head == null) {
            head = new Node(x);
            return;
        }
        if (x <= head.getData()) {
            head = new Node(x, head); // case 1
            return;
        }
        Node current = head;
        Node previous = head;
        while (current != null) {
            if (x > current.getData()) {
                previous = current;
                current = current.getNext();
            } else {
                previous.setNext(new Node(x, current)); // case 2
                return;
            }
        }
        previous.setNext(new Node(x)); // case 3
    }

    public boolean delete(int x) {
        if (head.getData() == x) {
            head = head.getNext(); // case 1
            return true;
        }
        Node current = head.getNext();
        Node previous = head;
        while (current != null) {
            if (current.getData() == x) {
                previous.setNext(previous.getNext().getNext()); // cases 2 & 3
                return true;
            } else {
                if (current.getData() > x) {
                    break;
                } else {
                    previous = current;
                    current = current.getNext();
                }
            }
        } // while
        return false;
    }

    public void append(int x) {
        if (head == null) {
            head = new Node(x);
            return;
        }
        Node current = head;
        while (current.getNext() != null) {
            current = current.getNext();
        }
        // Node temp = new Node(x);
        // current.setNext(temp);
        current.setNext(new Node(x));
    }

    public void sum(int index) throws IllegalArgumentException {
        if(index <= 0) { System.out.println(0); }
        if(index > count) { throw new IllegalArgumentException(); }
        Node current = head;
        while(index-- > 1) {
            current = current.getNext();
        }
        try {
            System.out.println(current.sum());
        } catch (MyException me) {
            System.out.println("Error! A node with a negative value was encountered.");
        }
    }
}