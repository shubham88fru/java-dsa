public class InsertionSort {
    public static void insertionSort(int [] listToSort) {
        for (int i = 0; i < listToSort.length -1; i++) {
            for (int j = i + 1; j>0; j--) {
                if (listToSort[j] < listToSort[j-1]) {
                    SortHelper.swap(listToSort, j, j-1);
                } else {
                    break;
                }
                SortHelper.print(listToSort);
            }
        }
    }
}
