public class InsertionSort {
    public static void insertionSort(int[] listToSort) {
        for (int i = 0; i < listToSort.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (listToSort[j] < listToSort[j - 1]) {
                    SortHelper.swap(listToSort, j, j - 1);
                } else {
                    break;
                }
                SortHelper.print(listToSort);
            }
        }
    }

    // For Shell sort
    public static void modifiedInsertionSort(int[] listToSort, int startIndex, int increment) {
        for (int i = startIndex; i < listToSort.length; i = i + increment) {
            for (int j = Math.min(i + increment, listToSort.length - 1);
                 j - increment >= 0; j = j - increment) {
                if(listToSort[j] < listToSort[j-increment]) {
                    SortHelper.swap(listToSort, j, j - increment);
                } else {
                    break;
                }
                SortHelper.print(listToSort);
            }
        }
    }
}
