package questions;

import java.util.Arrays;

/**
 * 34.Find First and Last Position of Element in Sorted Array
 */
public class Q34 {

	public static void main(String[] args) {
		int[] nums = {5,7,7,8,8,10};
		int target = 6;
		System.out.println(Arrays.toString(searchRange(nums, target)));
	}
	
	public static int[] searchRange(int[] nums, int target) {
		int[] index = {-1,-1};
		
		for(int i=0; i<nums.length; i++) {
			if(nums[i] == target) {
				index[0] = i;
				break;
			}
		}
		
		for(int i=nums.length-1; i>=0; i--) {
			if(nums[i] == target) {
				index[1] = i;
				break;
			}
		}
		
        return index;
    }
}
