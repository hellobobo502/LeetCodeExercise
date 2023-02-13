package questions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 1.TwoSum
 */
public class Q1 {
	public static void main(String[] args) {
		int[] nums = {2,7,11,15};
		int target = 9;
		System.out.println(Arrays.toString(twoSum(nums, target)));
	}
	
	public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        for(int i=0; i<nums.length; i++){
            int diff = target - nums[i];
            Integer mapKey = map.get(diff);
            if(mapKey != null) {
            	result[0] = mapKey;
            	result[1] = i;
            	break;
            }else {
            	map.put(nums[i], i);
            }
        }
        
        return result;
    }
}
