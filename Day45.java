class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int start = 1,end = findMax(piles); 

        while(start <= end)
        {
            int mid = (start+end)/2;
            int totalH = calculateTotalHours(piles,mid);

            if(totalH <= h)
            {
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }    

        return start;   
    }

    public int findMax(int[] piles)
    {
        int max = Integer.MIN_VALUE;
        for(int p : piles)
        {
            max = Math.max(max,p);
        }

        return max;
    }

    public int calculateTotalHours(int[] piles,int hourly)
    {
        int totalH = 0;
        for(int i =0;i<piles.length;i++)
        {
            totalH += Math.ceil((double)piles[i] / (double)hourly);
        }
        return totalH;
    }
}