public class BinarySearch {

    public static int BinarySearch(int [] nums, int target)
    {
        int left=0; int right=nums.length-1;
        while(left<=right)
        {
            int midpoint=left+(right-left)/2;
            if(nums[midpoint]==target) return midpoint;
            else if (nums[midpoint]<target)  // 15<19 check right
            {
                left=midpoint+1;
            }
            else right=midpoint-1;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 7, 9, 11, 15, 19, 25};
        int target = 7;
        System.out.println (BinarySearch (nums, target));

    }
}
