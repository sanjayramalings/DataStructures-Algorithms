import java.util.Stack;

public class Leetcode150_Reverse_RPN {


    public static int evalRPN(String[] tokens)
    {
        Stack<Integer> stk = new Stack<> ();
        int sum = 0;
        for (String token : tokens) {
            if (IsOperator (token)) {
                int b = stk.pop ();
                int a = stk.pop ();
                //  String Operator = token;
                int result = CalcResultforOperand (a, b, token);
                stk.push (result);
            }
            else stk.push (Integer.parseInt (token));

        }
        return stk.pop (); // Final result at the top of the stack

    }
    private static boolean IsOperator(String token)
    {
        if(token.equals ("+") || token.equals ("-") || token.equals ("*") || token.equals ("/"))
        {
            return true;
        }
        return false;
    }
    private static int CalcResultforOperand(int a,int b,String Operator)
    {
        switch (Operator) {
            case ("+"):
                return a + b;
            case ("-"):
                return a - b;
            case ("*"):
                return a * b;
            case ("/"):
                return a / b;
            default:return -1;
        }

    }




    public static void main(String[] args) {
        String[] tokens = {"10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"};
        // 21 + 3*/ 2+1 =3 * 3 =9
      System.out.println (evalRPN (tokens));
    }
    }

