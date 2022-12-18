public class RecursionStrings {
    public static void main(String[] args) {
        String s = "baappad";
        System.out.println(skipAppNotApple(s));


    }

    static void skipA(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        if (ch == 'a') {
            skipA(p, up.substring(1));
        } else
            skipA(p + ch, up.substring(1));
    }

    // return a string
    static String skipA(String s) {
        if (s.isEmpty()) {
            return "";
        }
        char ch = s.charAt(0);
        if (ch == 'a') {
            return skipA(s.substring(1));
        } else {
            return skipA(ch + s.substring(1));
        }

    }

    // remove apple from the string
    static String removeApple(String s) {
        if (s.isEmpty()) {
            return s;
        }
        char ch = s.charAt(0);
        if (s.startsWith("apple")) {
            return removeApple(s.substring(5));
        } else
            return ch + removeApple(s.substring(1));
    }

    // skip appNotApple
    static String skipAppNotApple(String s) {
        if (s.isEmpty()) {
            return "";
        }
        if (s.startsWith("app") && !s.startsWith("apple")) {
            return skipAppNotApple(s.substring(3));
        } else {
            return s.charAt(0) + skipAppNotApple(s.substring(1));
        }
    }

}
