import java.util.*;

public class TwoSumTwoPointers {

    public static List<List<Integer>> findPairs(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();

        // sort the array
        Arrays.sort(nums);

        int left = 0;
        int right = nums.length - 1;

        // two pointers
        while (left < right) {
            int sum = nums[left] + nums[right];

            if (sum == target) {
                result.add(Arrays.asList(nums[left], nums[right]));
                
                left++;
                right--;

                // skip duplicates
                while (left < right && nums[left] == nums[left - 1]) {
                    left++;
                }

                while (left < right && nums[right] == nums[right + 1]) {
                    right--;
                }
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        return result;
    }

    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4};
        int target = 5;

        System.out.println(findPairs(nums, target));
    }
}
