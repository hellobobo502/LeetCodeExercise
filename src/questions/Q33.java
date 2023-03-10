package questions;

/**
 * 33.Search in Rotated Sorted Array
 */
public class Q33 {

	public static void main(String[] args) {
		int[] nums = {4,5,6,7,0,1,2};
		int target = 7;
		System.out.println(search(nums, target));
	}
	
	public static int search(int[] nums, int target) {
        int i = 0;
        int j = nums.length-1;
        
        while(i <= j) {
        	if(nums[i] == target) return i;
        	else if(nums[j] == target) return j;
        	
        	i++;
        	j--;
        }
        
        return -1;
    }
}
