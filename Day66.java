class Solution {
    public int[] buildArray(int[] nums) {
        
     int[] output = new int [nums.length];
        
        for (int i = 0; i <= nums.length - 1; i++) 
        {
            output[i] = nums[nums[i]];
        }
        
        return output;  
    }
}