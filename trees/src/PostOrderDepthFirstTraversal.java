public class PostOrderDepthFirstTraversal {
    public static void postOrder(Node<Character> root) {
        if (root == null) return;
        postOrder(root.getRightChild());
        postOrder(root.getRightChild());
        //print(root);
    }
}
