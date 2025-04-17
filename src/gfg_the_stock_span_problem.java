import java.util.ArrayList;
import java.util.Stack;

public class gfg_the_stock_span_problem {

    public static ArrayList<Integer> stk_span(int [] arr)
    {
        ArrayList<Integer> lst_arr= new ArrayList<>();
        Stack<Integer> stk= new Stack<>();
        int len=arr.length;
        for(int i=0;i<len;i++)
        { // check current element with previous_elemet removes value previous element is greater than
            //current element
            while (!stk.isEmpty() && arr[i]>=arr[stk.peek()])
            {
                stk.pop();
            }
            if(stk.isEmpty())
            {
                lst_arr.add(i,i+1);
            }
            else {
                lst_arr.add(i,(i-stk.peek()));
            }
            stk.push(i);
        }

/**
 for (int i = 0; i < len; i++) {
 int count = 1; // Span starts with 1 (current day)
 while (!stack.isEmpty() && arr[i] >= stack.peek()) {
 stack.pop();
 count++;
 }
 span.add(count);
 stack.push(arr[i]);
 }
 **/
        return lst_arr;
    }
    public static void main(String[] args) {

        int[] arr = {10, 4, 5, 90, 120, 80};
        System.out.println(stk_span(arr));

    }
}