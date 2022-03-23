import queue.Queue;
import queue.QueueOverflowException;
import queue.QueueUnderflowException;

// We use a queue to implement
// breadth first traversal
public class BreadthFirstTraversing {
    public static void breadthFirst(Node root)  throws QueueUnderflowException,
            QueueOverflowException {
        if (root == null) return;
        Queue<Node> queue = new Queue<>(Node.class);
        queue.enqueue(root);
        while(!queue.isEmpty()) {
            Node node = queue.dequeue();
            //print(node);
            if (node.getLeftChild() != null) {
                queue.enqueue(node.getLeftChild());
            }
            if (node.getRightChild() != null) {
                queue.enqueue(node.getRightChild());
            }
        }
    }
}
