import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class gfg_smallest_number_on_left_brt {

    public static List prevSmaller(int[] arr) {
        List<Integer> arrlst= new ArrayList<> ();
        Stack<Integer> stk= new Stack<> ();
        for( int i=0;i<arr.length;i++)
        {                           // 3 >4 , 4>5 ,2 >5 (-1) ,
            while(!stk.isEmpty ()&& stk.peek ()>=arr[i])
            {
                stk.pop ();
            }

            if(stk.isEmpty ()) {
             //   System.out.print ("-1 ");
                arrlst.add (-1);

            }
            else {
              //  System.out.print (stk.peek ()+" ");
                arrlst.add (stk.peek ());
            }


            stk.push (arr[i]);
        }
return arrlst;
    }



    public static void main (String[]args){
        int[] arr = {1, 3, 0, 2, 5};
      System.out.println ((prevSmaller (arr)));
    }

}
