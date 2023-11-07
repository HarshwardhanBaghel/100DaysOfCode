public class LongestCommonPrefix {

    public static void main(String[] args) {

        String[] strs = { "flower", "flow", "flight" };
        // System.out.println(strs[0].length());
        System.out.println(longestCommonPrefix(strs));
    }

    public static String longestCommonPrefix(String[] strs) {

        String prefix = strs[0];

        for (int index = 1; index < strs.length; index++) {

            while (strs[index].indexOf(prefix) != 0) {
                System.out.println(strs[index].indexOf(prefix));

                prefix = prefix.substring(0, prefix.length() - 1);
            }
        }
        return prefix;

    }
}
