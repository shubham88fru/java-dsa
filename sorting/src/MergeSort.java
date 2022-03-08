public class MergeSort {
    public static void mergeSort(int[] listToSort) {
        if (listToSort.length == 1) {
            return;
        }
        int midIndex = listToSort.length / 2 + listToSort.length % 2;
        int[] listFirstHalf = new int[midIndex];
        int[] listSecondHalf = new int[listToSort.length -  midIndex];
        SortHelper.split(listToSort, listFirstHalf, listSecondHalf);

        mergeSort(listFirstHalf);
        mergeSort(listSecondHalf);

        SortHelper.merge(listToSort, listFirstHalf, listSecondHalf);
        SortHelper.print(listToSort);
    }
}
