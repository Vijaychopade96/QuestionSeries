package ProgrammingQ1.Q3;

import java.util.Arrays;

public class TwoSum2 {

    public static int[] twoSum(int [] nums,int target){


        for (int i=0;i< nums.length;i++){
            for (int j=i+1;j< nums.length;j++){
                if (nums[i]+nums[j]==target){
                    return new int[]{i,j};
                }
            }
        }
        throw new IllegalArgumentException("No Two sum Solucation");
    }

    public static void main(String[] args) {

            int[] nums1 = {2, 7, 11, 15};
            int target1 = 9;
            int[] result1 = twoSum(nums1, target1);
            System.out.println(Arrays.toString(result1)); // Output: [0, 1]

            int[] nums2 = {3, 2, 4};
            int target2 = 6;
            int[] result2 = twoSum(nums2, target2);
            System.out.println(Arrays.toString(result2)); // Output: [1, 2]

            int[] nums3 = {3, 3};
            int target3 = 6;
            int[] result3 = twoSum(nums3, target3);
            System.out.println(Arrays.toString(result3)); // Output: [0, 1]
    }
}

