
/**
 * @param {number[]} nums = [2,7,11,15];
 * @param {number} target = 9;
 * @return {number[]}
 */

	function twoSum(nums, target) {
	    const map = new Map();
	    for (let i = 0; i < nums.length; i++) {
	        const complement = target - nums[i];
	        if (map.has(complement)) {
	            return [map.get(complement), i];
	        }
	        map.set(nums[i], i);
	    }
	    throw new Error("No two sum solution");
	}
