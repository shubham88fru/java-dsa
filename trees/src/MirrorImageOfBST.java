//Every left child of original BST
//becomes right child and vice versa
public class MirrorImageOfBST {
    public static void mirror(Node<Integer> root) {
        if (root == null) {
            return;
        }
        mirror(root.getLeftChild());
        mirror(root.getRightChild());

        //Swap the left and right child of each node.
        Node<Integer> temp = root.getLeftChild();
        root.setLeftChild(root.getRightChild());
        root.setRightChild(temp);
    }
}
