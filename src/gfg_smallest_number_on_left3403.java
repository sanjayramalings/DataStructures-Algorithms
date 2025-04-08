import java.util.List;
import java.util.Stack;


public class gfg_smallest_number_on_left3403 {


    public static void prevSmaller(int[] arr) {
        {
// 1 5 0 3 4 5
            // -1 1 -1 0 3 5
            // 1 6 3
            // -1 1 1
            Stack <Integer>stk= new Stack<> ();
            int len = arr.length;
            System.out.print ("-1 ");
            stk.push (-1);
            //second element
            for(int i=1;i<len;i++)
            {
                int j;
                // Look foe element on left of i
       //         int[] arr = {1, 5, 2, 3, 4, 5};
                    //-1 1 -1 0 3 4
                for( j=i-1;j>=0;j--) {
                   if (arr[j] < arr[i]) { //1 <5(1,0) break //5<2(2,1) //2<1(2,0) break //3
                       System.out.print (arr[j]+" ");
                       stk.push (arr[j]);
                       break;
                   }
               }
                   if(j==-1) {
                       System.out.print("-1 ");
                       stk.push (-1);
                   }

            }
        }



    }

    public static void main (String[]args){
        int[] arr = {1, 5, 2, 3, 4, 5};
        prevSmaller (arr);
    }
}
