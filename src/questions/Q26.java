package questions;

import java.util.Arrays;

/**
 * 26.Remove Duplicates from Sorted Array
 */
public class Q26 {
	public static void main(String[] args) {
		int[] nums = {0,0,1,1,1,2,2,3,3,4};
		System.out.println(removeDuplicates(nums));
		System.out.println(Arrays.toString(nums));
	}
	
	public static int removeDuplicates(int[] nums) {
        int i = nums.length > 0 ? 1 : 0;
	    for (int n : nums) {
	    	if(n > nums[i-1]) {
	    		nums[i] = n;
	    		i++;
	    	}
	    }
	    return i;
    }
}
