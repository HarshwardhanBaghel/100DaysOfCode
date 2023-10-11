public class RomanIntegers {
    public static void main(String[] args) {
        String s = "LVIII";
        System.out.println(romanToInt(s));

    }

    // I can be placed before V (5) and X (10) to make 4 and 9.
    // X can be placed before L (50) and C (100) to make 40 and 90.
    // C can be placed before D (500) and M (1000) to make 400 and 900.
    public static int romanToInt(String s) {
        int ans = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            switch (c) {
                case 'I':
                    if (i <= s.length() - 2 && (s.charAt(i + 1) == 'V')) {
                        ans += 4;
                        i++;
                    } else if (i <= s.length() - 2 && (s.charAt(i + 1) == 'X')) {
                        ans += 9;
                        i++;
                    } else {
                        ans += 1;
                    }
                    break;
                case 'V':
                    ans += 5;
                    break;
                case 'X':
                    if (i <= s.length() - 2 && (s.charAt(i + 1) == 'L')) {
                        ans += 40;
                        i++;
                    } else if (i <= s.length() - 2 && (s.charAt(i + 1) == 'C')) {
                        ans += 90;
                        i++;
                    } else {
                        ans += 10;
                    }
                    break;
                case 'L':
                    ans += 50;
                    break;
                case 'C':
                    if (i <= s.length() - 2 && (s.charAt(i + 1) == 'D')) {
                        ans += 400;
                        i++;
                    } else if (i <= s.length() - 2 && (s.charAt(i + 1) == 'M')) {
                        ans += 900;
                        i++;
                    } else {
                        ans += 100;
                    }
                    break;
                case 'D':
                    ans += 500;
                    break;
                case 'M':
                    ans += 1000;
                    break;

            }
        }
        return ans;
    }
}