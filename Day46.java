import java.util.Arrays;

public class LongConsSeq {

    public static void main(String[] args) {

        int[] nums = {100,4,200,1,3,2};
        System.out.println(longestConsecutive(nums));
    }

    public static int longestConsecutive(int[] nums) {
        if(nums.length == 0)
            return 0;
        
        Arrays.sort(nums);
        int lastSmaller = Integer.MIN_VALUE;
        int count=0;
        int longest = 1;

        for(int i=0;i<nums.length;i++)
        {
            if(nums[i] - 1 == lastSmaller)
            {
                count++;
                lastSmaller = nums[i];
            }else if(nums[i] != lastSmaller){
                count = 1;
                lastSmaller = nums[i];
            }

            longest = Math.max(longest, count);
        }
        return longest;
    }
}
