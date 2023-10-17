public class MaxRepSub
{
    public static void main(String[] args) {
        String a = "ababc";
        String b = "ba";

        System.out.println(maxRepeating(a, b));
    }

    public static int maxRepeating(String sequence, String word) {
        int max = 0;

        StringBuilder sb = new StringBuilder(word);

        for(int i = 0; i < sequence.length(); i++) {

            if(sequence.contains(sb.toString())) {
                
                sb.append(word);
                max++;
            }
        }
        return max;
    }
}