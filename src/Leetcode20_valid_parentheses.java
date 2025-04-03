import java.util.Stack;

public class Leetcode20_valid_parentheses {

    public static boolean isValid(String s) {

        Stack<Character> stk = new Stack<> ();
        for( char c: s.toCharArray ()) {
            if (c == '{' || c == '(' || c == '[') stk.push (c);

            else {
                if (stk.isEmpty()) return false;
                char open = stk.pop ();
                if (c == '}' && open != '{') return false;
                if (c == ')' && open != '(') return false;
                if (c == ']' && open != '[') return false;
            }
        }
        return stk.isEmpty ();

    }
    public static void main(String [] args)
    {
        String s = "(([]))";
        System.out.println (isValid (s));

    }
}
