public class Leetcode389_findTheDifference {

    public static char findTheDifference(String s, String t)
    {
        int sum_one=0;
        int sum_two=0;

        for (char c : s.toCharArray())
        {
            sum_one +=c;
        }
        for (char c : t.toCharArray())
        {
            sum_two +=c;
        }
        char c = (char)(sum_two-sum_one);
        return c;
    }
    public static void main(String[] args) {

          String s = "abcd", t = "abcde";

        System.out.println(findTheDifference(s,t));

    }
}
