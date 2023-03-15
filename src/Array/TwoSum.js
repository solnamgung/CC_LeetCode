
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

	function twoSum(nums, target) {
		
		const map = new Map();
		
		for(let i = 0; i < nums.length; i++) {
			let result = target - nums[i];
			if(map.has(result)) {
				return [map.get(result) , i]
			}
			
			map.set(nums[i] , i);
		}
		
		throw new Error ("It's error !");
	}

