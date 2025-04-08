public class gfg_next_larger_element_brt {




    public static void nextLarger(int[] arr) {

        int len = arr.length;


        for (int i = 0; i < len; i++) { //second element(current)
            int j;
            // compare elements before seconds element (3,2) (3,1) (3,0) (3,-1)
            for (j = i+1; j <len; j++) {
                if (arr[j] > arr[i]) { // if previous element must be smaller than second element(current)
                    System.out.print (arr[j] + " ");
                    break;
                }
            }
            if(j==len)  System.out.print ("-1 ");


        }
    }
    public static void main (String[]args){

        int[] arr = {1, 3, 2, 4};
        nextLarger (arr);
          //  3, 4, 4, -1
    }


}
