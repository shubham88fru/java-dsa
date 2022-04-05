public class InOrderDepthFirstTraversal {
    public static void inOrder(Node<Character> root) {
        if (root == null) return;
        inOrder(root.getLeftChild());
        //print()
        inOrder(root.getRightChild());
    }
}
