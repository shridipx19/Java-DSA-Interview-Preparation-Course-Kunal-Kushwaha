import java.util.ArrayList;

public class Subsequences {
    public static void main(String[] args) {
        String text = "abc";
        System.out.println(subseqArraylist("",text));
    }
    static void subseq( String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        subseq(p+ch,up.substring(1));
        subseq(p,up.substring(1));

    }

    static ArrayList<String> subseqArraylist(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list ;
        }
        char ch = up.charAt(0);
        ArrayList<String> left = subseqArraylist(p+ch,up.substring(1));
        ArrayList<String> right = subseqArraylist(p,up.substring(1));
        left.addAll(right);
        return left;
    }
}
