//https://leetcode.com/problems/reverse-words-in-a-string/description/

public class Leetcode151_ReverseWordsString {

    public static String ReverseWordsString(String s) {
        String[] words = s.trim ().split ("\\s+");
        StringBuffer sb = new StringBuffer ();
        int len = words.length - 1;
        for (int i = len; i >= 0; i--) {
            sb.append (words[i]);
            if (i > 0) sb.append (' ');
            //sb.append(' ');
        }
        return sb.toString ();

        //return sb.toString().trim();
    }

    public static void main(String[] args) {

        String s = "  hello world  ";


        System.out.println (ReverseWordsString (s));
    }

}