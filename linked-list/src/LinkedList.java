public class LinkedList<T extends Comparable<T>> implements Cloneable {
    private Node<T> head = null; // will hold first node.

    public LinkedList() {
    }

    public void addToEnd(T data) {
        if (head == null) {
            head = new Node<T>(data); // first node.
        } else {
            Node<T> curr = head;
            while (curr.getNext() != null) { // reach the last node.
                curr = curr.getNext();
            }
            curr.setNext(new Node<T>(data));
        }
    }

    public T popFirst() {
        if (head != null) {
            T topElement = head.getData();
            head = head.getNext(); // head points to next
            return topElement;
        }
        return null; // Nothing to remove
    }

    public int countNodes() {
        if (this.head == null) return 0;
        else {
            Node<T> curr = this.head; //start with head
            int count = 0;
            while (curr != null) { //and iterate till end.
                curr = curr.getNext();
                count++;
            }
            return count;
        }
    }
}
