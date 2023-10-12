public class ArrayEqual {

    public static void main(String[] args) {

        String[] word1 = { "aab", "c" };
        String[] word2 = { "aa", "bc" };

        System.out.println(arrayStringsAreEqual(word1, word2));
    }

    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {

        StringBuilder a = new StringBuilder();
        StringBuilder b = new StringBuilder();

        for (int i = 0; i < word1.length; i++) {
            a.append(word1[i]);
        }

        for (int i = 0; i < word2.length; i++) {
            b.append(word2[i]);
        }

        return a.toString().equals(b.toString());
    }
}
