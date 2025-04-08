import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class gfg_next_larger_element_stk {



    public static List nextLargerstk(int[] arr) {

        Stack<Integer> stk= new Stack<> ();
        List<Integer> arr_lst= new ArrayList<> ();
        int len=arr.length;
        for(int i=len-1; i<=0;i--)
        {
            while(!stk.isEmpty ()&&stk.peek ()<=arr[i])
            {
                stk.pop ();
            }
            if(stk.isEmpty()) {
                arr_lst.add (-1);
            }


            stk.push (arr[i]);
        }
    }

    public static void main (String[]args){

        int[] arr = {1, 3, 2, 4};
        System.out.println (nextLargerstk (arr));
        //  3, 4, 4, -1
    }
}
