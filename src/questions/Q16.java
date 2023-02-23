package questions;

import java.util.Arrays;

/**
 * 16.3Sum Closest
 */
public class Q16 {

	public static void main(String[] args) {
		int[] nums = {1,5,4,-1,-5,9,8};
		int target = 5;
		System.out.println(threeSumClosest(nums, target));
	}

	public static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        
        int closest = 0;
        for(int i=0; i<nums.length; i++) {
        	int j = i+1;
        	int k= nums.length-1;
        	
        	while(j < k) {
        		int sum = nums[i] + nums[j] + nums[k];
        		if(sum == target) {
        			return sum;
        		}else if(sum > target) {
        			k--;
        		}else {
        			j++;
        		}
        		
        		int diff = Math.abs(target - sum);
        		int preDiff = Math.abs(target - closest);
        		if(closest == 0 || diff < preDiff) {
        			closest = sum;
        		}
        	}
        }
        return closest;
    }
}
