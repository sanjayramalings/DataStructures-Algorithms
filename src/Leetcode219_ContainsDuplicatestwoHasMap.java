import java.util.HashMap;

public class Leetcode219_ContainsDuplicatestwoHasMap {

    public static boolean ContainsDuplicatestwoHashMap(int [] nums1,int target)
    {
        HashMap<Integer,Integer> hm1= new HashMap<>();
        for( int i=0;i<nums1.length;i++) //2334 2,0 3,0 ,3
        {
            if ( hm1.containsKey(nums1[i]))
            {
                int j=hm1.get(nums1[i]);
                if( Math.abs(i-j)<=target) return true;
            }
            hm1.put(nums1[i],i);
        }
        return false;
    }
    public static void main(String[] args) {

        int[] nums1 = {1, 2, 3, 1};
        int target = 3;

        System.out.println (ContainsDuplicatestwoHashMap (nums1, target));

    }
}
