public class EvenNoOfDigits {

    public static void main(String[] args) {
        int[] nums = {551,9011,412,1771};
        int evenno = findNumbers(nums);
        System.out.println(evenno);
    }
    public static int findNumbers(int[] nums)
    {
//        ********************************************MY APPROACH  **************************************************
//        int evenno=0,count;
//
//        for (int i = 0; i < nums.length; i++) {
//            count=0;
//            int n =nums[i];
//            while(n != 0 )
//            {
//                int rem = n%10;
//                if(rem>=0)
//                    count++;
//                n = n/10;
//            }
//            if(count % 2 == 0)
//                evenno++;
//
//        }
//        return evenno;
//        ********************************************OPTIMAL APPROACH  **************************************************
        int count=0;

        for (int num : nums) {

            if ((num > 9 && num < 100) || (num > 999 && num < 10000) || num == 100000) {
                count++;
            }
        }

        return count;
    }
}
