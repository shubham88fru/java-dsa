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

    // For merge sort
    public static void split(int[] listToSort, int[] listFirstHalf,
                             int[] listSecondHalf) {
        int index = 0;
        int secondHalfStartIndex = listFirstHalf.length;
        for (int elements : listToSort) {
            if (index < secondHalfStartIndex) {
                listFirstHalf[index] = listToSort[index];
            } else {
                listSecondHalf[index - secondHalfStartIndex] =
                        listToSort[index];
            }
            index++;
        }
    }

    public static void merge(int[] listToSort, int[] listFirstHalf,
                             int[] listSecondHalf) {
        int mergeIndex =  0;
        int firstHalfIndex = 0;
        int secondHalfIndex = 0;
        while(firstHalfIndex < listFirstHalf.length &&
        secondHalfIndex < listSecondHalf.length) {
            if (listFirstHalf[firstHalfIndex] < listSecondHalf[secondHalfIndex]) {
                listToSort[mergeIndex] = listFirstHalf[firstHalfIndex];
                firstHalfIndex++;
            } else if (secondHalfIndex < listSecondHalf.length) {
                listToSort[mergeIndex] = listSecondHalf[secondHalfIndex];
                secondHalfIndex++;
            }
            mergeIndex++;
        }
        if (firstHalfIndex < listFirstHalf.length) {
            while(mergeIndex < listToSort.length) {
                listToSort[mergeIndex++] = listFirstHalf[firstHalfIndex++];
            }
        }
        if (secondHalfIndex < listSecondHalf.length) {
            while(mergeIndex < listToSort.length) {
                listToSort[mergeIndex++] = listSecondHalf[secondHalfIndex++];
            }
        }
    }
}
