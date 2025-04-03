import java.util.Arrays;

public class SerachMethods_BinarySearchcollection {
    public static int BinarySearchcollection(int [] nums, int target)
    {
        int num= Arrays.binarySearch(nums,target);
        return num;
    }
    public static void main(String[] args) {
        int[] num = {1, 3, 5, 7, 9, 11, 15, 19, 25};
        int target = 7;
        System.out.println (BinarySearchcollection (num, target));

    }
}
