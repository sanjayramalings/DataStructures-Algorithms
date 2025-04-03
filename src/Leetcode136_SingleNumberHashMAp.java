import java.util.HashMap;

public class Leetcode136_SingleNumberHashMAp {

    public static int SingleIntegerHashmap(int[] nums) {
        //   Arrays.sort(nums);
        HashMap<Integer, Integer> hm1 = new HashMap<> ();
        for (int num : nums) {
            hm1.put (num, hm1.getOrDefault (num, 0) + 1);
        }
        for (int n : nums) {
            if (hm1.get (n) == 1) {
                return n;
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        int[] nums = {4,1,2,1,2};

        System.out.println ((SingleIntegerHashmap (nums)));
    }
}
