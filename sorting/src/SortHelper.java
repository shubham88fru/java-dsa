// Helpers that are helpful
// in all kinds of sort.
public class SortHelper {
    public static void print(int[] listToSort) {
        for (int el: listToSort) {
            System.out.print(el + ",");
        }
        System.out.println();
    }

    public static void swap(int[] listToSort, int iIndex, int jIndex) {
        int temp = listToSort[iIndex];
        listToSort[iIndex] = listToSort[jIndex];
        listToSort[jIndex] = temp;
    }
}
