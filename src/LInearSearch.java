public class LInearSearch {
    public static int LinearSearch(int[] nums, int target) {
        int len = nums.length - 1;
        for (int i = 0; i <= len; i++) {
            if (nums[i] == target) {
                return i;
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 7, 9, 11, 15, 19, 25};
        int target = 11;
        System.out.println (LinearSearch (nums, target));

    }
}
