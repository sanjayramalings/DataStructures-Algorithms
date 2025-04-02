import java.util.HashMap;
import java.util.*;

public class Leetcode1TwoSum {

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hm1 = new HashMap<> ();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];//9-2=7 ,9-7=2
            if (hm1.containsKey (complement)) //check if complelent is present as a key // check 7 is preseneno// contains 2
                return new int[]{hm1.get (complement), i};//found solution//,1

            hm1.put (nums[i], i);//2,0
        }
        return new int[]{};
    }

    public static void main(String[] args) {
       int [] nums = {2,7,11,15};
        int target = 9;
         System.out.println(Arrays.toString(twoSum(nums, target)));

    }
}