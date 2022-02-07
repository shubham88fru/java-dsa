public class Stack<T> {
    private static final int MAX_SIZE = 40;
    private Element<T> top;
    private int size = 0; //track stack's size at every push and pop

    //Adds to top
    public void push(T data) throws StackOverflowException {
        if (this.size == MAX_SIZE) throw new StackOverflowException();
        // top of stack point to added el
        // Each added element's next points to the
        // element below it.
        this.top = new Element<T>(data, this.top);
        this.size++;
    }

    //Removes from top
    public T pop() throws StackUnderflowException {
        if (this.size == 0) throw new StackUnderflowException();
        T data = this.top.getData();
        this.top = this.top.getNext();
        this.size--;
        return data;
    }

    //get an element
    public T peek() throws StackUnderflowException {
        if (this.size == 0) throw new StackUnderflowException();
        return this.top.getData();
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    public boolean isFull() {
        return this.size == MAX_SIZE;
    }

    public int getSize() {
        return this.size;
    }
}
