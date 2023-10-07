

public class DuplicateNumber {

    public static void main(String[] args) {
        int[] arr = { 3, 1, 3, 4, 2 };
        System.out.println(findDuplicate(arr));
    }

    public static int findDuplicate(int[] arr) {
        int i = 0;

        while (i < arr.length) {
            int correct = arr[i] - 1;

            if (arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }

        int ans = 0;
        for (int j = 0; j < arr.length; j++) {
            if(arr[j] != j+1)
            {
                ans = arr[j];
                break;
            }
        }
        return ans;
    }

    public static void swap(int[] arr, int first, int second) {
        int temp = arr[second];
        arr[second] = arr[first];
        arr[first] = temp;
    }
}
