public class ShellSort {
    public static void shellSort(int [] listToSort) {
        int increment = listToSort.length / 2;
        while (increment >= 1) {
            for (int startIndex = 0; startIndex < increment; startIndex++) {
                InsertionSort.modifiedInsertionSort(listToSort, startIndex, increment);
            }
            increment = increment / 2;
        }
    }
}
