public class Binarysearch {
    public static int binarySearch(int [] sortedList, int number) {
        int min = 0;
        int max = sortedList.length - 1;
        while (min<=max) {
            int mid = min + (max-min)/2;
            if (sortedList[mid] == number) return mid;
            if (sortedList[mid]>number) {
                max = mid - 1;
            } else {
                min = mid + 1;
            }
        }
        return -1;
    }

    public static Node<Integer> insert(Node<Integer> head, Node<Integer> node) {
        //base case,if head is null then the node
        //itself is the head
        if (head == null) {
            return node;
        }

        //If the node values is smaller than the head
        //then its correct place is somewhere in the left
        //subtree.
        if (node.getData() <= head.getData()) {
            head.setLeftChild(insert(head.getLeftChild(), node));
        } else {
            //otherwise insert in right subtree
            head.setRightChild(insert(head.getRightChild(), node));
        }
        return head;
    }

    public static Node<Integer> lookup(Node<Integer> head, int data) {
        //no match
        if (head == null) {
            return null;
        }

        //match
        if (head.getData() == data) {
            return head;
        }

        //which subtree to look into
        if (data <= head.getData()) {
            return lookup(head.getLeftChild(), data);
        } else {
            return lookup(head.getRightChild(), data);
        }
    }
}
