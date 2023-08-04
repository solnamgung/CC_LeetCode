package Array;
import java.util.HashMap;
import java.util.Map;

/**
 * @param {number[]} nums = [2,7,11,15];
 * @param
 *  {number} target = 17;
 * @return {number[]}
 */


/**
 * Given an array of integers nums and an integer target, 
 * return indices of the two numbers such that they add up to target.
 * You may assume that each input would have exactly one solution, 
 * and you may not use the same element twice.
 * You can return the answer in any order.
 */

import java.util.Arrays;

class Solution {

    public int[] twoSum(int[] nums, int target) {

        for(int i = 0; i < nums.length; i++) {
            for(int j = i+1; j < nums.length; j++) {
                if(nums[i] + nums[j] == target ) {
                    return new int[] {i , j};
                }
            }
        }

        return new int[] {};

    }

    public static void main(String[] args) {

        int nums2[] = {2,7,11,15};
        int target2 = 9;

        Solution solution = new Solution();

        int[] result = solution.twoSum(nums2, target2);
        System.out.println(Arrays.toString(result));
    }
}

	public class twoSum {
		
		public int[] twoSum (int[] nums, int target) {
			
			Map<Integer, Integer> map = new HashMap<>();
			int[] result = new int[2];
			
			for(int i=0; i < nums.length; i++) {
				if(map.containsKey(target - nums[i])) {
					result[1] = i;
					result[0] = map.get(target-nums[i]);
					
					return result;
				}
					map.put(nums[i], i);
			}
			return result ;
		}
	}



//	class twoSum {
//	    public int[] twoSum(int[] nums, int target) {
//	        int n=nums.length;
//	        Map<Integer,Integer> map=new HashMap<>();
//	        int[] result=new int[2];
//	        for(int i=0;i<n;i++){
//	            if(map.containsKey(target-nums[i])){
//	                result[1]=i;
//	                result[0]=map.get(target-nums[i]);
//	                return result;
//	            }
//	            map.put(nums[i],i);
//	        }
//	        return result;
//	    }
//	}
	

//	
//	class twoSum {
//	    public int[] twoSum(int[] nums, int target) {
//	        int n = nums.length;
//	        int[] numsCopy = Arrays.copyOf(nums, n);
//	        Arrays.sort(numsCopy);
//	        int i = 0;
//	        int j = n - 1;
//	        int[] result = new int[2];
//	        while (i < j) {
//	            int sum = numsCopy[i] + numsCopy[j];
//	            if (sum == target) {
//	                result[0] = findIndex(nums, numsCopy[i], -1);
//	                result[1] = findIndex(nums, numsCopy[j], result[0]);
//	                return result;
//	            } else if (sum < target) {
//	                i++;
//	            } else {
//	                j--;
//	            }
//	        }
//	        return result;
//	    }
//	    
//	    private int findIndex(int[] nums, int target, int exclude) {
//	        for (int i = 0; i < nums.length; i++) {
//	            if (nums[i] == target && i != exclude) {
//	                return i;
//	            }
//	        }
//	        return -1;
//	    }
//	}
//
//	
//	
//	class twoSum {
//	    public int[] twoSum(int[] nums, int target) {
//	        int n = nums.length;
//	        Map<Integer, Integer> map = new HashMap<>();
//	        int[] result = new int[2];
//	        for (int i = 0; i < n; i++) {
//	            int complement = target - nums[i];
//	            if (map.containsKey(complement)) {
//	                result[0] = map.get(complement);
//	                result[1] = i;
//	                return result;
//	            }
//	            map.put(nums[i], i);
//	        }
//	        return result;
//	    }
//	}
//
