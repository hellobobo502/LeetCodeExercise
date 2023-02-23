package questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 15.3Sum
 */
public class Q15 {

	public static void main(String[] args) {
		int[] nums = {-1,0,1,2,-1,-4};
		System.out.println(threeSum(nums));
	}

	public static List<List<Integer>> threeSum(int[] nums) {
		Arrays.sort(nums);
		//System.out.println(Arrays.toString(nums));
		
		List<List<Integer>> triplet = new ArrayList<>();
		Set<List<Integer>> set = new HashSet<>();
		
		int target = 0;
		for(int i=0; i<nums.length; i++) {
			int j = i+1;
			int k = nums.length-1;
			
			while(j < k) {
				int sum = nums[i] + nums[j] + nums[k];
				if(sum == target) {
					set.add(Arrays.asList(nums[i], nums[j], nums[k]));
					j++;
					k--;
				}else if(sum > target) {
					k--;
				}else {
					j++;
				}
			}
		}
		
		triplet.addAll(set);
		return triplet;
	}
}
