class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int start =1,end = findMax(nums);

        while(start <= end)
        {
            int mid = (start+end)/2;
            int sum = calculateDivisorSum(nums,mid);

            if(sum <= threshold)
            {
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return start;
    }

    public int findMax(int[] nums)
    {
        int max = Integer.MIN_VALUE;
        for(int m : nums)
        {
            max = Math.max(max,m);
        }
        return max;
    }

    public int calculateDivisorSum(int[] nums,int divisor)
    {
        int sum =0;
        for(int s : nums)
        {
            sum += Math.ceil((double)s / (double)divisor);
        }

        return sum;
    }
}