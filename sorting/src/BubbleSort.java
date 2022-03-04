public class BubbleSort {
    public static void bubbleSort(int[] listToSort) {
        for (int i = 0; i < listToSort.length; i++) {
            boolean swapped = false;
            // We start comparision from end of array
            // Not necessary though.
            for (int j = listToSort.length - 1; j > i; j--) {
                if (listToSort[j] < listToSort[j-1]) {
                    SortHelper.swap(listToSort, j, j-1);
                    swapped = true;
                }
            }
            SortHelper.print(listToSort);
            if (!swapped) {
                break;
            }
        }
    }
}
