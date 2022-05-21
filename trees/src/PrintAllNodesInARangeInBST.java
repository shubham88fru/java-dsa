public class PrintAllNodesInARangeInBST {
    public static void printRange(Node<Integer> root, int low, int high) {
        if (root == null) {
            return;
        }
        if (low <= root.getData()) {
            printRange(root.getLeftChild(), low, high);
        }

        if (low <= root.getData() && root.getData() <= high) {
            System.out.println(root.getData());
        }

        if (high > root.getData()) {
            printRange(root.getRightChild(), low, high);
        }
    }
}
