package leetcode;

import java.util.Arrays;

public class RemoveDuplicateFromSortedArray {

    public static void main(String[] args) {

        int[] nums = {1, 1, 1, 2, 2, 3};

        System.out.println(removeDuplicates(nums));
    }

    public static int removeDuplicates(int[] nums) {
        Arrays.stream(nums).sorted();
        int count = 0;
        int minusCount = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i + 1 != nums.length) {
                if (nums[i] == nums[i + 1]) {
                    count += 1;
                }
                if (count > 1) {
                    nums[i + 1] = Integer.MAX_VALUE;
                    minusCount += 1;
                    count = 0;
                }
            }
        }
        Arrays.stream(nums).sorted();
        return nums.length - minusCount;
    }
}
