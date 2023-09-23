import java.util.Arrays;

public class ValidAnagram {
    public static void main(String[] args) {

        String s = "rat";
        String t = "car";
        boolean ans = isAnagram(s, t);
        System.out.println(ans);
    }

    public static boolean isAnagram(String s, String t) {
        // if (s.length() != t.length()) {
        //     return false;
        // }
        // char[] s1 = s.toCharArray();
        // char[] s2 = t.toCharArray();
        // Arrays.sort(s1);
        // Arrays.sort(s2);

        // for (int i = 0; i < s1.length; i++) {
        //     if (s1[i] != s2[i]) {
        //         return false;
        //     }
        // }
        // return true;

        char[] s1 = s.toCharArray();
        char[] s2 = t.toCharArray();
        Arrays.sort(s1);
        Arrays.sort(s2);

        return Arrays.equals(s1,s2);
    }
}