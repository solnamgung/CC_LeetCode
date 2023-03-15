package Array;
import java.util.HashMap;


/**
 * @param {number[]} nums = [2,7,11,15];
 * @param {number} target = 17;
 * @return {number[]}
 */

/**
 * Given an array of integers nums and an integer target, 
 * return indices of the two numbers such that they add up to target.
 * You may assume that each input would have exactly one solution, 
 * and you may not use the same element twice.
 * You can return the answer in any order.
 */


class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        
    	HashMap<Integer, Integer> tracker = new HashMap<Integer, Integer>();
        for(int i = 0; i < nums.length; i++){
            if(tracker.containsKey(nums[i])){
                int left = tracker.get(nums[i]);
                return new int[]{left, i};
            }else
                tracker.put(target - nums[i], i);
        }
        return new int[2];
    }
}