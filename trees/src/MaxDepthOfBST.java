public class MaxDepthOfBST {
    public static int maxDepth(Node<Integer> root) {
        if (root == null) {
            return 0;
        }
        if (root.getLeftChild() == null && root.getRightChild() == null) {
            return 0;
        }
        int leftMaxDepth = 1 + maxDepth(root.getLeftChild());
        int rightMaxDepth = 1 + maxDepth(root.getRightChild());

        return Math.max(leftMaxDepth, rightMaxDepth);
    }
}
