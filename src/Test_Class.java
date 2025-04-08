import java.util.Arrays;
import java.util.HashMap;

public class Test_Class {


    public static int binarySearchCheck(int [] num1,int target)
    {
        int left=0; int right=num1.length-1;
        while(left<=right)
        {
            int midpoint=left + (right - left) / 2; // 4 // 6 //5
            if(num1[midpoint]==target) return midpoint;
            if(num1[midpoint]<target) // 4<5 //6<5
                left=midpoint+1; // left=4 right =9
            else
                right=midpoint-1; // left=4 right =6
        }
        return -1;
    }

    public static int [] twosum(int [] nums,int target)
    {
        HashMap<Integer,Integer> IndexMap = new HashMap<> ();
        for(int i=0;i<nums.length;i++)
        {
            int complement = target-nums[i]; // 9-2 =7 9-7 =2
            if(IndexMap.containsKey (complement)) {
                return new int[]{i, IndexMap.get (complement)};
            }
            IndexMap.put(nums[i],i);
        }
return new int[]{};
    }


    public static void main(String [] Args)
    {
        int [] nums = {2,7,11,15};
        int target = 9;
       // System.out.println (binarySearchCheck(nums,target));
        System.out.println (Arrays.toString (twosum(nums,target)));


    }
}
