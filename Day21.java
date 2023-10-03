import java.util.Arrays;

public class ConcatArray {
    public static void main(String[] args) {

        int[] nums = { 1,3,2,1};
        int[] ans = getConcatenation(nums);

        System.out.println(Arrays.toString(ans));

    }

    public static int[] getConcatenation(int[] nums) {
        int[] ans = new int[nums.length*2];
        int n=nums.length;
        for(int i=0;i<nums.length;i++){
            ans[i]=nums[i];
            ans[i+n]=nums[i];
        }
        return ans;
    }
}