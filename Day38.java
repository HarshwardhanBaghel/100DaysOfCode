
public class FindMinInSortedArray {

    public static void main(String[] args) {

        int[] nums = { 3, 1, 2 };
        int a = findMin(nums);
        System.out.println(nums[a]);
    }

    public static int findMin(int[] nums) {

        int start = 0;
        int end = nums.length - 1;
        int ans = Integer.MAX_VALUE;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (nums[start] <= nums[mid]) {
                ans = Math.min(ans, nums[start]);
                start = mid + 1;
            } else {
                end = mid - 1;
                ans = Math.min(ans, nums[mid]);
            }
        }
        return ans;
    }
}
