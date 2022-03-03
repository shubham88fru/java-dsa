// Select an el and compare with
// all others. Continue this till
// last el.
public class SelectionSort {
    public static void selectionSort(int[] listToSort) {
        for (int i = 0; i < listToSort.length; i++) {
            for (int j = i + 1; j < listToSort.length; j++) {
                if (listToSort[i] > listToSort[j]) {
                    SortHelper.swap(listToSort, i, j);
                    SortHelper.print(listToSort);
                }
            }
        }
    }
}