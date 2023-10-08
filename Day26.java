

public class RotateArray
{
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        int  k = 4;
        rotate(nums, k);
    }

    public static void rotate(int[] nums, int k) {
        k %= nums.length;
        if (k == 0) return;
        reverse(0, nums.length-1, nums);
        reverse(0, k-1, nums);
        reverse(k, nums.length-1, nums);
    }
    
    private static void reverse(int start, int end, int[] nums){        
        while(start < end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}