public class KthMissingNo {

    public static void main(String[] args) {
        int[] arr = { 5, 6, 7, 8, 9 };
        int k = 9;

        System.out.println(findKthPositive(arr, k));
    }

    public static int findKthPositive(int[] arr, int k) {
        int low = 0,high = arr.length-1;

        while(low <= high)
        {
            int mid = (low + high) / 2;
            int missing = arr[mid] - (mid + 1);

            if(missing < k){
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }

        return k + high + 1;
    }
}
