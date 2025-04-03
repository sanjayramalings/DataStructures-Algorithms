import java.util.HashMap;

public class Leetcode217_ContainsDuplicate {

    public static boolean containsDuplicate(int[] nums) {

        HashMap<Integer, Integer> hm1 = new HashMap<> ();
        boolean flag = true;
        for (int m : nums) {
            hm1.put (m, hm1.getOrDefault (m, 0) + 1);
        }
        for (int m : nums) {
            // 1 -2 2-1 3-1
            //hm1.get(key)= value
            //   System.out.println(m +" "+hm1.get(m) );

            if (hm1.get (m) >= 2) {
                flag = false;
            }
        }
        if (flag) return false;
        else return true;


    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        System.out.println ((containsDuplicate (nums)));
    }
}
