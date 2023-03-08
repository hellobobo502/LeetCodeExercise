package questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/**
 * 18.4Sum
 */
public class Q18 {

	public static void main(String[] args) {
//		int[] nums = {1000000000,1000000000,1000000000,1000000000};
		int[] nums = {1,0,-1,0,-2,2};
//		int target = -294967296;
		int target = 0;
		System.out.println(fourSum(nums, target));
	}

	public static List<List<Integer>> fourSum(int[] nums, int target) {
//        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
//        if(nums[0] > 0 && target < 0) {
//        	return list;
//        }
        
        Set<List<Integer>> set = new LinkedHashSet<>();
        for(int i=0, L=nums.length; i<L-3; i++) {
        	for(int j=L-1; j>i+2; j--) {
        		int rem = target-nums[i]-nums[j];
        		int lo = i+1, hi=j-1;
        		while(lo < hi) {
        			int sum = nums[lo] + nums[hi];
        			if(sum > rem) 
        				--hi;
        			else if(sum < rem)
        				++lo;
        			else {
        				long sumCheckOverflow = (long)nums[i] + (long)nums[lo] + (long)nums[hi] + (long)nums[j];
        				if(sumCheckOverflow > Integer.MAX_VALUE || sumCheckOverflow < Integer.MIN_VALUE) {
        					break;
        				}
        				
        				set.add(Arrays.asList(nums[i], nums[lo], nums[hi], nums[j]));
            			while(++lo <= hi && nums[lo-1] == nums[lo])
            				continue;
            			while(--hi >= lo && nums[hi] == nums[hi+1])
            				continue;
        			}
        		}
        		
        		while(j >= 1 && nums[j] == nums[j-1])
        			--j;
        	}
        	while(i < L-1 && nums[i] == nums[i+1])
        		++i;
        }
        
        List<List<Integer>> list = new ArrayList<>();
        list.addAll(set);
        return list;
    }
}
