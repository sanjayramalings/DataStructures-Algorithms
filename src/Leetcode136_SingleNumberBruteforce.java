public class Leetcode136_SingleNumberBruteforce {



    public static int SingleIntegerBruteForce(int[] nums)
    {
        for (int i = 0; i < nums.length; i++) {
            boolean isSingle = true;
            for (int j = 0; j < nums.length; j++) {
                if (i != j && nums[i] == nums[j]) {
                    isSingle = false;
                    break;
                }
            }
            if (isSingle) {
                return nums[i];
            }
        }
        return -1; // Should never happen if input is valid
    }

    public static void main(String[] args) {
        int[] nums = {4,1,2,1,2};


         System.out.println((SingleIntegerBruteForce(nums)));
    }
}





