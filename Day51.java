import java.util.Arrays;

public class SortByParity
{
    public static void main(String[] args) {
        int[] arr = {2,4,6,8,3,5,7,9};
        System.out.println(Arrays.toString(sortArrayByParity(arr)));
    }

    public static int[] sortArrayByParity(int[] nums) {
        
        int count =0;

        for(int i = 0;i<nums.length;i++)
        {
            if(nums[i] % 2 == 0)
            {
                int temp = nums[i];
                nums[i] = nums[count];
                nums[count++] = temp;
            }
        }
        return nums;
    }
}