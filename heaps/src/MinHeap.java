public class MinHeap<T extends Comparable> extends Heap<T> {
    public MinHeap(Class<T> clazz) {
        super(clazz);
    }

    public MinHeap(Class<T> clazz, int size) {
        super(clazz, size);
    }

    @Override
    protected void siftDown(int index) {
        int leftIndex = getLeftChildIndex(index);
        int rightIndex = getRightChildIndex(index);

        int smallerIndex = -1;

        // Find the minimum of the left and right child elements
        if (leftIndex != -1 && rightIndex != -1) {
            smallerIndex = getElementAtIndex(leftIndex).compareTo(getElementAtIndex(rightIndex)) < 0
                    ? leftIndex : rightIndex;

        } else if (leftIndex != -1) {
            smallerIndex = leftIndex;
        } else if (rightIndex != -1) {
            smallerIndex = rightIndex;
        }

        // If the left and right child do not exist stop sifting down.
        if (smallerIndex == -1) {
            return;
        }

        // Compare the smaller child with the current index to see if a swap
        // and further sift down is need.
        if (getElementAtIndex(smallerIndex).compareTo(getElementAtIndex(index))<0) {
            swap(smallerIndex, index);
            siftDown(smallerIndex);
        }
    }

    @Override
    protected void siftUp(int index) {
        int parentIndex = getParentIndex(index);

        if(parentIndex != -1 && getElementAtIndex(index).compareTo(getElementAtIndex(parentIndex))<0) {
            swap(parentIndex, index);
            siftUp(parentIndex);
        }
    }
}
