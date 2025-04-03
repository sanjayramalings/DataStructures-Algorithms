import java.util.HashSet;

public class Leetcode409_LongestPalindoromeHashset {

    public static int LongestPalindoromeHasset(String str)
    {
        HashSet<Character> hm1= new HashSet<>();
        int length=0;
        for( char c:str.toCharArray())
        {
            if( hm1.contains(c)) {
                length += 2;
                hm1.remove(c);
            }
            else hm1.add(c);
        }
        if(!hm1.isEmpty())
            length++; //length++

        return length;
    }


    public static void main(String[] args) {
        String s = "abccccdd";
        System.out.println (LongestPalindoromeHasset (s));

    }
}
