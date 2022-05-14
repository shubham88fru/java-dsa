public class MinValueInBST {
    public static int minimumValue(Node<Integer> head) {
        if (head == null) {
            return Integer.MIN_VALUE;
        }
        if (head.getLeftChild() == null) {
            return head.getData();
        }
        return minimumValue(head.getLeftChild());
    }
}
