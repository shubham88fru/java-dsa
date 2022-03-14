public class QuickSort {
    public static int partition(int [] listToSort, int low, int high) {
        int pivot = listToSort[low];
        int l = low;
        int h = high;
        while(l < h) {
            while(listToSort[l] <= pivot && l < h) {
                l++;
            }
            while(listToSort[h]>pivot) {
                h--;
            }
            if (l<h) {
                SortHelper.swap(listToSort, l, h);
            }
        }
        SortHelper.swap(listToSort, low, h);
        System.out.println("PIVOT: "+pivot);
        SortHelper.print(listToSort);
        return h;
    }

    public static void quickSort(int [] listToSort, int low, int high) {
        if (low >= high) {
            return;
        }
        int pivotIndex = partition(listToSort, low, high);
        quickSort(listToSort, low, pivotIndex - 1);
        quickSort(listToSort, pivotIndex + 1, high);
    }
}
