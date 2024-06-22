package ArraysAndStrings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ZeroSumPairs {
    public List<List<Integer>> findZeroSumPairs(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        if (nums == null || nums.length < 2) {
            return result;
        }

        Arrays.sort(nums); // sort the array

        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int sum = nums[left] + nums[right];

            if (sum == 0) {
                result.add(Arrays.asList(nums[left], nums[right]));
                left++;
                right--;
            } else if (sum < 0) {
                left++;
            } else {
                right--;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        ZeroSumPairs instance = new ZeroSumPairs();
        int[] nums = {3, -3, -3, 3, -2, 2};
        System.out.println(instance.findZeroSumPairs(nums)); // print the result
    }
}