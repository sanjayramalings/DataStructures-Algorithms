//https://leetcode.com/problems/reverse-string/description/

public class Leetcode344_RevereseStringFunc {

     public static void funcreverseStringvoid(char[] s)
     {
     int left=0,right=s.length-1;

     while(left<=right)
     {
     char temp=s[left];
     s[left]=s[right];
     s[right]=temp;
     left++;
     right--;
     }// this program will not run because there are two void in this program
     }


     public static void main(String[] args) {

          char[] s = {'h', 'e', 'l', 'l', 'o'};
          funcreverseStringvoid(s);
          System.out.println(new String(s));

     }
}
