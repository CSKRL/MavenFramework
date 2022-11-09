package training;

public class Javachallange {
	public static void main(String[] args) {
		int[] nums= {2,3,1,2};
		for(int i=0;i<nums.length;i++) {
			for(int j=i+1;j<nums.length;j++) {
				if((nums[i]== nums[j])) {
					System.out.println(nums[i]);
					
				}
			}
		}
		
	}

}
/*
 * Given a non-empty array of integers nums, every element appears twice except
 * for one. Find that single one.
 * 
 * You must implement a solution with a linear runtime complexity and use only
 * constant extra space.
 * 
 * 
 * 
 * Example 1:
 * 
 * Input: nums = [2,2,1] Output: 1 Example 2:
 * 
 * Input: nums = [4,1,2,1,2] Output: 4 Example 3:
 * 
 * Input: nums = [1] Output: 1
 */