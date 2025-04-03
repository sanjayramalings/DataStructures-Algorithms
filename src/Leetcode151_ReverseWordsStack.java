import java.util.Stack;

//https://leetcode.com/problems/reverse-words-in-a-string/description/

public class Leetcode151_ReverseWordsStack {




    public static String ReverseWordsStack(String s)
    {
        StringBuffer sb= new StringBuffer();
        Stack<String> hm1= new Stack<>();
        String[] words = s.trim ().split ("\\s+");

        for(String word:words)
        {
            hm1.push(word);
        }
        while (!hm1.isEmpty())
        {
            sb.append(hm1.pop()).append(" ");
        }
        return sb.toString().trim();

    }


    public static void main(String[] args) {

        String s = "  hello world  ";


        System.out.println (ReverseWordsStack(s));
    }

}

