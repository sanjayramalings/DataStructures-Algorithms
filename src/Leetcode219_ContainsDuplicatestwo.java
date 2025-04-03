public class Leetcode219_ContainsDuplicatestwo {

    public static boolean ContainsDuplicatestwo(int[] nums1, int target) {
        Boolean flag = false;
        int k = target;
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums1.length; j++)
                if (i != j) {
                    if (nums1[i] == nums1[j] && Math.abs (i - j) <= k) flag = true;
                }
        }
        return flag;
    }

    public static void main(String[] args) {

        int[] nums1 = {1, 2, 3, 1};
        int target = 3;

        System.out.println (ContainsDuplicatestwo (nums1, target));

    }
}
