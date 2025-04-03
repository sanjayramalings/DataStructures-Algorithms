import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Leetcode349_intersectionoftwoarraysHasMap {
    public static int[] intersectionHasMap(int[] nums1, int[] nums2) {

        HashMap<Integer, Integer> hm1 = new HashMap<> ();
        HashMap<Integer, Integer> hm2 = new HashMap<> ();
        ArrayList<Integer> arr = new ArrayList<> ();


        for (int num : nums1) hm1.put (num, hm1.getOrDefault (num, 0) + 1);
        //1221
        for (int num : nums2) hm2.put (num, hm2.getOrDefault (num, 0) + 1);
        // 22
        for (int num : hm2.keySet ()) {
            if (hm1.containsKey (num)) {
                arr.add (num);
            }
        }

        int[] finalarr = new int[arr.size ()];
        //   System.out.println(arr.toString());

/*        for( int i=0;i<arr.size();i++)
        {
            finalarr[i]=arr.get(i);
        }
*/
        int i = 0;
        for (int num : arr) finalarr[i++] = num;
        return finalarr;


    }

    public static void main(String[] args) {

        int[] nums1 = {3, 1, 2, 1};
        int[] nums2 = {1, 1};
        System.out.println (Arrays.toString (intersectionHasMap(nums1, nums2)));

    }
}