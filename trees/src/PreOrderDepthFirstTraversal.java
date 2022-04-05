public class PreOrderDepthFirstTraversal {
    public static void preOrder(Node<Character> root) {
        if (root == null) return;
        //print()
        preOrder(root.getLeftChild());
        preOrder(root.getRightChild());
    }
}
