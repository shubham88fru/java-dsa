package queue;

import stack.Stack;
import stack.StackOverflowException;
import stack.StackUnderflowException;

public class QueueWith2Stacks<T> {
    // We'll always enqueue to it.
    // Will contain elements of queue
    // in reverse order.
    private Stack<T> forwardStack = new Stack<>();

    // We'll always dequeue from it.
    // Will contain in reverse order
    // of elements in forwardStack.
    private Stack<T> reverseStack = new Stack<>();

    public QueueWith2Stacks() {
    }

    public boolean isFull() {
        return forwardStack.isFull() || reverseStack.isFull();
    }

    public boolean isEmpty() {
        return forwardStack.isEmpty() && reverseStack.isEmpty();
    }

    public void enqueue(T data) throws QueueOverflowException {
        if (isFull()) {
            throw new QueueOverflowException();
        }

        try {
            if (forwardStack.isEmpty()) {
                while (!reverseStack.isEmpty()) {
                    forwardStack.push(reverseStack.pop());
                }
                forwardStack.push(data);
            }
        } catch (StackUnderflowException | StackOverflowException e) {
            e.printStackTrace();
        }
    }

    public T dequeue() throws QueueUnderflowException {
        if (isEmpty()) throw new QueueUnderflowException();

        try {
            if (reverseStack.isEmpty()) {
                while (!forwardStack.isEmpty()) {
                    reverseStack.push(forwardStack.pop());
                }
            }
            return reverseStack.pop();
        } catch (StackUnderflowException | StackOverflowException e) {
            throw new QueueUnderflowException();
        }
    }
}
