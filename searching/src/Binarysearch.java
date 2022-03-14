public class Binarysearch {
    public static int binarySearch(int [] sortedList, int number) {
        int min = 0;
        int max = sortedList.length - 1;
        while (min<=max) {
            int mid = min + (max-min)/2;
            if (sortedList[mid] == number) return mid;
            if (sortedList[mid]>number) {
                max = mid - 1;
            } else {
                min = mid + 1;
            }
        }
        return -1;
    }
}
