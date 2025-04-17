
    import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

    public class Leetcode_350_intersection_of_two_arrays {
        public static int[] intersectionTwo(int[] arr1, int[] arr2) {
            // Create a frequency map for the first array
            HashMap<Integer, Integer> freqMap = new HashMap<>();
            ArrayList<Integer> result = new ArrayList<>();

            // Populate the frequency map for arr1
            for (int num : arr1) {
                freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
            }

            // Find the intersection with arr2
            for (int num : arr2) {
                if (freqMap.containsKey(num) && freqMap.get(num) > 0) {
                    result.add(num);
                    freqMap.put(num, freqMap.get(num) - 1); // Decrease the frequency
                }
            }

            // Convert the ArrayList to an array and return
            return result.stream().mapToInt(Integer::intValue).toArray();
        }

        public static void main(String[] args) {
            int[] arr1 = {1, 2, 4, 6};
            int[] arr2 = {2, 2, 5, 8};
            System.out.println(Arrays.toString(intersectionTwo(arr1, arr2)));
        }
    }


