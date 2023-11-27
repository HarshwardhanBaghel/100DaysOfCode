class Solution {
    public int findNonMinOrMax(int[] nums) {
       
        var min = Integer.MAX_VALUE;
        var max = Integer.MIN_VALUE;
        
        for (var n : nums) {
            
            min = Math.min(min, n);

            max = Math.max(max, n);
        }

        for (var n : nums)
        {
            if (n != min && n != max)
                return n;
        }
        
        return -1;
    }
}