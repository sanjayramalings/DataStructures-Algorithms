
import java.util.*;


//https://leetcode.com/problems/reverse-string/description/
public class Leetcode344RevereseStringStack {

    public  static void reverseStringStack(char[] s)
    {
        Stack<Character> hm1 = new Stack<>();
        for( char c:s)
            hm1.push(c);
      //  int i=0;

        for( int i=0;i<s.length;i++) {
            s[i] = hm1.pop();
        }

        int len=s.length-1;

/**
        while(len>=0) {
            s[i] = hm1.pop();
            len--;
            i++;
        }
 **/
    }


    public static void main(String[] args) {

        char[] s = {'h', 'e', 'l', 'l', 'o'};
        reverseStringStack(s);
       System.out.println(new String(s));

    }
}
