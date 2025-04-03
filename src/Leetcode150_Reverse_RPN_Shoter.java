import java.util.Stack;

public class Leetcode150_Reverse_RPN_Shoter {



    public static int evalRPN(String[] tokens)
    {
        Stack<Integer> stk = new Stack<> ();
        for (String token : tokens) {
            if ("+/-*".contains(token)) {
                int b = stk.pop ();
                int a = stk.pop ();
                //  String Operator = token;
                int result=0;
                switch (token) {
                    case "+" : result=a + b;break;
                    case "-" : result=a - b;break;
                    case "*" : result=a * b;break;
                    case "/" : result= a / b;break;
                }
                stk.push (result);
            }
            else stk.push (Integer.parseInt (token));

        }
        return stk.pop (); // Final result at the top of the stack

    }


    public static void main(String[] args) {
        String[] tokens = {"10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"};
        // 21 + 3*/ 2+1 =3 * 3 =9
        System.out.println (evalRPN (tokens));
    }
}
