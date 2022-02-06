//Can create a node having any kind of data.
//extends comparable so we can search
// if elements exists etc.
public class Node<T extends Comparable<T>> {
    private final T data; //data in the node - generic.
    private Node<T> next; // Reference to next node.

    public Node(T data) {
        this.data = data;
        setNext(null); // by default new node will point to nothing.
    }

    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }

    public T getData() {
        return data;
    }

    @Override
    public String toString() {
        return String.valueOf(data);
    }
}
