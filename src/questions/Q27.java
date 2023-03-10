package questions;

import java.util.Arrays;

/**
 * 27.Remove Element
 */
public class Q27 {
	public static void main(String[] args) {
		int[] nums = {0,1,2,2,3,0,4,2};
		int val = 2;
		System.out.println(removeElement(nums, val));
		System.out.println(Arrays.toString(nums));
	}
	
	public static int removeElement(int[] nums, int val) {
        int i = 0;
	    for (int n : nums) {
	    	if(n != val) {
	    		nums[i] = n;
	    		i++;
	    	}
	    }
	    return i;
    }
}
