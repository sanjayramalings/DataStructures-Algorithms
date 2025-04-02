import java.util.Arrays;
import java.util.HashSet;

public class intersectionHashSet {
    public static int[] intersectionHashSet(int[] nums1, int[] nums2)
    {
        HashSet<Integer> souceset= new HashSet<>();
        HashSet<Integer> finalset= new HashSet<>();

        for(int num:nums1) souceset.add(num);
        for( int num:nums2) if(souceset.contains(num)) finalset.add(num);
        int i=0;
        int []finalarr= new int[finalset.size()];
        for( int num:finalset) finalarr[i++]=num;
        return finalarr;

    }
    public static void main(String[] args) {

        int[] nums1 = {3, 1, 2, 1};
        int[] nums2 = {1, 1};
        System.out.println (Arrays.toString (intersectionHashSet(nums1, nums2)));

    }
}
