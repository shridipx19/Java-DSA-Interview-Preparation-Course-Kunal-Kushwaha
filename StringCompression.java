

public class StringCompression {
    public static void main(String[] args) {
        String S = "aaabcccd";

        System.out.println(compressed(S));
    }

    static String compressed(String s) {
        int i = 0;
        String news = "";
        while (i < s.length()) {
            int j = i;
            while (j < s.length() && (s.charAt(i) == s.charAt(j))) {
                j++;
            }
            if (j > 1) {
                news += j + "";
                j = 0;
            } else
                news += s.charAt(i) + " ";
        }
        return news;
    }
}



