public class SearchInsertPosition {

    public static void main(String[] args) {

        int[] arr = { 1, 3, 5, 6 };
        int target = 7;
        int ans = ceilSearch(arr, target);
        System.out.println(ans);
    }

    static int ceilSearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int middle = start + (end - start) / 2;
            if (target > arr[middle]) {
                start = middle + 1;
            } else if (target < arr[middle]) {
                end = middle - 1;
            } else {
                return middle;
            }
        }
        return start;
    }
}
