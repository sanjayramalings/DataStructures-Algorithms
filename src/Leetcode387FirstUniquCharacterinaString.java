import java.util.HashMap;

public class Leetcode387FirstUniquCharacterinaString {
    public static int firstUniqChar(String s) {
        StringBuffer sb1 = new StringBuffer ();
        HashMap<Character, Integer> hm1 = new HashMap<> ();
        for (char i : s.toCharArray ()) {
            hm1.put (i, hm1.getOrDefault (i, 0) + 1);
        }
        for (char i : s.toCharArray ()) {
            if (hm1.get (i) == 1) return s.indexOf (i);
        }
        return -1;

    }

    public static void main(String[] args) {

        String s = "llmeleetcode";

        System.out.println (firstUniqChar(s));
    }
}
