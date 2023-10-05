import java.util.Arrays;

public class SetMismatch {
    
    public static void main(String[] args) {
        int[] arr = {1,1};
        int[] a = findErrorNums(arr);
        System.out.println(Arrays.toString(a));
    }

    static int[] findErrorNums(int[] arr) {
        int i=0;
        int[] a = {-1,-1};
        while (i < arr.length) {
            if (arr[i] != i + 1) {
                int correct = arr[i] - 1;
                if (arr[i] != arr[correct]) {
                    swap(arr, i , correct);
                } else {
                    a[0] = arr[i];
                    a[1] = i+1;
                    i++;
                }
            } else {
                i++;
            }
        }
        

        return a;

    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
