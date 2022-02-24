package stack;

// We'll implement a stack using
// a linked list. stack.Element is same as Node
// Stacks can be implemented using arrays also
public class Element<T> {
    private T data;
    private Element<T> next;

    public T getData() {
        return this.data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Element<T> getNext() {
        return next;
    }

    public void setNext(Element<T> next) {
        this.next = next;
    }

    public Element(T data, Element<T> next) {
        this.data = data;
        this.next = next;
    }
}
