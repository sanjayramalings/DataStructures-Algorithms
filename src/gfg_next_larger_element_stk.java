import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class gfg_next_larger_element_stk {

    public static List<Integer> nextLargerstk(int[] arr) {
        Stack<Integer> stk = new Stack<>();
        List<Integer> arr_lst = new ArrayList<>();

        int len = arr.length;
        for (int i = len - 1; i >= 0; i--) {
            while (!stk.isEmpty() && stk.peek() <= arr[i]) {
                stk.pop();
            }
            if (stk.isEmpty()) {
                arr_lst.add(-1);
            } else {
                arr_lst.add(stk.peek());
            }
            stk.push(arr[i]);
        }

        Collections.reverse(arr_lst);
        return arr_lst;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 4};
        System.out.println(nextLargerstk(arr));
        // Output: [3, 4, 4, -1]
    }
}
