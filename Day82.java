public class ContainMostWater
{
    public static void main(String[] args) {
        
        int[] height = {6,4,2,5,4,6,1,3,5};
        System.out.println(maxArea(height));

    }

    public static int maxArea(int[] height) {
        
        int ans = 0,prevmin=0,left=0,right=height.length-1,min = 0;

        while (left != right) 
        {
            min = Math.min(height[left], height[right]);
            if(min > prevmin)
            {
                int len = right - left;
                int temp = len * min;
                ans = Math.max(ans, temp);
            }
            if(height[left] > height[right])
            {
                right--;
            }else{
                left++;
            }

            prevmin = min;
        }
        return ans;
    }
}