import java.util.*;


public class AllinOne {

    public static int SingleIntegerHashmap(int[] nums)
    {
        //   Arrays.sort(nums);
        HashMap<Integer,Integer> hm1= new HashMap<>();
        for (int num : nums) {
            hm1.put(num, hm1.getOrDefault(num,0) + 1);
        }
        for( int n: nums)
        {
            if(hm1.get(n)==1)
            {
                return n;
            }
        }
        return -1;

    }
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
    public static boolean containsDuplicate(int[] nums)
    {

        HashMap<Integer, Integer> hm1 = new HashMap<>();
        boolean flag = true;
        for (int m : nums) {
            hm1.put(m, hm1.getOrDefault(m, 0) + 1);
        }
        for (int m : nums) {
            // 1 -2 2-1 3-1
            //hm1.get(key)= value
            //   System.out.println(m +" "+hm1.get(m) );

            if (hm1.get(m) >= 2) {
                flag = false;
            }
        }
        if (flag) return false;
        else return true;


    }
    public static int[] twoSum(int[] nums,int target)
    {
        HashMap <Integer,Integer> hm1= new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            int complement=target-nums[i];//9-2=7 ,9-7=2
            if(hm1.containsKey(complement)) //check if complelent is present as a key // check 7 is preseneno// contains 2
                return new int [] {hm1.get(complement),i};//found solution//,1

            hm1.put(nums[i],i);//2,0
        }
        return new int[]{};
    }
    public static int firstUniqChar(String s)
    {
        StringBuffer sb1= new StringBuffer();
        HashMap<Character,Integer> hm1= new HashMap<>();
        for( char i:s.toCharArray())
        {
            hm1.put(i,hm1.getOrDefault(i,0)+1);
        }
        for( char i:s.toCharArray())
        {
            if(hm1.get(i)==1) return s.indexOf(i);
        }
        return -1;

    }
    public static int[] intersectionHasMap(int[] nums1, int[] nums2)
    {

        HashMap<Integer,Integer> hm1= new HashMap<>();
        HashMap<Integer,Integer> hm2= new HashMap<>();
        ArrayList<Integer> arr= new ArrayList<>();



        for( int num:nums1) hm1.put(num,hm1.getOrDefault(num,0)+1);
        //1221
        for( int num:nums2) hm2.put(num,hm2.getOrDefault(num,0)+1);
        // 22
        for( int num:hm2.keySet())
        {if(hm1.containsKey(num)) {arr.add(num);}}

        int [] finalarr = new int[arr.size()];
        //   System.out.println(arr.toString());

/*        for( int i=0;i<arr.size();i++)
        {
            finalarr[i]=arr.get(i);
        }
*/
        int i=0;
        for(int num :arr) finalarr[i++]=num;
        return  finalarr;




    }
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
    public static char findTheDifference(String s, String t)
    {
        int sum_one=0;
        int sum_two=0;

        for (char c : s.toCharArray())
        {
            sum_one +=c;
        }
        for (char c : t.toCharArray())
        {
            sum_two +=c;
        }
        char c = (char)(sum_two-sum_one);
        return c;
    }
    public static char findTheDifferencetwo(String s, String t)
    {

        HashMap<Character,Integer> hm1= new HashMap<>();
        HashMap<Character,Integer> hm2= new HashMap<>();
        s=s.toLowerCase();
        t=t.toLowerCase();

        for( char c:s.toCharArray())
            hm1.put(c,hm1.getOrDefault(c,0)+1);

        for(  char c:t.toCharArray())
        {
            hm2.put(c,hm2.getOrDefault(c,0)+1);
        }
        for( Map.Entry<Character,Integer> m:hm1.entrySet())
        {
            if(hm2.containsKey(m.getKey()))
            {
                int value=m.getValue();
                hm2.put(m.getKey(),value-1);
                //     System.out.println(hm2); // Corrected print statement

            }
        }
        /*
        for( Map.Entry<Character,Integer> m:hm2.entrySet())
        {
          if(m.getValue()==1) System.out.println(m.getValue()+" " +m.getKey());

        }
        */
        for( char c: hm2.keySet())
            if(hm2.get(c)==1) return c;
        return ' ';
    }
    public static int[] intersectionHasMapthree(int[] nums1, int[] nums2)
    {
        //HashMap<Integer,Integer> hm1 = new HashMap<>();
        HashMap<Integer,Integer> hm1= new HashMap<>();
        HashMap<Integer,Integer> hm2= new HashMap<>();
        ArrayList<Integer> arr= new ArrayList<>();

        //495     // 949428
        for( int num:nums1) hm1.put(num,hm1.getOrDefault(num,0)+1);
        for( int num:nums2) hm2.put(num,hm2.getOrDefault(num,0)+1);
        for(Map.Entry<Integer,Integer> m:hm1.entrySet())
        {
            // 495
            //9494
            int key=m.getKey();
            int val=m.getValue();
            if(hm2.containsKey(key) )
            {
                arr.add(key);
            }
        }

        int i=0;
        int [] finalarr= new int[arr.size()];
        for( int num:arr) finalarr[i++]=num;
        return finalarr;


    }
    public static int LinearSearch(int [] nums, int target)
    {
        int len= nums.length-1;
        for( int i=0;i<=len;i++)
        {
            if(nums[i]==target) {
                return i;
            }
        }
        return -1;

    }
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
    public static int BinarySearchcollection(int [] nums, int target)
    {
        int num=Arrays.binarySearch(nums,target);
        return num;
    }
    public static boolean CheckPalindorome(String str)
    {
        int left=0;
        int right=str.length()-1;
        while(left<right)
        {
            if(str.charAt(left) != str.charAt(right))
                return false;
            left++;
            right--;
        }
        return true;


    }
    public static int LongestPalindoromeHasMap(String str)
    {
        HashMap<Character,Integer> hm1= new HashMap<>();
        int length=0;
        boolean hasOdd= false;
        for (char c:str.toCharArray())
        {
            hm1.put(c, hm1.getOrDefault(c,0)+1);
        }
        // a 4 b 2 c 5 d1 e 2= 14
        for (int count:hm1.values())
        {
            // Taake a;; even pairs
            if(count%2==0) length+=count;
                // 4 +2+2=8
            else
                length+=count-1;
            hasOdd=true;

            // 0+ 4
            //8+4 =13

        }
        if(hasOdd)  length+=1;
        return length;
    }
    public static int LongestPalindoromeHasset(String str)
    {
        HashSet<Character> hm1= new HashSet<>();
        int length=0;
        for( char c:str.toCharArray())
        {
            if( hm1.contains(c)) {
                length += 2;
                hm1.remove(c);
            }
            else hm1.add(c);
        }
        if(!hm1.isEmpty())
            length++; //length++

        return length;
    }
    public static boolean ContainsDuplicatestwo(int [] nums1,int target)
    {
        Boolean flag=false;
        int k=target;
        for( int i=0;i<nums1.length;i++)
        {
            for( int j=0;j<nums1.length;j++)
                if(i !=j)
                {
                    if(nums1[i]==nums1[j] && Math.abs(i - j) <= k ) flag=true;
                }
        }
        return flag;
    }
    public static boolean ContainsDuplicatestwoHashMap(int [] nums1,int target)
    {
        HashMap<Integer,Integer> hm1= new HashMap<>();
        for( int i=0;i<nums1.length;i++) //2334 2,0 3,0 ,3
        {
            if ( hm1.containsKey(nums1[i]))
            {
                int j=hm1.get(nums1[i]);
                if( Math.abs(i-j)<=target) return true;
            }
            else hm1.put(nums1[i],i);
        }
        return false;
    }

    public static String reverseString(char[] s)
    {
            StringBuffer sc = new StringBuffer();
            for(char c:s)
                sc.append(c);
        //    sc.reverse();
            char [] rv = new char[s.length];
            int len=s.length-1;
           int i=0;
          for(int j=len;j>=0;j--)
          {
              rv[i]=s[j];
           //   System.out.println(rv[i]);
              i++;
          }



        return sc.reverse().toString();
      //return rv.;

    }

     /**
     public void funcreverseStringvoid(char[] s)
    {
        int left=0,right=s.length-1;

        while(left<=right)
        {
            char temp=s[left];
            s[left]=s[right];
            s[right]=temp;
            left++;
            right--;
        }// this program will not run because there are two void in this program
    }
     **/

    /**
        public void StackReverse(char[] s)

        {
            Stack<Character> hm1 = new Stack<>();
            for( char c:s)
                hm1.push(c);
            int i=0;

            for( int i=0;i<s.length;i++) {
                s[i] = hm1.pop();
            }

           int len=s.length-1;


             while(len>=0) {
                s[i] = hm1.pop();
                len--;
                i++;
            }
     }
             **/


   public static String ReverseWordsStack(String s)
{
    StringBuffer sb= new StringBuffer();
    Stack<String> hm1= new Stack<>();
    String[] words = s.trim ().split ("\\s+");

    for(String word:words)
    {
        hm1.push(word);
    }
    while (!hm1.isEmpty())
    {
        sb.append(hm1.pop()).append(" ");
    }
    return sb.toString().trim();

}

    public static String ReverseWordsString(String s)
    {
        String[] words = s.trim().split("\\s+");
        StringBuffer sb=new StringBuffer();
        int len=words.length-1;
        for( int i =len;i>=0;i--)
        {
            sb.append(words[i]);
            if(i>0) sb.append(' ');
            //sb.append(' ');
        }
        return sb.toString();

        //return sb.toString().trim();
    }
    public static boolean isValid(String s)
     {
    }

        public static void main(String[] args) {
     //   int[] nums = {1, 3, 5, 7, 9, 11, 15, 19, 25};
        //   Arrays.sort(nums);
        // String s = "lkmeleetcode";
       String s ="madam";
      //  String s="  hello world  ";
        //char[] s = {'h','e','l','l','o'};

    //    int target = 3;
    //    int [] nums1= {3,1,2,1};
      //  int [] nums2= {1,1};
        //  String s = "abcd", t = "abcde";
        //  System.out.println((SingleIntegerHashmap(nums)));
        // System.out.println((SingleIntegerBruteForce(nums)));
        //   System.out.println((containsDuplicate(nums)));
        //  System.out.println(Arrays.toString(twoSum(nums, target)));
        // System.out.println(firstUniqChar(s));
        //System.out.println(findTheDifference(s,t));
        //   System.out.println(LinearSearch(nums,target));
        //  System.out.println(BinarySearch(nums,target));
        // System.out.println(BinarySearchcollection(nums,target));
        //  System.out.println(LongestPalindoromeHasMap(s));
        //     System.out.println(ContainsDuplicatestwo(nums1,target));
        // System.out.println(ContainsDuplicatestwoHashMap(nums1,target));

      //  System.out.println(funcreverseStringvoid(s));
       // System.out.println(ReverseWordsStack(s));








        //  System.out.println(Arrays.toString(intersectionHasMap(nums1,nums2)));
        // System.out.println(Arrays.toString(intersectionHasMapthree(nums1,nums2)));




    }
}