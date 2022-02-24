package stack;

public class O1MinElementFromStack {
    private final Stack<Integer> stack = new Stack<>();
    private final Stack<Integer> minStack = new Stack<>();

    public void push(int data) throws StackUnderflowException, StackOverflowException {
        int min = data;
        if (!minStack.isEmpty()) {
            if (min > minStack.peek()) {
                min = minStack.peek();
            }
        }
        stack.push(data);
        minStack.push(min);
    }

    public int pop() throws StackUnderflowException {
        minStack.pop();
        return stack.pop();
    }

    public int getMinimum() throws StackUnderflowException {
        return minStack.peek();
    }
}
