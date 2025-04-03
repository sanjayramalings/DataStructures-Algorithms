import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Leetcode349_intersectionoftwoarraysHashMap2 {
    public static int[] intersectionHashthree(int[] nums1, int[] nums2)
    {
        //HashMap<Integer,Integer> hm1 = new HashMap<>();
        HashMap<Integer,Integer> hm1= new HashMap<>();
        HashMap<Integer,Integer> hm2= new HashMap<>();
        ArrayList<Integer> arr= new ArrayList<>();

        //495     // 949428
        for( int num:nums1) hm1.put(num,hm1.getOrDefault(num,0)+1);
        for( int num:nums2) hm2.put(num,hm2.getOrDefault(num,0)+1);
        for(Map.Entry<Integer,Integer> m:hm1.entrySet())
        {
            // 495
            //9494
            int key=m.getKey();
            int val=m.getValue();
            if(hm2.containsKey(key) )
            {
                arr.add(key);
            }
        }

        int i=0;
        int [] finalarr= new int[arr.size()];
        for( int num:arr) finalarr[i++]=num;
        return finalarr;


    }
    public static void main(String[] args) {

        int[] nums1 = {3, 1, 2, 1};
        int[] nums2 = {1, 1};
        System.out.println (Arrays.toString (intersectionHashthree(nums1, nums2)));

    }
}
