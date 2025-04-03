import java.util.HashMap;
import java.util.Map;

public class Leetcode389_findTheDifferenceHashMap {
    public static char findTheDifferenceHashMAp(String s, String t)
    {

        HashMap<Character,Integer> hm1= new HashMap<>();
        HashMap<Character,Integer> hm2= new HashMap<>();
        s=s.toLowerCase();
        t=t.toLowerCase();

        for( char c:s.toCharArray())
            hm1.put(c,hm1.getOrDefault(c,0)+1);

        for(  char c:t.toCharArray())
        {
            hm2.put(c,hm2.getOrDefault(c,0)+1);
        }
        for( Map.Entry<Character,Integer> m:hm1.entrySet())
        {
            if(hm2.containsKey(m.getKey()))
            {
                int value=m.getValue();
                hm2.put(m.getKey(),value-1);
                //     System.out.println(hm2); // Corrected print statement

            }
        }
        /*
        for( Map.Entry<Character,Integer> m:hm2.entrySet())
        {
          if(m.getValue()==1) System.out.println(m.getValue()+" " +m.getKey());

        }
        */
        for( char c: hm2.keySet())
            if(hm2.get(c)==1) return c;
        return ' ';
    }
    public static void main(String[] args) {

        String s = "abcd", t = "abcde";

        System.out.println(findTheDifferenceHashMAp (s,t));

    }
}
