import java.util.Arrays;

public class MajorityElement {

    public static void main(String[] args) {
        int[] arr = { 2,2,1,1,1,2,2,3,3,3,3,3,3,3,3,3};
        int ans = majorityElement(arr);
        System.out.println(ans);
    }

    public static int majorityElement(int[] nums) {

       Arrays.sort(nums);
        int n = nums.length;
        return nums[n/2];
        
        // ***********************************--------MyApproach-------*********************************
    //     int[] arr = { -1, -1 };

    //     for (int i = 0; i < nums.length; i++) {
    //         int count = 0;
    //         int j = i + 1;
    //         while (j < nums.length) {
    //             if (nums[j] == arr[0]) {
    //                 j++;
    //                 continue;
    //             }
    //             if (nums[j] == nums[i]) {

    //                 count++;

    //             }
    //             j++;
    //         }

    //         if (count > arr[1]) {
    //             arr[0] = nums[i];
    //             arr[1] = count;
    //         }
    //     }
    //     return arr[0];
    // }
    }
}
