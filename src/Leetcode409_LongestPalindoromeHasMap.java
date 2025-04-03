import java.util.HashMap;

public class Leetcode409_LongestPalindoromeHasMap {

    public static int LongestPalindoromeHasMap(String str)
    {
        HashMap<Character,Integer> hm1= new HashMap<>();
        int length=0;
        boolean hasOdd= false;
        for (char c:str.toCharArray())
        {
            hm1.put(c, hm1.getOrDefault(c,0)+1);
        }
        // a 4 b 2 c 5 d1 e 2= 14
        for (int count:hm1.values())
        {
            // Taake a;; even pairs
            if(count%2==0) length+=count;
                // 4 +2+2=8
            else
                length+=count-1;
            hasOdd=true;

            // 0+ 4
            //8+4 =13

        }
        if(hasOdd)  length+=1;
        return length;
    }

    public static void main(String[] args) {
        String s = "abccccdd";
        System.out.println (LongestPalindoromeHasMap (s));

    }
}
