class Solution {
    public int shipWithinDays(int[] weights, int days) {

       int start = Integer.MIN_VALUE, end = 0;
        for (int i = 0; i < weights.length; i++) {
            end += weights[i];
            start = Math.max(start, weights[i]);
        }

        while(start <= end)
        {
            int mid = (start + end )/2;
            int numberOfDays = findDays(weights,mid);

            if(numberOfDays <= days)
            {
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
    return start;
    }

    public int findDays(int[] weights,int cap)
    {
        int days = 1;
        int load = 0;
        
        for(int i =0;i<weights.length;i++)
        {
            if(load + weights[i] > cap)
            {
                days += 1;
                load = weights[i];
            }else{
                load += weights[i];
            }
        }
        return days;
    }
   
}