import java.util.*;


//https://leetcode.com/problems/reverse-string/description/
public class Leetcode344RevereseString {
    public static String reverseString(char[] s)
    {
        StringBuffer sc = new StringBuffer();
        for(char c:s)
            sc.append(c);
        //    sc.reverse();
        char [] rv = new char[s.length];
        int len=s.length-1;
        int i=0;
        for(int j=len;j>=0;j--)
        {
            rv[i]=s[j];
            //   System.out.println(rv[i]);
            i++;
        }



        return sc.reverse().toString();
        //return rv.;

    }


public static void main(String[] args) {

    char[] s = {'h', 'e', 'l', 'l', 'o'};
    System.out.println (reverseString (s));
}}