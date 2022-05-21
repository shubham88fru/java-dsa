public class CheckIfBTisBST {
    public static boolean isBST(Node<Integer> root, int min, int max) {
        if (root == null) {
            return true;
        }

        if (root.getData() <= min || root.getData() > max) {
            return false;
        }

        return isBST(root.getLeftChild(), min, root.getData())
                && isBST(root.getRightChild(), root.getData(), max);
    }
}
